package com.som;

public class Product {
    private ProductType type;
    private double price;
    private boolean soldOut;


    public ProductType getType() {
        return type;
    }

    public void setType(ProductType type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isSoldOut() {
        return soldOut;
    }

    public void setSoldOut(boolean soldOut) {
        this.soldOut = soldOut;
    }

    @Override
    public String toString() {
        return "Item{" +
                "type=" + type +
                ", price=" + price +
                ", soldOut=" + soldOut +
                '}';
    }
}
