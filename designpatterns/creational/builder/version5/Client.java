package com.designpatterns.creational.builder.version5;

public class Client {

    public static void main(String[] args) {
        Student st1 = Student.getBuilder()
                .setId(1)
                .setName("Vipul")
                .setEmail("abc@xyz.com")
                .setPhone(5453418)
                .setBatch("academy")
                .setPsp(95.54)
                .build();

        Student st2 = Student.getBuilder()
                .setId(2)
                .setName("Rohan")
                .setEmail("def@xyz.com")
                .setPhone(541253418)
                .setBatch("dsml")
                .setPsp(90.14)
                .build();

        System.out.println(st1.toString());
        System.out.println(st2.toString());
    }
}
