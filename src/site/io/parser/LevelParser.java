package site.io.parser;

import site.io.IllegalFormatException;

public class LevelParser implements Parser<Integer> {

    @Override
    public Integer parse(String s) throws IllegalFormatException {
        int n = new IntParser().parse(s);
        if (!isReleaseYear(n)) {
            throw new IllegalFormatException("illegal level: " + s);
        }
        return n;
    }

    private boolean isReleaseYear(int n) {
        return n >= 0 && n <= 10;
    }
}
