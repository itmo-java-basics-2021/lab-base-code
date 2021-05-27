package com.itmo.java.basics.resp;

import com.itmo.java.basics.console.DatabaseCommand;
import com.itmo.java.basics.console.ExecutionEnvironment;
import com.itmo.java.protocol.RespReader;

import java.io.IOException;

public class CommandReader implements AutoCloseable {

    public CommandReader(RespReader reader, ExecutionEnvironment env) {
        //TODO implement
    }

    /**
     * Есть ли следующая команда в ридере?
     */
    public boolean hasNextCommand() throws IOException {
        //TODO implement
        return false;
    }

    /**
     * Считывает комманду с помощью ридера и возвращает ее
     *
     * @throws IllegalArgumentException если нет имени команды и id
     */
    public DatabaseCommand readCommand() throws IOException {
        //TODO implement
        return null;
    }

    @Override
    public void close() throws Exception {
        //TODO implement
    }
}
