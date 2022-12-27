package com.designpatterns.structural.decorator.pizza;

public class Farmhouse implements Basepizza{
    int cost = 150;
    String desc = "Farmhouse";

    public Farmhouse() {}

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return desc;
    }
}
