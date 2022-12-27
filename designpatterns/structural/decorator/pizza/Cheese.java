package com.designpatterns.structural.decorator.pizza;

public class Cheese implements Addons{
    int cost = 80;
    String desc = "Cheese";

    Pizza pizza;

    public Cheese(Pizza pizza) {
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
