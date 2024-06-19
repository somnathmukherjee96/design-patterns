package com.factories.abstract_factory;

import com.factories.abstract_factory.uifactory.*;

public class GUIAbstractFactory {
    private Button button;
    private TextBox textBox;

    private GUIAbstractFactory(){};

    public static UIFactory createUIFactory(String os){
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
