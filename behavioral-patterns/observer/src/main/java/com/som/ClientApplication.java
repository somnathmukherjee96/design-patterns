package com.som;

import com.som.observable.IPhoneStockObservable;
import com.som.observable.NewsAgency;
import com.som.observable.Observable;
import com.som.observable.StockObservable;
import com.som.observer.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);

		//example1
		NewsAgency newsAgency = new NewsAgency();

		//create observers
		Observer mobileAppObserver = new MobileAppSubscribe("Som's Mobile");
		Observer webAppObserver = new WebAppSubscribe("http://newsportal.com");

		//subscribe to the news agency
		newsAgency.addObserver(mobileAppObserver);
		newsAgency.addObserver(webAppObserver);

		//Publish news update
		System.out.println("Publishing first news update..");
		newsAgency.setLatestNews("Latest news 1");

		System.out.println("Publishing second news..");
		newsAgency.setLatestNews("Latest news 2");

		//remove a subscriber
		newsAgency.removeObserver(mobileAppObserver);

		System.out.println("Publishing third news update...");
		newsAgency.setLatestNews("Latest news 3");

		//example2

		System.out.println("Iphone stock alert!");
		NotificationAlertObserver emailAlertObserver = new EmailAlertObserver();
		NotificationAlertObserver mobileAlertObserver = new MobileAlertObserver();

		StockObservable iphoneStock = new IPhoneStockObservable();
		iphoneStock.addObserver(emailAlertObserver);
		iphoneStock.addObserver(mobileAlertObserver);
		iphoneStock.setStock(20);

	}

}
