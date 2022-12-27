package com.designpatterns.creational.builder.version4;

public class Student {

    private int id;
    private String name;
    private String email;
    private long phone;
    private String batch;
    private double psp;

    // make the constructor of student private
    private Student(Builder b) {
        // ....Do validation....

        // setting attributes of Student same as Builder's object b
        this.id = b.id;
        this.name = b.name;
        this.email = b.email;
        this.phone = b.phone;
        this.batch = b.batch;
        this.psp = b.psp;
    }

    public static Builder getBuilder() {
        return new Builder();
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

    public static class Builder {
        private int id;
        private String name;
        private String email;
        private long phone;
        private String batch;
        private double psp;

        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setPhone(long phone) {
            this.phone = phone;
        }

        public void setBatch(String batch) {
            this.batch = batch;
        }

        public void setPsp(double psp) {
            this.psp = psp;
        }

        // need a method to call the constructor of Student class
        public Student build() {
            return new Student(this);
        }
    }
}
