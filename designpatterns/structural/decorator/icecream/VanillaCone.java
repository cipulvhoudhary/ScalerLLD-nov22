package com.designpatterns.structural.decorator.icecream;

public class VanillaCone implements Base {

    int cost = 15;

    IceCream ic;

    public VanillaCone() {}

    public VanillaCone(IceCream ic) {
        this.ic = ic;
    }


    @Override
    public int getCost() {
        if(ic == null) {
            return cost;
        }
        return ic.getCost() + cost;
    }

    @Override
    public String getDescription() {
        if(ic == null) {
            return "VanillaCone Icecream, ";
        }
        return ic.getDescription() + "VanillaCone Icecream, ";
    }


}
