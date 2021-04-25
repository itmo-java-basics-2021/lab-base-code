package com.itmo.java.basics.logic.impl;

import com.itmo.java.basics.initialization.SegmentInitializationContext;
import com.itmo.java.basics.logic.Segment;
import com.itmo.java.basics.exceptions.DatabaseException;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;

/**
 * Сегмент - append-only файл, хранящий пары ключ-значение, разделенные специальным символом.
 * - имеет ограниченный размер, большие значения (>100000) записываются в последний сегмент, если он не read-only
 * - при превышении размера сегмента создается новый сегмент и дальнейшие операции записи производятся в него
 * - именование файла-сегмента должно позволять установить очередность их появления
 * - является неизменяемым после появления более нового сегмента
 */
public class SegmentImpl implements Segment {
    public static Segment create(String segmentName, Path tableRootPath) throws DatabaseException {
        throw new UnsupportedOperationException();
    }

    public static Segment initializeFromContext(SegmentInitializationContext context) {
        return null;
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
