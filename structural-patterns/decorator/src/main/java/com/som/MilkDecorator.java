package com.som;

public class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }
    @Override
    public String getDescription(){
        return decoratedCoffee.getDescription()+", Milk";
    }

    @Override
    public double getCost(){
        return decoratedCoffee.getCost()+1.5;
    }
}
