package com.itmo.java.basics.logic.impl;

import com.itmo.java.basics.logic.DatabaseCache;

public class DatabaseCacheImpl implements DatabaseCache {
    private static final int CAPACITY = 5_000;

    @Override
    public byte[] get(String key) {
        return new byte[0];
    }

    @Override
    public void set(String key, byte[] value) {

    }

    @Override
    public void delete(String key) {

    }
}
