package com.som.subsystem;

public class DVDPlayer {
    public void on(){
        System.out.println("DVD Player is on");
    }
    public void off(){
        System.out.println("DVD Player is off");
    }
    public void play(String movie){
        System.out.println("Playing movie: "+movie);
    }
    public void stop(){
        System.out.println("DVD Player stopped");
    }
}
