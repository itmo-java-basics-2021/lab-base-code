package com.itmo.java.basics.console.impl;

import com.itmo.java.basics.console.DatabaseCommandResult;
import com.itmo.java.protocol.model.RespError;
import com.itmo.java.protocol.model.RespObject;

/**
 * Зафейленная команда
 */
public class FailedDatabaseCommandResult implements DatabaseCommandResult {

    public FailedDatabaseCommandResult(String payload) {
        //TODO implement
    }

    /**
     * Сообщение об ошибке
     */
    @Override
    public String getPayLoad() {
        //TODO implement
        return null;
    }

    @Override
    public boolean isSuccess() {
        return false;
    }

    /**
     * Сериализуется в {@link RespError}
     */
    @Override
    public RespObject serialize() {
        //TODO implement
        return null;
    }
}
