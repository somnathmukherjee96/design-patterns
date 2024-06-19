package com.factories.abstract_factory.uifactory;

import com.factories.abstract_factory.os.win.WinButton;
import com.factories.abstract_factory.os.win.WinTextBox;

public class WindowsUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public TextBox createTextBox() {
        return new WinTextBox();
    }
}
