package site.io.parser;

import site.io.IllegalFormatException;

public interface Parser<T> {
    T parse(String s) throws IllegalFormatException;
}
