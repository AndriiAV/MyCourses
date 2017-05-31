package site.io;

import java.util.StringJoiner;

public class Joiner {

    private final String delimiter;

    public Joiner(String delimiter) {
        this.delimiter = delimiter;
    }

    public String join(Object... elems) {
        StringJoiner stringJoiner = new StringJoiner(delimiter);
        for (Object elem : elems) {
            stringJoiner.add(elem.toString());
        }
        return stringJoiner.toString();
    }
}
