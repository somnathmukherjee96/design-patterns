package com.som.Invoker;

import com.som.command.ICommand;

public class RemoteControl {
    private ICommand command;
    private ICommand lastCommand;
    public void setCommand(ICommand command){
        this.command=command;
    }
    public void pressButton(){
        command.execute();
        lastCommand=command;
    }

    public void pressUndo(){
        if(lastCommand!=null) lastCommand.undo();
    }
}
