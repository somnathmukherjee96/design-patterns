package com.som.observable;

import com.som.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Observable{
    private List<Observer> observers;
    private String latestNews;
    public NewsAgency(){
        this.observers = new ArrayList<>();
    }
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer:observers)
            observer.update(latestNews);
    }
    public void setLatestNews(String latestNews){
        this.latestNews=latestNews;
        notifyObservers();
    }
}
