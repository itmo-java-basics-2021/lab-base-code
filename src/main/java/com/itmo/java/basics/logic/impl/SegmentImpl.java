package com.itmo.java.basics.logic.impl;

import com.itmo.java.basics.logic.Segment;
import com.itmo.java.basics.exceptions.DatabaseException;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;

public class SegmentImpl implements Segment {
    static Segment create(String segmentName, Path tableRootPath) throws DatabaseException {
        throw new UnsupportedOperationException(); // todo implement
    }

    static String createSegmentName(String tableName) {
        return tableName + "_" + System.currentTimeMillis();
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public boolean write(String objectKey, byte[] objectValue) throws IOException {
        return false;
    }

    @Override
    public Optional<byte[]> read(String objectKey) throws IOException {
        return Optional.empty();
    }

    @Override
    public boolean isReadOnly() {
        return false;
    }

    @Override
    public boolean delete(String objectKey) throws IOException {
        return false;
    }
}
