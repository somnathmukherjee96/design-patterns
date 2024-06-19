package com.factories.abstract_factory.os.mac;

import com.factories.abstract_factory.uifactory.TextBox;

public class MacTextBox implements TextBox {
    @Override
    public void paint() {
        System.out.println("Mac text box");
    }
}
