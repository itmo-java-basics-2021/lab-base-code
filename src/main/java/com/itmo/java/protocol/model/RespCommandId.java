package com.itmo.java.protocol.model;

import java.io.IOException;
import java.io.OutputStream;

/**
 * Id
 */
public class RespCommandId implements RespObject {

    /**
     * Код объекта
     */
    public static final byte CODE = '!';

    public RespCommandId(int commandId) {
        //TODO implement
    }

    /**
     * Ошибка ли это? Ответ - нет
     *
     * @return false
     */
    @Override
    public boolean isError() {
        return false;
    }

    @Override
    public String asString() {
        //TODO implement
        return null;
    }

    @Override
    public void write(OutputStream os) throws IOException {
        //TODO implement
    }
}
