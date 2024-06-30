package com.som.vendingstates;

import com.som.VendingMachine;

public class DispenseState implements State{
    public DispenseState(VendingMachine machine,int code) throws Exception {
        System.out.println("Currently Vending machine is in dispensing state");
        dispenseProduct(machine, code);
    }

    @Override
    public void clickOnInsertMoneyButton(VendingMachine vendingMachine) throws Exception {
        throw new UnsupportedOperationException("Not allowed in Dispense state");
    }

    @Override
    public void insertMoney(VendingMachine vendingMachine, double amount) throws Exception {
        throw new UnsupportedOperationException("Not allowed in Dispense state");
    }

    @Override
    public void clickOnProductSelectionButton(VendingMachine vendingMachine) throws Exception {
        throw new UnsupportedOperationException("Not allowed in Dispense state");

    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int productCode) throws Exception {
        throw new UnsupportedOperationException("Not allowed in Dispense state");
    }

    @Override
    public void getChange(double change) throws Exception {
        throw new UnsupportedOperationException("Not allowed in Dispense state");
    }

    @Override
    public void getRefund(VendingMachine vendingMachine) throws Exception {
        throw new UnsupportedOperationException("Not allowed in Dispense state");
    }

    @Override
    public void dispenseProduct(VendingMachine vendingMachine, int productCode) throws Exception {
        System.out.println("Dispensing the product "+productCode);
        vendingMachine.getInventory().markItemSoldOut(productCode);
        vendingMachine.setVendingMachineState(new IdleState());
    }
}
