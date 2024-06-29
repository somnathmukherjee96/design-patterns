package com.som.observer;

public class MobileAppSubscribe implements Observer{
    private String name;
    public MobileAppSubscribe(String name){
        this.name=name;
    }
    @Override
    public void update(String news) {
        System.out.println(name+" (Mobile App) received news update: "+news);
    }
}
