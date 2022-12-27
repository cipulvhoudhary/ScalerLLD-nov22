package com.designpatterns.structural.decorator.pizza;

public class Pepperoni implements Basepizza{
    int cost = 180;
    String desc = "Pepperoni";

    public Pepperoni() {}

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return desc;
    }
}
