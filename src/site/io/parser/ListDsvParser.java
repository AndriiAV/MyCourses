package site.io.parser;

import site.io.IllegalFormatException;

import java.util.ArrayList;
import java.util.List;

public class ListDsvParser<T> implements Parser<List<T>> {

    private final String delimiter;
    private final Parser<T> elemParser;

    public ListDsvParser(String delimiter, Parser<T> elemParser) {
        this.delimiter = delimiter;
        this.elemParser = elemParser;
    }

    public ListDsvParser(DsvFormat format, Parser<T> elemParser) {
        this(format.getDelimiter(), elemParser);
    }

    @Override
    public List<T> parse(String s) throws IllegalFormatException {
        String[] tokens = s.split(delimiter);
        List<T> res = new ArrayList<>(tokens.length);

        for (String token : tokens) {
            T elem = elemParser.parse(token);
            res.add(elem);
        }

        return res;
    }
}
