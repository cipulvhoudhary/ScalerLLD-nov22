package com.oopsconcept.polymorphism;

public class User {
    private String email;
    public String password;

    public void changePassword(String newPassword) {
        password = newPassword;
    }
}
