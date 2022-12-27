package com.designpatterns.creational.singleton.doublecheckloading;

public class DataBaseConnection {
    private String url;
    private String userName;
    private String password;

    private static DataBaseConnection instance;

    private DataBaseConnection() { }

    public DataBaseConnection(String name) {
    }

    public static DataBaseConnection getInstance(String name) {
        if(instance == null) { // T1, T2 // First check without lock
            synchronized(DataBaseConnection.class) { // T1, T2
                if (instance == null) { // Second check after a lock // T1 then T2
                    instance = new DataBaseConnection(name); // T1
                } 
            } 
        }
        return instance; // T2
    }
}
