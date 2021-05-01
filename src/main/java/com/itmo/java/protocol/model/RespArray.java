package com.itmo.java.protocol.model;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/**
 * Массив RESP объектов
 */
public class RespArray implements RespObject {

    /**
     * Код объекта
     */
    public static final byte CODE = '*';

    public RespArray(RespObject... objects) {
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

    /**
     * Строковое представление
     *
     * @return результаты метода {@link RespObject#asString()} для всех хранимых объектов, разделенные пробелом
     */
    @Override
    public String asString() {
        //TODO implement
        return null;
    }

    @Override
    public void write(OutputStream os) throws IOException {
        //TODO implement
    }

    public List<RespObject> getObjects() {
        //TODO implement
        return null;
    }
}
