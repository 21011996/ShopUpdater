package main;

import org.ItemDto;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.net.*;

import static main.Translit.toTranslit;

/**
 * Created by ilya2_000 on 05.08.2016.
 */
class Service {
    private static String LOGIN_IT24 = "dbenzzz@gmail.com";
    private static String PASSWORD_IT24 = "d30x9X99ZBVd5iLHK74FDZ0U4h0Pz40u";

     static synchronized String[] getID(String pcode, String information) throws Exception {
        Authenticator.setDefault(new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication (LOGIN_IT24, PASSWORD_IT24.toCharArray());
            }
        });
        try {
            String search_url = "http://it24.su/api/products?pcode=";
            HttpURLConnection connection = (HttpURLConnection) new URL(search_url + pcode).openConnection();
            connection.setRequestMethod("GET");
            int responsecode = connection.getResponseCode();
            BufferedReader input = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = input.readLine()) != null) {
                response.append(inputLine);
            }
            input.close();
            connection.disconnect();
            JSONParser parser = new JSONParser();
            JSONObject object = (JSONObject) parser.parse(response.toString());
            JSONArray array = (JSONArray) object.get("products");
            JSONObject item = (JSONObject) array.get(0);
            return new String[]{(String) item.get("product_id"),(String) item.get(information)};
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

     static synchronized void setInf(String product_id, String information, String value) throws Exception {
        Authenticator.setDefault(new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication (LOGIN_IT24, PASSWORD_IT24.toCharArray());
            }
        });
        try  {
            String update_url = "http://it24.su/api/products/";
            HttpURLConnection connection = (HttpURLConnection) new URL(update_url +product_id).openConnection();
            connection.setDoInput(true);
            connection.setDoOutput(true);
            connection.setRequestMethod("PUT");
            connection.setRequestProperty("Content-Type", "application/json");
            OutputStream output = connection.getOutputStream();
            output.write(("{\""+information+"\": "+value+"}").getBytes("UTF-8"));
            output.close();
            connection.disconnect();
            int responsecode = connection.getResponseCode();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    static synchronized void addItem(ItemDto item) throws Exception {
        Authenticator.setDefault(new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication (LOGIN_IT24, PASSWORD_IT24.toCharArray());
            }
        });
        try {
            String add_url = "http://it24.su/api/products/";
            HttpURLConnection connection = (HttpURLConnection) new URL(add_url).openConnection();
            connection.setDoInput(true);
            connection.setDoOutput(true);
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            OutputStream output = connection.getOutputStream();
            output.write(("{\n" +
                    "  \"amount\": \""+item.getAvailableQuantity()+"\",\n" +
                    "  \"category_ids\": [\n" +
                    "    162\n" +
                    "  ],\n" +
                    "  \"company_id\": 1,\n" +
                    "  \"full_description\": \""+item.getDescription() + (!(item.getCompatibility().isEmpty()) ? " " + item.getCompatibility().replace(';', ',').replace('\n', ',') : "")+"\",\n" +
                    (item.getPhotoUrl().isEmpty()?"":("  \"main_pair\": {\n" +
                    "        \"detailed\": {\n" +
                    "            \"image_path\": \""+item.getPhotoUrl()+"\"\n" +
                    "        }\n" +
                    "    },")) +
                    "  \"lang_code\": \"ru\",\n" +
                    "  \"main_category\": 162,\n" +
                    "  \"price\": \""+item.getPrice()+"\",\n" +
                    "  \"product\": \""+item.getName()+"\",\n" +
                    "  \"product_code\": \""+item.getId()+"\",\n" +
                    "  \"seo_name\": \""+toTranslit(item.getName())+"\",\n" +
                    "  \"status\": \"A\"\n" +
                    "}").getBytes("UTF-8"));
            output.close();
            connection.disconnect();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
