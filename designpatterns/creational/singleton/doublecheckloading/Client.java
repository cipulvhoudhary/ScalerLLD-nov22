package com.designpatterns.creational.singleton.doublecheckloading;

public class Client {

    public static void main(String[] args) {
        DataBaseConnection db1 = DataBaseConnection.getInstance("Connection1");
        DataBaseConnection db2 = DataBaseConnection.getInstance("Connection1");

        System.out.println(db1); // @65ab7765
        System.out.println(db2); // @65ab7765

    }

}
