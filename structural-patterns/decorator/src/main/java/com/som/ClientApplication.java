package com.som;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
		//start with a simple coffee
		Coffee coffee = new SimpleCoffee();
		System.out.println(coffee.getDescription()+" $"+coffee.getCost());

		//Add milk to the coffee
		coffee = new MilkDecorator(coffee);
		System.out.println(coffee.getDescription()+" $"+coffee.getCost());

		//Add sugar to the coffee
		coffee = new SugarDecorator(coffee);
		System.out.println(coffee.getDescription()+" $"+coffee.getCost());

		//Add cream to the coffee
		coffee = new CreamDecorator(coffee);
		System.out.println(coffee.getDescription()+" $"+coffee.getCost());
	}

}
