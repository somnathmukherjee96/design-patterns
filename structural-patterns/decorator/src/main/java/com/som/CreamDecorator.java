package com.som;

public class CreamDecorator extends CoffeeDecorator{
    public CreamDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription(){
        return decoratedCoffee.getDescription()+", Cream";
    }

    @Override
    public double getCost(){
        return decoratedCoffee.getCost()+2.0;
    }
}
