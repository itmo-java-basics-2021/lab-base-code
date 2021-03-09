package com.itmo.java.basics.logic;

import com.itmo.java.basics.exceptions.DatabaseException;

import java.io.IOException;
import java.util.Optional;

public interface Segment {
    /**
     * Возвращает имя сегмента.
     *
     * @return имя сегмента
     */
    String getName();

    // todo sukhoa in future may return something like SegmentWriteResult .. with report and error details?
    // for new returns false if cannot allocate requested capacity
    // exception is questionable
    /**
     * Записывает значение по указанному ключу в сегмент.
     *
     * @param objectKey ключ, по которому нужно записать значение
     * @param objectValue значение, которое нужно записать
     * @return {@code true} - если значение записалось, {@code false} - если нет
     * @throws IOException если произошла ошибка ввода-вывода.
     */
    boolean write(String objectKey, byte[] objectValue) throws IOException;

    /**
     * Считывает значение из сегмента по переданному ключу.
     *
     * @param objectKey ключ, по которому нужно получить значение
     * @return значение, которое находится по ключу
     * @throws IOException если произошла ошибка ввода-вывода
     */
    Optional<byte[]> read(String objectKey) throws IOException;

    /**
     * Возвращает {@code true} - если данный сегмент открыт только на чтение, {@code false} - если данный сегмент открыт на чтение и запись.
     *
     * @return {@code true} - если данный сегмент открыт только на чтение, {@code false} - если данный сегмент открыт на чтение и запись
     */
    boolean isReadOnly();

    boolean delete(String objectKey) throws IOException;
}