package site.io;

import site.Course;
import site.Courses;
import site.io.parser.Parser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class CoursesTextReader implements ObjectReader<Courses> {

    private final BufferedReader reader;
    private final Parser<Course> filmParser;

    public CoursesTextReader(BufferedReader reader, Parser<Course> filmParser) {
        this.reader = reader;
        this.filmParser = filmParser;
    }

    public CoursesTextReader(Reader reader, Parser<Course> filmParser) {
        this(new BufferedReader(reader), filmParser);
    }

    @Override
    public Courses read() throws IOException, IllegalFormatException {
        Courses films = new Courses();

        String line;
        while ((line = reader.readLine()) != null) {
            Course film = filmParser.parse(line);
            films.add(film);
        }

        return films;
    }

    @Override
    public void close() throws IOException {
        if (reader != null) {
            reader.close();
        }
    }
}
