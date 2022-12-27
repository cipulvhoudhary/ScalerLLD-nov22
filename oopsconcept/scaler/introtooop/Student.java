package com.oopsconcept.scaler.introtooop;

public class Student {
    int id;
    String name;
    String gender;
    int age;
    String batch;

    public void changeBatch(String newBatch) {
        batch = newBatch;
    }

    void pauseCourse(int duration) {
        batch  = null;
        System.out.println("Course is paused for " + duration + " month");
    }
}
