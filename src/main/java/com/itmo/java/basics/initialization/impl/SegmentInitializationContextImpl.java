package com.itmo.java.basics.initialization.impl;

import com.itmo.java.basics.index.impl.SegmentIndex;
import com.itmo.java.basics.initialization.SegmentInitializationContext;

import java.nio.file.Path;

public class SegmentInitializationContextImpl implements SegmentInitializationContext {
    public SegmentInitializationContextImpl(String segmentName, Path segmentPath, long currentSize, SegmentIndex index) {
    }

    /**
     * Не используйте этот конструктор. Оставлен для совместимости со старыми тестами.
     */
    public SegmentInitializationContextImpl(String segmentName, Path tablePath, long currentSize) {
    }

    public SegmentInitializationContextImpl(String segmentName, Path tablePath) {
        this(segmentName, tablePath.resolve(segmentName), 0, new SegmentIndex());
    }

    @Override
    public String getSegmentName() {
        return null;
    }

    @Override
    public Path getSegmentPath() {
        return null;
    }

    @Override
    public SegmentIndex getIndex() {
        return null;
    }

    @Override
    public long getCurrentSize() {
        return 0;
    }
}
