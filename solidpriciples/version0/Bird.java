package com.solidpriciples.version0;

public class Bird {
    // Attributes
    int id;
    String name;
    int age;
    double weight;
    String type;

    public Bird(int id, String name, int age, double weight, String type) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.type = type;
    }

    // Behaviour
    public void eat() {}
    public void walk() {}
    public void fly() {}

    @Override
    public String toString() {
        return "Bird {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", type='" + type + '\'' +
                '}';
    }
}
