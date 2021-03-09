package com.itmo.java.basics.logic.impl;

import com.itmo.java.basics.logic.WritableDatabaseRecord;

public class RemoveDatabaseRecord implements WritableDatabaseRecord {
    @Override
    public byte[] getKey() {
        return new byte[0];
    }

    @Override
    public byte[] getValue() {
        return new byte[0];
    }

    @Override
    public long size() {
        return 0;
    }

    @Override
    public boolean isValuePresented() {
        return false;
    }

    @Override
    public int getKeySize() {
        return 0;
    }

    @Override
    public int getValueSize() {
        return 0;
    }
}
