package com.oopsconcept.polymorphism;

public class Client {

    public static void main(String[] args) {

        User u = new Student();
//        u.setPsp() --> throws error
        u.changePassword("hello");
    }
}
