package com.designpatterns.creational.factory.before;

public class Client {

    public static void main(String[] args) {

        UserService userService = new UserService(new PostgresDatabase());
        userService.registerUser();

    }

}
