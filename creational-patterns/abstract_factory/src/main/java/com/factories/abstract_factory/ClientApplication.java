package com.factories.abstract_factory;

import com.factories.abstract_factory.uifactory.UIFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
		UIFactory uiFactory = Factory.getUIFactory("WIN");
		uiFactory.createButton().paint();
		uiFactory.createTextBox().paint();
	}

}
