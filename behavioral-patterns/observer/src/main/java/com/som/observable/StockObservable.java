package com.som.observable;

import com.som.observer.NotificationAlertObserver;

public interface StockObservable {
    void addObserver(NotificationAlertObserver observer);
    void removeObserver(NotificationAlertObserver observer);
    void notifyObservers();
    void setStock(int stock);
}
