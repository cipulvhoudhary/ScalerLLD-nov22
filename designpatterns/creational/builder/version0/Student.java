package com.designpatterns.creational.builder.version0;

/**
 * BAD DESIGN
 * Th issue with this appproach is that sometimes will not want to enter every details
 * Then there will be a lot of null values at client side which looks bad
 */
public class Student {
    private int ind;
    private String name;
    private String email;
    private long phone;
    private String batch;
    private double psp;

    public Student(int ind, String name, String email, long phone, String batch, double psp) {
        // validate here
        this.ind = ind;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.batch = batch;
        this.psp = psp;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ind=" + ind +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", batch='" + batch + '\'' +
                ", psp=" + psp +
                '}';
    }
}
