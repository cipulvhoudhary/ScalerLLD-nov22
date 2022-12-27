package com.designpatterns.creational.factory.after;

public class Client {

    public static void main(String[] args) {

        UserService userService = new UserService(new MySQLDatabase());
    }

}
