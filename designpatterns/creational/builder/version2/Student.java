package com.designpatterns.creational.builder.version2;

/**
 * Here the problem is solved
 * Pros :
 *      a) Readable and understandable
 *      b) No null at client side
 *      c) No potential bugs
 * Cons :
 *      a) Code is not beautiful
 *      Reason --> To create an object of student, a client will need to create an object of the builder
 *                  Technically, a client can pass a null at student() to create an object --> RUNTIME ERROR
 */

public class Student {

    private int id;
    private String name;
    private String email;
    private long phone;
    private String batch;
    private double psp;

    public Student(Builder b) {
        this.id = b.id;
        this.name = b.name;
        this.email = b.email;
        this.phone = b.phone;
        this.batch = b.batch;
        this.psp = b.psp;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", batch='" + batch + '\'' +
                ", psp=" + psp +
                '}';
    }
}
