package com.designpatterns.creational.factory.after;

import com.designpatterns.creational.factory.before.PostgresQuery;
import com.designpatterns.creational.factory.before.Query;

public class PostgresDatabase implements Database {
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

    @Override
    public Query createQuery() {
        return new PostgresQuery();
    }

}
