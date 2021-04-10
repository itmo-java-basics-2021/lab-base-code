package com.itmo.java.basics.initialization.impl;

import com.itmo.java.basics.index.impl.SegmentIndex;
import com.itmo.java.basics.initialization.SegmentInitializationContext;

import java.nio.file.Path;

public class SegmentInitializationContextImpl implements SegmentInitializationContext {
    public SegmentInitializationContextImpl(String segmentName, Path segmentPath, int currentSize, SegmentIndex index) {
    }

    public SegmentInitializationContextImpl(String segmentName, Path tablePath, int currentSize) {
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
