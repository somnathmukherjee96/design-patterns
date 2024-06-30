package com.som;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    Map<Integer, Item> inventory;

    public Inventory(int itemCount) {
        inventory = new HashMap<>(itemCount);
        initializeEmptyInventory(itemCount);
    }

    private void initializeEmptyInventory(int itemCount) {
        int startCode = 101;
        for(int i=0;i< itemCount;i++){
            Item item = new Item();
            item.setSoldOut(true);
            inventory.put(startCode, item);
            startCode++;
        }
    }
    public Map<Integer, Item> getInventory() {
        return inventory;
    }

    public void setInventory(Map<Integer, Item> inventory) {
        this.inventory = inventory;
    }

    public void addItem(Item item, int code) {
        if(inventory.containsKey(code)){
            Item item1 = inventory.get(code);
            if(item1.isSoldOut()){
                item1.setSoldOut(false);
                inventory.put(code, item);
            } else throw new UnsupportedOperationException("Already item is present");
        } else throw new IllegalArgumentException("Invalid code");

    }

    public Item getItem(int code) throws Exception {
        if(inventory.containsKey(code)){
            Item item = inventory.get(code);
            if(!item.isSoldOut()) return item;
            else throw new Exception("Item is sold out");
        }
        throw new IllegalArgumentException("Invalid code");
    }
    public void markItemSoldOut(int code){
        Item item = inventory.get(code);
        item.setSoldOut(true);
    }
}
