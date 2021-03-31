package com.itmo.java.basics.initialization.impl;

import com.itmo.java.basics.initialization.DatabaseInitializationContext;
import com.itmo.java.basics.logic.Table;

import java.nio.file.Path;
import java.util.Map;

public class DatabaseInitializationContextImpl implements DatabaseInitializationContext {

    public DatabaseInitializationContextImpl(String dbName, Path databaseRoot) {
    }

    @Override
    public String getDbName() {
        return null;
    }

    @Override
    public Path getDatabasePath() {
        return null;
    }

    @Override
    public Map<String, Table> getTables() {
        return null;
    }

    @Override
    public void addTable(Table table) {
    }
}
