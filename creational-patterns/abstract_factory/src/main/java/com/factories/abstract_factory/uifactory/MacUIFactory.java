package com.factories.abstract_factory.uifactory;

import com.factories.abstract_factory.os.mac.MacButton;
import com.factories.abstract_factory.os.mac.MacTextBox;

public class MacUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public TextBox createTextBox() {
        return new MacTextBox();
    }
}
