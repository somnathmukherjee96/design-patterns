package com.factories.abstract_factory;

import com.factories.abstract_factory.uifactory.Button;
import com.factories.abstract_factory.uifactory.TextBox;
import com.factories.abstract_factory.uifactory.UIFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
		UIFactory winFactory = GUIAbstractFactory.createUIFactory("WIN");
		Button button = winFactory.createButton();
		TextBox textBox = winFactory.createTextBox();
		button.paint();
		textBox.paint();
	}
}
