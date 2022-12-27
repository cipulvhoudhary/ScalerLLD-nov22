package com.oopsconcept.scaler.thefourjailer.accessmodifiers;

public class Student {

    // not visible in same package
    // not visible in different pachage(helper)
    private int id;

    // can be visible in same class only
    // cannot be visible in different package(helper)
    String name;

    // can be visible in same package
    // can be visile in other pacakge(helper), iff accesing in a subclass
    protected String gender;

    // can be visible in same package
    // can be visible in other package(helper)
    public int age;
    public String batch;

    public void changeBatch(String newBatch) {
        batch = newBatch;
    }

    private void pauseCourse(int duration) {
        batch  = null;
        System.out.println("Course is paused for " + duration + " month");
    }
}
