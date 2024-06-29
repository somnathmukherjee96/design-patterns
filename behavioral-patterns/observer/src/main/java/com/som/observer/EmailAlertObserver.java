package com.som.observer;

public class EmailAlertObserver implements NotificationAlertObserver{
    @Override
    public void update(int stock) {
        System.out.println("Hurry up!"+ stock+" new stock added");
    }
}
