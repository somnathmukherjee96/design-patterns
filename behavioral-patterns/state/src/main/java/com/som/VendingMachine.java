package com.som;

import com.som.vendingstates.IdleState;
import com.som.vendingstates.State;

public class VendingMachine {
    private State vendingMachineState;
    private Inventory inventory;
    private double totalMoney;
     public VendingMachine(){
         vendingMachineState = new IdleState(this);
         inventory = new Inventory(10);
         totalMoney =0.0;
     }

    public State getVendingMachineState() {
        return vendingMachineState;
    }

    public void setVendingMachineState(State vendingMachineState) {
        this.vendingMachineState = vendingMachineState;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }
}
