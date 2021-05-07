package com.itmo.java.basics.logic.impl;

import com.itmo.java.basics.exceptions.DatabaseException;
import com.itmo.java.basics.logic.Table;

import java.util.Optional;

/**
 * Декоратор для таблицы. Кэширует данные
 */
public class CachingTable implements Table {
    @Override
    public String getName() {
        return null;
    }

    @Override
    public void write(String objectKey, byte[] objectValue) throws DatabaseException {

    }

    @Override
    public Optional<byte[]> read(String objectKey) throws DatabaseException {
        return Optional.empty();
    }

    @Override
    public void delete(String objectKey) throws DatabaseException {

    }
}
