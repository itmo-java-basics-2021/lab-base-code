package com.itmo.java.protocol;

import com.itmo.java.protocol.model.RespObject;

import java.io.IOException;
import java.io.OutputStream;

public class RespWriter implements AutoCloseable{

    public RespWriter(OutputStream os) {
        //TODO implement
    }

    /**
     * Записывает в output stream объект
     */
    public void write(RespObject object) throws IOException {
        //TODO implement
    }

    @Override
    public void close() throws IOException {
        //TODO implement
    }
}
