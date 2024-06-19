package com.factories.abstract_factory.os.mac;

import com.factories.abstract_factory.uifactory.Button;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Mac button");
    }
}
