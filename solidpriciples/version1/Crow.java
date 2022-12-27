package com.solidpriciples.version1;

public class Crow extends Bird{

    public Crow(int id, String name, int age, double weight, String type) {
        super(id, name, age, weight, type);
    }

    @Override
    public void fly() {
        System.out.println("Flying like a crow...");
    }
}
