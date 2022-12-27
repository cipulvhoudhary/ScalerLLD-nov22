package com.designpatterns.creational.builder.version2;

public class Client {

    public static void main(String[] args) {
        Builder b = new Builder();
        b.id = 1;
        b.name = "Vipul";
        b.email = "xyz@abc.com";
        b.phone = 953428982;
        b.batch = "academy";
        b.psp = 95.54;

        Student st1 = new Student(b);
        // Student st1 = new Student(null); // RUNTIME ERROR
        System.out.println(st1.toString());
    }

}
