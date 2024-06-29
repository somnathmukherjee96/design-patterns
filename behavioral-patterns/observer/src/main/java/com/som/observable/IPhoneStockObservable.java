package com.som.observable;

import com.som.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IPhoneStockObservable implements StockObservable{
    private List<NotificationAlertObserver> observerList;
    private int stock=0;
    public IPhoneStockObservable(){
        this.observerList = new ArrayList<>();
    }
    @Override
    public void addObserver(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(NotificationAlertObserver observer:observerList)
            observer.update(stock);
    }
    public void setStock(int stockAdded){
        if(stock==0 && stockAdded>0) {
            stock+=stockAdded;
            notifyObservers();
        }else {
            stock += stockAdded;
        }
    }
}
