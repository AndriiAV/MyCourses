package site.io.parser;

import site.Course;
import site.io.IllegalFormatException;

public class CourseParser implements Parser<Course>{
    private final String valuesDelimiter;
    /*private final Parser<List<Genre>> genresParser;*/

    private final Parser<Integer> releaseYearParser = new LevelParser();

    public CourseParser(String valuesDelimiter/*, Parser<List<Genre>> genresParser*/) {
        this.valuesDelimiter = valuesDelimiter;
        /*this.genresParser = genresParser;*/
    }

/*    public CourseParser(String valuesDelimiter, String genresDelimiter) {
        this(valuesDelimiter, new ListDsvParser<>(genresDelimiter, new GenreParser()));
    }*/

    @Override
    public Course parse(String s) throws IllegalFormatException {
        String[] tokens = s.split(valuesDelimiter);
        if (tokens.length < 3) {
            throw new IllegalArgumentException("some values are missed: " + s);
        }

        return null;
                /*new Course.Builder()
                .name(tokens[0])
                .releaseYear(releaseYearParser.parse(tokens[1]))
                .genres(genresParser.parse(tokens[2]))
                .build();*/
    }
}
