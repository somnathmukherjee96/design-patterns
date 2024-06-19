package com.factories.abstract_factory;

import com.factories.abstract_factory.uifactory.*;

public class Factory {
    private Button button;
    private TextBox textBox;

    private Factory(){};

    public static UIFactory getUIFactory(String os){
        switch (os){
            case "WIN":
                return new WindowsUIFactory();
            case "MAC":
                return new MacUIFactory();
            default:
                throw new IllegalArgumentException("OS is not supported");
        }
    }
}
