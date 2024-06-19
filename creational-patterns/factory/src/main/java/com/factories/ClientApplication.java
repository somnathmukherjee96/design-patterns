package com.factories;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
		OS os = OSFactory.getInstance("WINDOWS", "10", "X32");
		os.changeDir();
	}

}
