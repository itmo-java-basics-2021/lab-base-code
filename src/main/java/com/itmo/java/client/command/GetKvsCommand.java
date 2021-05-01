package com.itmo.java.client.command;

import com.itmo.java.protocol.model.RespArray;
import com.itmo.java.protocol.model.RespBulkString;
import com.itmo.java.protocol.model.RespCommandId;

public class GetKvsCommand implements KvsCommand {

    private static final String COMMAND_NAME = "GET_KEY";

    public GetKvsCommand(String databaseName, String tableName, String key) {
        //TODO implement
    }

    /**
     * Возвращает RESP объект. {@link RespArray} с {@link RespCommandId}, именем команды, аргументами в виде {@link RespBulkString}
     *
     * @return объект
     */
    @Override
    public RespArray serialize() {
        //TODO implement
        return null;
    }

    @Override
    public int getCommandId() {
        //TODO implement
        return 0;
    }
}
