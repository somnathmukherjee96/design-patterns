package com.som.vendingstates;

import com.som.VendingMachine;

public class IdleState implements State{
    public IdleState(){
        System.out.println("Currently the Vending Machine is in Idle state");
    }
    public IdleState(VendingMachine vendingMachine){
        System.out.println("Currently the Vending Machine is in Idle state");
    }
    @Override
    public void clickOnInsertMoneyButton(VendingMachine vendingMachine) {
        vendingMachine.setVendingMachineState(new HasMoneyState());
    }
    @Override
    public void insertMoney(VendingMachine vendingMachine, double amount) {
        throw new UnsupportedOperationException("You cannot insert money in idle state");
    }
    @Override
    public void clickOnProductSelectionButton(VendingMachine vendingMachine) {
        throw new UnsupportedOperationException("First you need to click on insert money button");

    }
    @Override
    public void chooseProduct(VendingMachine vendingMachine, int productCode) {
        throw new UnsupportedOperationException("You cannot insert money in idle state");
    }
    @Override
    public void getChange(double change) {
        throw new UnsupportedOperationException("You cannot get change in idle state");

    }
    @Override
    public void getRefund(VendingMachine vendingMachine) {
        throw new UnsupportedOperationException("You cannot get refund in idle state");

    }
    @Override
    public void dispenseProduct(VendingMachine vendingMachine, int productCode) {
        throw new UnsupportedOperationException("Product can't be dispensed in idle state");

    }
}
