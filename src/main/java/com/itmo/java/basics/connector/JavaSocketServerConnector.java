package com.itmo.java.basics.connector;

import com.itmo.java.basics.DatabaseServer;
import com.itmo.java.basics.config.ServerConfig;
import com.itmo.java.basics.resp.CommandReader;
import com.itmo.java.protocol.RespWriter;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Класс, который предоставляет доступ к серверу через сокеты
 */
public class JavaSocketServerConnector implements AutoCloseable {

    /**
     * Экзекьютор для выполнения ClientTask
     */
    private final ExecutorService clientIOWorkers = Executors.newSingleThreadExecutor();

    /**
     * Стартует сервер. По аналогии с сокетом открывает коннекшн в конструкторе.
     * <p>
     * Начинает слушать заданный порт, начинает аксептить клиентские сокеты. На каждый из них начинает клиентскую таску
     */
    public JavaSocketServerConnector(DatabaseServer databaseServer, ServerConfig config) {
        //TODO implement
    }

    /**
     * Стартует сервер. Начинает слушать нужный порт, на каждый клиентский сокет создает клиентскую таску и исполняет команды с помощью {@link DatabaseServer}
     */
    public void start() throws IOException {
        //TODO implement
    }

    /**
     * Закрывает все, что нужно ¯\_(ツ)_/¯ (Начавшиеся исполняться клиентские задачи должны быть исполнены)
     */
    @Override
    public void close() throws Exception {
        //TODO implement
    }


    public static void main(String[] args) throws Exception {
        //можнно запускать прямо здесь
    }

    /**
     * Runnable, описывающий исполнение клиентской команды.
     */
    static class ClientTask implements Runnable, Closeable {

        /**
         * @param client клиентский сокет
         * @param server сервер, на котором исполняется задача
         */
        public ClientTask(Socket client, DatabaseServer server) {
            //TODO implement
        }

        /**
         * Исполняет задачи из одного клиентского сокета, пока клиент не отсоединился или текущий поток был прерван (interrupted).
         * Для кажной из задач:
         * 1. Читает из сокета команду с помощью {@link CommandReader}
         * 2. Исполняет ее на сервере
         * 3. Записывает результат в сокет с помощью {@link RespWriter}
         */
        @Override
        public void run() {
            //TODO implement
        }

        /**
         * Закрывает клиентский сокет
         */
        @Override
        public void close() {
            //TODO implement
        }
    }
}