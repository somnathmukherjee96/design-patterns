package com.som.vendingstates;

import com.som.Product;
import com.som.VendingMachine;

public class SelectionState implements State{
    public SelectionState() {
        System.out.println("Currently vending machine is in Selection State");
    }

    @Override
    public void clickOnInsertMoneyButton(VendingMachine vendingMachine) throws Exception {
        throw new UnsupportedOperationException("You are not allowed");
    }

    @Override
    public void insertMoney(VendingMachine vendingMachine, double amount) throws Exception {
        throw new UnsupportedOperationException("You are not allowed");
    }

    @Override
    public void clickOnProductSelectionButton(VendingMachine vendingMachine) throws Exception {
return;
    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int productCode) throws Exception {
        Product product = vendingMachine.getInventory().getItem(productCode);
        double paidByUser= vendingMachine.getTotalMoney();
        System.out.println("Paid by the user - "+paidByUser+", Product Price "+ product.getPrice());
        if(paidByUser< product.getPrice()){
            System.out.println("Insufficient Amount, Product price "+ product.getPrice() + " and you paid "+paidByUser);
            getRefund(vendingMachine);
            throw new Exception("Insufficient amount");
        } else if(paidByUser> product.getPrice()){
            System.out.println("You will be getting return "+(paidByUser - product.getPrice()));
            getChange(paidByUser - product.getPrice());
            vendingMachine.setVendingMachineState(new DispenseState(vendingMachine, productCode));

        }
    }

    @Override
    public void getChange(double change) throws Exception {
        System.out.println("Returning the change in the money dispense tray "+change);

    }

    @Override
    public void getRefund(VendingMachine vendingMachine) throws Exception {
        return;
    }

    @Override
    public void dispenseProduct(VendingMachine vendingMachine, int productCode) throws Exception {
    }
}
