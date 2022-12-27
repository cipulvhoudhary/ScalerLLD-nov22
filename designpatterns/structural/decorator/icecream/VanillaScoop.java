package com.designpatterns.structural.decorator.icecream;

public class VanillaScoop implements AddOns{
    int cost = 15;

    IceCream ic;

    VanillaScoop(IceCream ic) {
        this.ic = ic;
    }

    @Override
    public int getCost() {
        return ic.getCost() + cost;
    }

    @Override
    public String getDescription() {
        return ic.getDescription() + "Vanilla scoop, ";
    }
}
