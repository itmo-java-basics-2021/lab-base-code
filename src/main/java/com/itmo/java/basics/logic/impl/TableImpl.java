package com.itmo.java.basics.logic.impl;

import com.itmo.java.basics.exceptions.DatabaseException;
import com.itmo.java.basics.index.impl.TableIndex;
import com.itmo.java.basics.logic.Table;

import java.nio.file.Path;
import java.util.Optional;

public class TableImpl implements Table {
    static Table create(String tableName, Path pathToDatabaseRoot, TableIndex tableIndex) throws DatabaseException {
        return null;
    }

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
