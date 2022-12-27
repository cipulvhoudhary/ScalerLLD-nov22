package com.designpatterns.creational.builder.version1;

import java.util.HashMap;

/**
 * NOT OPTIMAL/GOOD DESIGN PATTERN
 * pros :
 *      a) Easy to read and understand
 *      b) Null at client side is resolved
 * cons :
 *      a) type casting
 *      b) Client can misuse object parameter at thei end
 */
public class Student {

    private int ind;
    private String name;
    private String email;
    private long phone;
    private String batch;
    private double psp;

    public Student(HashMap<String, Object> map) {
        this.ind = (int) map.get("id");
        this.name = (String) map.get("email");
        this.email = (String) map.get("email");
//        this.phone = (long) map.get("phone");
        this.batch = (String) map.get("batch");
        this.psp = (double) map.get("psp");
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
