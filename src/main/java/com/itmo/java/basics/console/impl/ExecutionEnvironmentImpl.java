package com.itmo.java.basics.console.impl;

import com.itmo.java.basics.config.DatabaseConfig;
import com.itmo.java.basics.console.ExecutionEnvironment;
import com.itmo.java.basics.logic.Database;

import java.nio.file.Path;
import java.util.Optional;

public class ExecutionEnvironmentImpl implements ExecutionEnvironment {
    public ExecutionEnvironmentImpl(DatabaseConfig config) {
    }

    @Override
    public Optional<Database> getDatabase(String name) {
        return null;
    }

    @Override
    public void addDatabase(Database db) {
    }

    @Override
    public Path getWorkingPath() {
        return null;
    }
}
