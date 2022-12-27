package com.designpatterns.structural.decorator.icecream;

public class ChocoSyrup implements AddOns {
    int cost = 5;

    IceCream ic;

    public ChocoSyrup(IceCream ic) {
        this.ic = ic;
    }

    @Override
    public int getCost() {
        return ic.getCost() + cost;
    }

    @Override
    public String getDescription() {
        return ic.getDescription() + "Delicious Chocolate syrup, ";
    }
}
