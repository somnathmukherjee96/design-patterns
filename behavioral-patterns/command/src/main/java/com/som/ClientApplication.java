package com.som;

import com.som.Invoker.RemoteControl;
import com.som.command.ICommand;
import com.som.command.LightOffCommand;
import com.som.command.LightOnCommand;
import com.som.receiver.Light;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
        //create receiver
        Light livingRoomLight = new Light();

        //create command objects
        ICommand lightOn = new LightOnCommand(livingRoomLight);
        ICommand lightOff = new LightOffCommand(livingRoomLight);

        //create invoker
        RemoteControl remote = new RemoteControl();

        //turn the light on
        remote.setCommand(lightOn);
        remote.pressButton();

        //undo the operation
        remote.pressUndo();

        //turn the light off
        remote.setCommand(lightOff);
        remote.pressButton();

        //undo the operation
        remote.pressUndo();
    }

}
