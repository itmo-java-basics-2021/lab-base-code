package com.itmo.java.client.command;

import com.itmo.java.protocol.model.RespObject;

import java.util.concurrent.atomic.AtomicInteger;

public interface KvsCommand {
    /**
     * Счетчик для команды. Каждая созданная команда использует это поле для создания id, инкрементирует значение
     * Первая комада создается с id 0
     */
    AtomicInteger idGen = new AtomicInteger();

    /**
     * Сериализует объект в RESP
     *
     * @return RESP объект
     */
    RespObject serialize();

    /**
     * Id команды
     *
     * @return id
     */
    int getCommandId();
}
