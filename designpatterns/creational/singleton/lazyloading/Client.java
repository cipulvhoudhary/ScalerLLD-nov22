package com.designpatterns.creational.singleton.lazyloading;

public class Client {

    public static void main(String[] args) {
        DataBaseConnection db1 = DataBaseConnection.getInstance();
        DataBaseConnection db2 = DataBaseConnection.getInstance();

        System.out.println(db1); // @65ab7765
        System.out.println(db2); // @65ab7765
    }

}
