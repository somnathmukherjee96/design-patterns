package com.som.command;

import com.som.receiver.Light;

public class LightOnCommand implements ICommand{
    private Light light;

    public LightOnCommand(Light light){
        this.light=light;
    }
    @Override
    public void execute() {
        light.turnOn();
    }

    @Override
    public void undo() {
        light.turnOff();
    }
}
