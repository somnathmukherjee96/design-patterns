package com.som.vendingstates;

import com.som.VendingMachine;

public interface State {
    void clickOnInsertMoneyButton(VendingMachine vendingMachine) throws Exception;
    void insertMoney(VendingMachine vendingMachine, double amount) throws Exception;
    void clickOnProductSelectionButton(VendingMachine vendingMachine) throws Exception;
    void chooseProduct(VendingMachine vendingMachine, int productCode) throws Exception;
    void getChange(double money) throws Exception;
    void getRefund(VendingMachine vendingMachine) throws Exception;
    void dispenseProduct(VendingMachine vendingMachine, int productCode) throws Exception;
}
