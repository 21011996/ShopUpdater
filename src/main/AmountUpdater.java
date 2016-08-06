package main;

import org.ItemDto;

import java.util.concurrent.TimeUnit;

import static main.Main.*;
import static main.Main.lastCourse;
import static main.Service.getID;
import static main.Service.setInf;

/**
 * Created by ilya2_000 on 05.08.2016.
 */
class AmountUpdater implements Runnable {

    private boolean singleRun;
    private boolean active;

    AmountUpdater(boolean singleRun) {
        this.singleRun = singleRun;
    }

    boolean isActive(){
        return active;
    }

    @Override
    public void run() {
        try {
            TimeUnit.MINUTES.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while (true) {
            active = true;
            System.out.println("AU: Starting amount update cycle");
            items = getItems();
            int i = 0;
            if (items != null) {
                for (ItemDto item : items) {
                    if (categories_of_intrest.contains(item.getRootGroup())) {
                        if (!item.getAvailableQuantity().equals(code_to_item.get(item.getId()).getAvailableQuantity()) || singleRun) {
                            try {
                                if (code_to_item.get(item.getId()) != null) {
                                    code_to_item.put(item.getId(), item);
                                } else {
                                    items_to_add.add(item);
                                }
                                String[] info = getID(item.getId(), "amount");
                                if (info[1]!=null && !info[1].equals(item.getAvailableQuantity().intValue()+"")) {
                                    setInf(info[0], "amount", item.getAvailableQuantity() + "");
                                    i++;
                                }
                            } catch (Exception e) {
                                System.out.println("AU:" + e.getMessage());
                            }

                        }
                    }
                }
            }
            System.out.println("AU: Updated " + i);
            System.gc();
            if (singleRun) {
                return;
            }
            active = false;
            try {
                TimeUnit.MINUTES.sleep(30);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
