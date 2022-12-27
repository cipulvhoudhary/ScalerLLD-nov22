package com.designpatterns.creational.builder.version0;

public class Client {

    public static void main(String[] args) {
        Student st1 = new Student(1, "vipul", "Xyz@abc.com", 953525, "academy", 95.50);
        System.out.println(st1.toString());
    }
}
