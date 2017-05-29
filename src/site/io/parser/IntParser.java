package site.io.parser;

import site.io.IllegalFormatException;

public class IntParser implements Parser<Integer> {

    @Override
    public Integer parse(String s) throws IllegalFormatException {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            throw new IllegalFormatException("can't parse string to int: " + s, e);
        }
    }
}
