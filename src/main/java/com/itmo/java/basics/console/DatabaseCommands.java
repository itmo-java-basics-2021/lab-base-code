package com.itmo.java.basics.console;

import com.itmo.java.protocol.model.RespObject;

import java.util.List;

/**
 * Перечисление команд. Пример создания и использования:
 * DatabaseCommands.valueOf("GET_KEY").getCommand(env, commandArgs).execute()
 */
public enum DatabaseCommands {

    CREATE_DATABASE {
        @Override
        public DatabaseCommand getCommand(ExecutionEnvironment env, List<RespObject> commandArgs) {
            //TODO implement
            return null;
        }
    },
    CREATE_TABLE {
        @Override
        public DatabaseCommand getCommand(ExecutionEnvironment env, List<RespObject> commandArgs) {
            //TODO implement
            return null;
        }
    },
    SET_KEY {
        @Override
        public DatabaseCommand getCommand(ExecutionEnvironment env, List<RespObject> commandArgs) {
            //TODO implement
            return null;
        }
    },
    GET_KEY {
        @Override
        public DatabaseCommand getCommand(ExecutionEnvironment env, List<RespObject> commandArgs) {
            //TODO implement
            return null;
        }
    },
    DELETE_KEY {
        @Override
        public DatabaseCommand getCommand(ExecutionEnvironment env, List<RespObject> commandArgs) {
            //TODO implement
            return null;
        }
    };

    /**
     * Возвращает созданную команду. Каждый элемент перечисления создается со своей реализацией этого метода
     */
    public abstract DatabaseCommand getCommand(ExecutionEnvironment env, List<RespObject> commandArgs);
}
