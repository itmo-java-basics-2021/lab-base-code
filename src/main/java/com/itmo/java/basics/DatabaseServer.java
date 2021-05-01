package com.itmo.java.basics;

import com.itmo.java.basics.console.DatabaseCommand;
import com.itmo.java.basics.console.DatabaseCommandResult;
import com.itmo.java.basics.console.ExecutionEnvironment;
import com.itmo.java.basics.exceptions.DatabaseException;
import com.itmo.java.basics.initialization.impl.DatabaseServerInitializer;
import com.itmo.java.protocol.model.RespArray;

import java.util.concurrent.CompletableFuture;

public class DatabaseServer {
    /**
     * Con structor
     *
     * @param env         env для инициализации. Далее работа происходит с заполненым объектом
     * @param initializer готовый чейн инициализации
     * @throws DatabaseException если произошла ошибка инициализации
     */
    public static DatabaseServer initialize(ExecutionEnvironment env, DatabaseServerInitializer initializer) throws DatabaseException {
        //TODO implement
        return null;
    }

    public CompletableFuture<DatabaseCommandResult> executeNextCommand(RespArray message) {
        //TODO implement
        return null;
    }

    public CompletableFuture<DatabaseCommandResult> executeNextCommand(DatabaseCommand command) {
        //TODO implement
        return null;
    }
}