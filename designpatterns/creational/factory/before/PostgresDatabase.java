package com.designpatterns.creational.factory.before;

public class PostgresDatabase implements Database{
    @Override
    public void setUrl() {

    }

    @Override
    public void getHostName() {

    }

    @Override
    public DatabaseType getType() {
        return DatabaseType.POSTGRES;
    }
}
