package com.itmo.java.basics.logic.impl;

import com.itmo.java.basics.exceptions.DatabaseException;
import com.itmo.java.basics.logic.Database;

import java.nio.file.Path;
import java.util.Optional;

public class DatabaseImpl implements Database {
    public static Database create(String dbName, Path databaseRoot) throws DatabaseException {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void createTableIfNotExists(String tableName) throws DatabaseException {

    }

    @Override
    public void write(String tableName, String objectKey, byte[] objectValue) throws DatabaseException {

    }

    @Override
    public Optional<byte[]> read(String tableName, String objectKey) throws DatabaseException {
        return Optional.empty();
    }

    @Override
    public void delete(String tableName, String objectKey) throws DatabaseException {

    }
}
