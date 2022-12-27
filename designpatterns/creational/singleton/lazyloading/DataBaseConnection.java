package com.designpatterns.creational.singleton.lazyloading;

/**
 * This way to create a Singleton object from a class is called LAZY LOADING
 *
 * Pros --> Correct
 * Cons --> Concurrency issue
 */
public class DataBaseConnection {
    private String url;
    private String userName;
    private String password;

    private static DataBaseConnection instance;

    private DataBaseConnection() { }

    // Not going to work in a concurrent environment
    public static DataBaseConnection getInstance() {
        if(instance == null) {
            instance =  new DataBaseConnection();
        }
        return instance;
    }
}
