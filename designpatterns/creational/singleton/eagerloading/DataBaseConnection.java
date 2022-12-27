package com.designpatterns.creational.singleton.eagerloading;

/**
 * This way to create a Singleton object from a class is called EAGER LOADING
 *
 * Pros --> Correct
 *      --> Handle concurrency
 *
 * Cons --> Slowness of application, as object will take space while class loading
 *      --> Impossible to create object, if attributes is expected to create the object
 *          is coming from any 3rd party service.
 */

public class DataBaseConnection {
    private String url;
    private String userName;
    private String password;

    private static DataBaseConnection instance = new DataBaseConnection();

    private DataBaseConnection() { }

    // Not going to work in a concurrent environment
    public static DataBaseConnection getInstance(){
        return instance;
    }
}
