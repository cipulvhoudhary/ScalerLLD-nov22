package com.designpatterns.creational.builder.version5;

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

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPhone(long phone) {
            this.phone = phone;
            return this;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        // need a method to call the constructor of Student class
        public Student build() {
            return new Student(this);
        }
    }
}
