package com.designpatterns.creational.builder.version3;

/**NOT WORKING
 *  Ref. Version 4 for final solution
 */
public class Student {
    private int id;
    private String name;
    private String email;
    private long phone;
    private String batch;
    private double psp;

    // make the constructor of student private
    private Student(Builder b) {
        // Do validation
        // setting attributes of Student same as Builder's object b
    }

    public static Builder getBuilder() {
        return new Builder();
    }

}
