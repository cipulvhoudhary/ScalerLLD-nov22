package com.designpatterns.creational.builder.version4;

public class Client {

    public static void main(String[] args) {
        Student.Builder b = Student.getBuilder();
        b.setId(1);
        b.setName("vipul");
        b.setEmail("abc@xyz.com");
        b.setPhone(454354);
        b.setBatch("academy");
        b.setPsp(95.54);

        Student st1 = b.build();
        System.out.println(st1.toString());
    }
}
