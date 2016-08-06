package main;

import org.*;

import javax.xml.rpc.ServiceException;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static main.Translit.toTranslit;

/**
 * Created by ilya2_000 on 05.08.2016.
 */
public class Main {
    static ArrayList<String> categories_of_intrest = new ArrayList<>(Arrays.asList("Бумага", "Картриджи лазерные", "Картриджи струйные", "СНПЧ (сист.непрер.подачи чернил)", "Тонеры", "Чернила", "Чипы и Программаторы"));

    static HashMap<String, ItemDto> code_to_item;
    static ArrayList<ItemDto> items;
    static ArrayList<ItemDto> items_to_add;
    static double lastCourse;

    public static void main(String[] argv) {
        if (argv.length > 0) {
            if (argv[0].equals("update")) {
                System.out.println("Initialization of items base");
                initBase();
                lastCourse = getDollar();
                System.out.println("Syncing cs-cart base with BTT");
                AmountUpdater amountUpdater;
                PriceUpdater priceUpdater;
                ExecutorService executorService = Executors.newFixedThreadPool(3);
                System.out.println("Starting price updater daemon");
                priceUpdater = new PriceUpdater(false);
                executorService.execute(priceUpdater);
                System.out.println("Starting amount updater daemon");
                amountUpdater = new AmountUpdater(false);
                executorService.execute(amountUpdater);
                CGCThread cgcThread = new CGCThread(priceUpdater, amountUpdater);
                executorService.execute(cgcThread);
                executorService.shutdown();
                while (!executorService.isTerminated()) {
                }
            } else if (argv[0].equals("getCSV")) {
                getCSV();
                System.out.println("Done");
            }
        }
    }

    private static void initBase() {
        items_to_add = new ArrayList<>();
        code_to_item = new HashMap<>();
        items = getItems();
        if (items != null) {
            for (ItemDto item : items) {
                if (categories_of_intrest.contains(item.getRootGroup())) {
                    code_to_item.put(item.getId(), item);
                }
            }
        }
        System.gc();
    }

    static synchronized ArrayList<ItemDto> getItems() {
        try {
            PortalServiceLocator locator = new PortalServiceLocator();
            IPortalService service = locator.getBasicHttpBinding_IPortalService();
            String LOGIN_BTT = "nev-593";
            String PASSWORD_BTT = "5ndu8l2mw3";
            ArrayList<ItemDto> answer = new ArrayList<>();
            int count = 1;
            int i = 0;
            while (count>0) {
                count = answer.size();
                answer.addAll(Arrays.asList(service.getItemPortion(LOGIN_BTT,PASSWORD_BTT,i*250,(i+1)*250-1).getItems()));
                count = answer.size() - count;
                i++;
                System.gc();
            }
            return answer;
        } catch (ServiceException e) {
            System.out.println("Can't reach BTT server");
            return null;
        } catch (RemoteException e) {
            System.out.println("Can't get items from BTT server");
            return null;
        } finally {
            System.gc();
        }
    }

    private static void getCSV() {
        String header = "Product code;Language;Product id;Category;List price;Price;Weight;Quantity;Min quantity;Shipping freight;Date added;Downloadable;Files;Ship downloadable;Inventory tracking;Free shipping;Zero price action;Thumbnail;Detailed image;Product name;Description;Meta keywords;Meta description;Search words;Page title;Taxes;Features;Options;Secondary categories;Pay by points;Override points;Override exchange rate;SEO name;Short description;Status";
        double dollar_CB = getDollar();
        if (dollar_CB == 0.0) {
            dollar_CB = 65.56;
        }
        int i = 0;
        items = getItems();
        if (items != null) {
            try {
                System.out.println("Writing \"Items.csv\"");
                PrintStream printStream = new PrintStream(new FileOutputStream("Items.csv"));
                printStream.println(header);
                for (ItemDto item : getItems()) {
                    if (categories_of_intrest.contains(item.getRootGroup())) {
                        i++;
                        double price = item.getPrice().doubleValue() * dollar_CB * 1.2;
                        String status = "A";
                        if (price <= 0) {
                            status = "D";
                            price = 0;
                        }
                        printStream.println(item.getId() + ";ru;" + i + ";" + item.getRootGroup() + "///" + item.getGroup() + ";0.00;" + price + ";0.00;" + item.getAvailableQuantity() + ";0;0.00;;N;;N;B;N;R;;" + item.getPhotoUrl() + ";" + item.getName() + ";" + item.getDescription() + (!(item.getCompatibility().isEmpty()) ? " " + item.getCompatibility().replace(';', ',').replace('\n', ',') : "") + ";;;;;;;;;N;N;N;" + toTranslit(item.getName()) + ";;" + status);
                    }
                }
            } catch (Exception e) {
                System.out.println("Something went wrong, delete \"Items.csv\" and try again");
            }
        }
    }

    static double getDollar() {
        System.out.println("Asking for Dollar course");
        String url = "http://www.cbr.ru/scripts/XML_daily.asp";
        try {
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setDoOutput(true);
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream(), "windows-1251"));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                if (inputLine.equals("\t<Name>Доллар США</Name>")) {
                    inputLine = in.readLine();
                    break;
                }
            }
            in.close();
            return Double.parseDouble(inputLine.substring(8, 13).replace(',', '.'));
        } catch (MalformedURLException e) {
            System.out.println("CB is not responding");
        } catch (UnsupportedEncodingException e) {
            System.out.println("CB gave from encoding");
        } catch (IOException e) {
            System.out.println("Can't access CB's API");
        } finally {
            System.gc();
        }
        return 0.0;
    }
}
