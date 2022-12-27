package com.designpatterns.creational.factory.after;

public class UserService {
    Database database;

    public UserService(Database database) {
        this.database = database;
    }

    void registerUser() {
        Query query = (Query) database.createQuery();
    }
}
