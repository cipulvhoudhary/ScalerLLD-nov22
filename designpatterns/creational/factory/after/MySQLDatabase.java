package com.designpatterns.creational.factory.after;

import com.designpatterns.creational.factory.before.MySQLQuery;
import com.designpatterns.creational.factory.before.Query;

public class MySQLDatabase implements Database {
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

    @Override
    public Query createQuery() {

        return new MySQLQuery();
    }
}
