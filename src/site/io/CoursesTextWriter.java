package site.io;

import site.Course;
import site.Courses;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class CoursesTextWriter  implements ObjectWriter<Courses> {

    private final PrintWriter writer;
    private final StringConverter<Course> courseConverter;

    public CoursesTextWriter(PrintWriter writer, StringConverter<Course> courseConverter) {
        this.writer = writer;
        this.courseConverter = courseConverter;
    }

    public CoursesTextWriter(Writer writer, StringConverter<Course> courseConverter) {
        this(new PrintWriter(writer), courseConverter);
    }

    @Override
    public void write(Courses courses) {
        for (Course course : courses) {
            String s = courseConverter.toString(course);
            writer.println(s);
        }
    }

    @Override
    public void close() throws IOException {
        if (writer != null) {
            writer.close();
        }
    }
}
