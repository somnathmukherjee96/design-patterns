package com.som.vendingstates;

import com.som.VendingMachine;

public class HasMoneyState implements State{
    private double money=0;
    public HasMoneyState(){
        System.out.println("Currently Vending Machine is in HasMoneyState");
    }
    @Override
    public void clickOnInsertMoneyButton(VendingMachine vendingMachine) throws Exception {
        return;
    }

    @Override
    public void insertMoney(VendingMachine vendingMachine, double amount) throws Exception {
        this.money=amount+money;
       vendingMachine.setTotalMoney(money);
        System.out.println("Accepted "+amount+" rupees");
    }

    @Override
    public void clickOnProductSelectionButton(VendingMachine vendingMachine) throws Exception {
        vendingMachine.setVendingMachineState(new SelectionState());
    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int productCode) throws Exception {
        throw new UnsupportedOperationException("You need to click on choose product button first");
    }

    @Override
    public void getChange(double change) throws Exception {
        throw new UnsupportedOperationException("You can't get change in has money state");
    }

    @Override
    public void getRefund(VendingMachine vendingMachine) throws Exception {
        if(vendingMachine.getTotalMoney()>0) {
            System.out.println("Refunding your money"+ vendingMachine.getTotalMoney()+"...");
            vendingMachine.setVendingMachineState(new IdleState());
        } else throw new UnsupportedOperationException("You haven't inserted any money");
    }

    @Override
    public void dispenseProduct(VendingMachine vendingMachine, int productCode) throws Exception {
    }
}
