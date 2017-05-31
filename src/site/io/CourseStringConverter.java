package site.io;

import site.Course;

public class CourseStringConverter  implements StringConverter<Course> {

    private final String valuesDelimiter;

    public CourseStringConverter(String valuesDelimiter) {
        this.valuesDelimiter = valuesDelimiter;
    }

    @Override
    public String toString(Course course) {
        return new Joiner(valuesDelimiter).join(
                course.getId(),
                course.getName(),
                course.getLevel()
        );
    }
}
