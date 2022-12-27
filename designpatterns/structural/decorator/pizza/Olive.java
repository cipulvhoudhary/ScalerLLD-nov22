package com.designpatterns.structural.decorator.pizza;

public class Olive implements Addons{
    int cost = 20;
    String desc = "Olive";

    Pizza pizaa;

    public Olive(Pizza pizza) {
        this.pizaa = pizza;
    }

    @Override
    public int getCost() {
        return this.cost + pizaa.getCost();
    }

    @Override
    public String getDescription() {
        return pizaa.getDescription() + " + " + desc;
    }
}
