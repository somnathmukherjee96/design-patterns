package com.som.facade;

import com.som.subsystem.DVDPlayer;
import com.som.subsystem.SoundSystem;
import com.som.subsystem.TV;

public class HomeTheaterFacade {
    private TV tv;
    private DVDPlayer dvdPlayer;
    private SoundSystem soundSystem;

    public HomeTheaterFacade(TV tv, DVDPlayer dvdPlayer, SoundSystem soundSystem){
        this.tv = tv;
        this.dvdPlayer = dvdPlayer;
        this.soundSystem = soundSystem;
    }
    public void watchMovie(String movie){
        System.out.println("Get ready to watch a movie...");
        tv.on();
        soundSystem.on();
        soundSystem.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie(){
        System.out.println("Shutting down the home theatre...");
        dvdPlayer.stop();
        dvdPlayer.off();
        soundSystem.off();
        tv.off();
    }
}
