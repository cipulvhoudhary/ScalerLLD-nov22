package com.oopsconcept.scaler.inheritence;

public class Client {

    public static void main(String[] args) {
        Student s = new Student();

        // email.is present in s, but due it's accesibility(private),
        // it is not accesible directly. We can access private attributes using public methods
        // s.email = "blahblah";

        // Accessing private attribute of user(password) using public method
        s.changePassword("password");
    }

}
