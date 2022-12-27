package com.designpatterns.creational.factory.after;

import com.designpatterns.creational.factory.before.Query;

public interface Database {

    void  setUrl();

    void getHostName();

    DatabaseType getType();

    // Factory Method
    Query createQuery();
}
