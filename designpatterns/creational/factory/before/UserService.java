package com.designpatterns.creational.factory.before;

import javax.xml.crypto.Data;

public class UserService {
    Database database;

    public UserService(Database database) {
        this.database = database;
    }

    void registerUser() {
        Query query;

        if(database.getType().equals(DatabaseType.MYSQL)) {
            query = new MySQLQuery();
        }
        else if(database.getType().equals(DatabaseType.POSTGRES)) {
            query = new PostgresQuery();
        }
    }
}
