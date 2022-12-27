package com.solidpriciples.version1;

public class Penguin extends Bird{

    public Penguin(int id, String name, int age, double weight, String type) {
        super(id, name, age, weight, type);
    }

    @Override
    public void fly() {
        System.out.println("I am a penguin. Duh :( ");
    }

}
