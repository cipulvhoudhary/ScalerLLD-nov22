package com.designpatterns.structural.decorator.pizza;

public class Margherita implements Basepizza{
    int cost = 200;
    String desc = "Margherita";

    public Margherita() {}

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return desc;
    }
}
