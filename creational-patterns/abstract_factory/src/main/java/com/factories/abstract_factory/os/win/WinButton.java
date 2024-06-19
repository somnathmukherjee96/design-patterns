package com.factories.abstract_factory.os.win;

import com.factories.abstract_factory.uifactory.Button;

public class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("Windows button");
    }
}
