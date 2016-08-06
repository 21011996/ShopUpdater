package main;

import org.ItemDto;

import java.util.concurrent.TimeUnit;

import static main.Main.*;
import static main.Service.getID;
import static main.Service.setInf;

/**
 * Created by ilya2_000 on 05.08.2016.
 */
class PriceUpdater implements Runnable {

    private boolean singleRun;
    private boolean active;

    PriceUpdater(boolean singleRun) {
        this.singleRun = singleRun;
    }

    boolean isActive(){
        return active;
    }

    @Override
    public void run() {
        while (true) {
            active = true;
            System.out.println("PU: Starting price update cycle");
            items = getItems();
            double course = getDollar();
            int i = 0;
            if (items != null) {
                for (ItemDto item : items) {
                    if (categories_of_intrest.contains(item.getRootGroup())) {
                        if (!item.getPrice().equals(code_to_item.get(item.getId()).getPrice()) || course != lastCourse || singleRun) {
                            try {
                                i++;
                                if (code_to_item.get(item.getId()) != null) {
                                    code_to_item.put(item.getId(), item);
                                } else {
                                    items_to_add.add(item);
                                }
                                String[] info = getID(item.getId(), "price");
                                setInf(info[0], "price", item.getPrice().doubleValue() * course * 1.2 + "");
                            } catch (Exception e) {
                                System.out.println("PU:" + e.getMessage());
                            }

                        }
                    }
                }
            }
            System.out.println("PU: Updated " + i);
            System.gc();
            if (singleRun) {
                return;
            }
            active = false;
            try {
                TimeUnit.HOURS.sleep(24);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
