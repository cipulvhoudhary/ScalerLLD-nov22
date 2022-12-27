package com.designpatterns.structural.decorator.icecream;

public class BlueberryScoop implements AddOns{
    int cost = 20;

    IceCream ic;

    BlueberryScoop(IceCream ic) {
        this.ic = ic;
    }

    @Override
    public int getCost() {
        return ic.getCost() + cost;
    }

    @Override
    public String getDescription() {
        return ic.getDescription() + "Blueberry scoop, ";
    }
}
