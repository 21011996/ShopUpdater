package main;

import org.ItemDto;

import java.util.concurrent.TimeUnit;

import static main.Main.code_to_item;
import static main.Main.items;
import static main.Main.items_to_add;
import static main.Service.addItem;

/**
 * Created by ilya2_000 on 06.08.2016.
 */
public class CGCThread implements Runnable {
    private PriceUpdater priceUpdater;
    private AmountUpdater amountUpdater;

    CGCThread(PriceUpdater priceUpdater, AmountUpdater amountUpdater) {
        this.priceUpdater = priceUpdater;
        this.amountUpdater = amountUpdater;
    }

    @Override
    public void run() {
        while (true) {
            try {
                TimeUnit.MINUTES.sleep(1);
            } catch (InterruptedException e) {
                return;
            }
            if (!priceUpdater.isActive() && !amountUpdater.isActive()) {
                System.out.println("CGC: adding items " + items_to_add.size());
                for (ItemDto item : items_to_add) {
                    try {
                        addItem(item);
                        code_to_item.put(item.getId(), item);
                    } catch (Exception e) {
                        System.out.println("CGC:" + e.getMessage());
                    }
                }
                items_to_add.clear();
                System.gc();
            }
        }
    }
}
