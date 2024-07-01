package com.som;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<Integer, Product> inventory;

    public Inventory(int itemCount) {
        inventory = new HashMap<>(itemCount);
        initializeEmptyInventory(itemCount);
    }

    private void initializeEmptyInventory(int itemCount) {
        int startCode = 101;
        for(int i=0;i< itemCount;i++){
            Product product = new Product();
            product.setSoldOut(true);
            inventory.put(startCode, product);
            startCode++;
        }
    }
    public Map<Integer, Product> getInventory() {
        return inventory;
    }

    public void setInventory(Map<Integer, Product> inventory) {
        this.inventory = inventory;
    }

    public void addItem(Product product, int code) {
        if(inventory.containsKey(code)){
            Product existingProduct = inventory.get(code);
            if(existingProduct.isSoldOut()){
                existingProduct.setSoldOut(false);
                //replace with new Product
                inventory.put(code, product);
            } else throw new UnsupportedOperationException("Already item is present");
        } else throw new IllegalArgumentException("Invalid code");

    }

    public Product getItem(int code) throws Exception {
        if(inventory.containsKey(code)){
            Product product = inventory.get(code);
            if(!product.isSoldOut()) return product;
            else throw new Exception("Item is sold out");
        }
        throw new IllegalArgumentException("Invalid code");
    }
    public void markItemSoldOut(int code){
        Product product = inventory.get(code);
        product.setSoldOut(true);
    }
}
