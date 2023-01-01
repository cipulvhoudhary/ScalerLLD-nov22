package com.designpatterns.creational.prototype.student;

public class IntelligentStudent extends Student{
    int iq;

    public IntelligentStudent() {}

    public IntelligentStudent(IntelligentStudent is) {
        super(is);
        this.iq = is.iq;
    }

    @Override
    public IntelligentStudent clone() {
        return new IntelligentStudent(this);
    }

    @Override
    public String toString() {
        return "IntelligentStudent{" +
                "iq=" + iq +
                '}';
    }
}
