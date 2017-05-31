package site.io.parser;

import site.Course;
import site.io.IllegalFormatException;

public class CourseWithIdParser implements Parser<Course> {

private final String valuesDelimiter;
private final Parser<Course> filmParser;

private final Parser<Long> idParser = new LongParser();

public CourseWithIdParser(String valuesDelimiter) {
        this.valuesDelimiter = valuesDelimiter;
        this.filmParser = new CourseParser(valuesDelimiter);
        }


@Override
public Course parse(String s) throws IllegalFormatException {
        int firstDelimiterIndex = s.indexOf(valuesDelimiter);
        if (firstDelimiterIndex < 0 || firstDelimiterIndex == s.length() - 1) {
        throw new IllegalFormatException("some values are missed: " + s);
        }

        long id = idParser.parse(s.substring(0, firstDelimiterIndex));
    Course course = filmParser.parse(s.substring(firstDelimiterIndex + 1));

        return null;
                /*new Course.Builder()
        .id(id)
        .name(course.getName())
        .releaseYear(course.getReleaseYear())
        .genres(course.getGenres())
        .build();*/
        }
        }
