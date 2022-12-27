package com.solidpriciples.version1;

public class Client {

    public static void main(String[] args) {
        Bird b1 = new Crow(1, "Crow", 3, 1.5, "FlyingBird");
        System.out.println(b1.toString());
        b1.fly();

        Bird b2 = new Sparrow(2, "Sparrow", 2, 2, "FlyingBird");
        System.out.println(b2.toString());
        b2.fly();

        Bird b3 = new Penguin(3, "Penguin", 2, 5, "NonFlyingBird");
        System.out.println(b3.toString());
        b3.fly();
    }
}
