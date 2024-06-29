package com.som;

import com.som.facade.HomeTheaterFacade;
import com.som.subsystem.DVDPlayer;
import com.som.subsystem.SoundSystem;
import com.som.subsystem.TV;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FacadeApplication {

	public static void main(String[] args) {
		SpringApplication.run(FacadeApplication.class, args);

		//creating the subsystem components
		TV tv = new TV();
		DVDPlayer dvdPlayer = new DVDPlayer();
		SoundSystem soundSystem = new SoundSystem();

		//creating the Facade
		HomeTheaterFacade homeTheater = new HomeTheaterFacade(tv,dvdPlayer,soundSystem);

		//using the Facade to watch a movie
		homeTheater.watchMovie("Inception");
		System.out.println();
		//using the Facade to end the movie
		homeTheater.endMovie();
	}

}
