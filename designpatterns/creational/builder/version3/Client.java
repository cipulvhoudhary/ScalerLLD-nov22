package com.designpatterns.creational.builder.version3;

public class Client {

    public static void main(String[] args) {

        // This will create a builder object, even before Student object is created
        // With all attributes of builder initializing from it's default values
        Builder b = Student.getBuilder();
        b.id = 1;
        b.name = "Vipul";
        b.email = "abc@xyz.com";
        b.phone = 2454354;
        b.batch = "academy";
        b.psp = 95.54;

        // Now builder object is set
        // WE just need to clone and validate builder attributes to a Student object
//        Student st1 = new Student(b); // This line will not work as constructor is private

        // solution Builder should be inner class of student

    }
}
