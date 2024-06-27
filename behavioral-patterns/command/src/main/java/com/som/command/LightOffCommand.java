package com.som.command;

import com.som.receiver.Light;

public class LightOffCommand implements ICommand{
    private Light light;
    public LightOffCommand(Light light){
        this.light=light;
    }
    @Override
    public void execute() {
        light.turnOff();
    }

    @Override
    public void undo() {
        light.turnOn();
    }
}
