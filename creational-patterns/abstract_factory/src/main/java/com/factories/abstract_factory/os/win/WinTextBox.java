package com.factories.abstract_factory.os.win;

import com.factories.abstract_factory.uifactory.TextBox;

public class WinTextBox implements TextBox {
    @Override
    public void paint() {
        System.out.println("Windows text box");
    }
}
