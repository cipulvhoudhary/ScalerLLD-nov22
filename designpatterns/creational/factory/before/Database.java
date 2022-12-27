package com.designpatterns.creational.factory.before;

public interface Database {

    void  setUrl();

    void getHostName();

    DatabaseType getType();
}
