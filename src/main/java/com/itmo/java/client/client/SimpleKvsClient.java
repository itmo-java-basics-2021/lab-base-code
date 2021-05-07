package com.itmo.java.client.client;

import com.itmo.java.client.connection.KvsConnection;
import com.itmo.java.client.exception.DatabaseExecutionException;

import java.util.function.Supplier;

public class SimpleKvsClient implements KvsClient {

    /**
     * Конструктор
     *
     * @param databaseName       имя базы, с которой работает
     * @param connectionSupplier метод создания подключения к базе
     */
    public SimpleKvsClient(String databaseName, Supplier<KvsConnection> connectionSupplier) {
        //TODO implement
    }

    @Override
    public String createDatabase() throws DatabaseExecutionException {
        //TODO implement
        return null;
    }

    @Override
    public String createTable(String tableName) throws DatabaseExecutionException {
        //TODO implement
        return null;
    }

    @Override
    public String get(String tableName, String key) throws DatabaseExecutionException {
        //TODO implement
        return null;
    }

    @Override
    public String set(String tableName, String key, String value) throws DatabaseExecutionException {
        //TODO implement
        return null;
    }

    @Override
    public String delete(String tableName, String key) throws DatabaseExecutionException {
        //TODO implement
        return null;
    }
}
