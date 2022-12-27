package com.designpatterns.structural.decorator.pizza;

public class BBQChicken implements Basepizza{
    int cost = 200;
    String desc = "BBQChicken";

    public BBQChicken() {}

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return desc;
    }
}
