package com.designpatterns.creational.singleton.notsingleton;

public class DataBaseConnection {
    private String url;
    private String userName;
    private String password;

    private DataBaseConnection() { }

    public static DataBaseConnection getInstance() {
        return new DataBaseConnection();
    }
}
