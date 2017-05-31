package site.io.parser;

import site.io.IllegalFormatException;

public class LevelParser implements Parser<Integer> {

    @Override
    public Integer parse(String s) throws IllegalFormatException {
        int n = new IntParser().parse(s);
        if (!isLevel(n)) {
            throw new IllegalFormatException("illegal level: " + s);
        }
        return n;
    }

    private boolean isLevel(int n) {
        return n >= 1 && n <= 3;
    }
}
