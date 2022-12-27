package com.solidpriciples.version0;

public class Client {

    public static void main(String[] args) {

        Bird peacock = new Bird(1, "Peacock", 2, 1.8, "FlyingBird");
        Bird penguin = new Bird(2, "Penguin", 1, 5, "NonFlyingBird");
        System.out.println(peacock.toString());
        System.out.println(penguin.toString());
    }
}
