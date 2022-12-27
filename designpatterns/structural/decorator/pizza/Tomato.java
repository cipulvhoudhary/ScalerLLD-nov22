package com.designpatterns.structural.decorator.pizza;

public class Tomato implements Addons{
    int cost = 30;
    String desc = "Tomato";

    Pizza pizza;

    public Tomato(Pizza pizza) {
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
