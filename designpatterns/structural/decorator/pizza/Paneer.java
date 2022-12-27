package com.designpatterns.structural.decorator.pizza;

public class Paneer implements Addons{
    int cost = 60;
    String desc = "Paneer";

    Pizza pizza;

    public Paneer(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return pizza.getCost() + cost;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + " + desc;
    }
}
