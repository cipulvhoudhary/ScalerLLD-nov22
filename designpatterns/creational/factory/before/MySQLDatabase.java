package com.designpatterns.creational.factory.before;

public class MySQLDatabase implements Database{
    @Override
    public void setUrl() {

    }

    @Override
    public void getHostName() {

    }

    @Override
    public DatabaseType getType() {
        return DatabaseType.MYSQL;
    }
}
