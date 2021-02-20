package main.java.com.itmo.java.basics.index.impl;

import main.java.com.itmo.java.basics.index.SegmentOffsetInfo;

public class SegmentOffsetInfoImpl implements SegmentOffsetInfo {
    private final long offset;

    public SegmentOffsetInfoImpl(long offset) {
        this.offset = offset;
    }

    @Override
    public long getOffset() {
        return this.offset;
    }
}
