package com.designpatterns.structural.decorator.icecream;

public class OrangeCone implements Base {
    int cost = 10;

    IceCream ic;

    public OrangeCone() {}

    public OrangeCone(IceCream ic) {
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
            return "OrangeCone Icecream, ";
        }
        return ic.getDescription() + "OrangeCone Icecream, ";
    }
}
