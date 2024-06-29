package com.som.observer;

public class WebAppSubscribe implements Observer{
    private String name;
    public WebAppSubscribe(String name){
        this.name=name;
    }
    @Override
    public void update(String news) {
        System.out.println(name+" (Web App) received news update: "+news);
    }
}
