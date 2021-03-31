package com.itmo.java.basics.initialization.impl;

import com.itmo.java.basics.index.impl.TableIndex;
import com.itmo.java.basics.initialization.TableInitializationContext;
import com.itmo.java.basics.logic.Segment;

import java.nio.file.Path;

public class TableInitializationContextImpl implements TableInitializationContext {
    public TableInitializationContextImpl(String tableName, Path databasePath, TableIndex tableIndex) {
    }

    @Override
    public String getTableName() {
        return null;
    }

    @Override
    public Path getTablePath() {
        return null;
    }

    @Override
    public TableIndex getTableIndex() {
        return null;
    }

    @Override
    public Segment getCurrentSegment() {
        return null;
    }

    @Override
    public void updateCurrentSegment(Segment segment) {
    }
}
