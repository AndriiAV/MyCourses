package site.io;

import site.Courses;
import site.io.parser.CourseParser;

import java.io.*;

public class BasicCoursesIO {
    private BasicCoursesIO() {}

    public static Courses readFromTextFile(String fileName) throws IOException, IllegalFormatException {
        CourseParser courseParser = new CourseParser(";");
        try (ObjectReader<Courses> filmsReader = new CoursesTextReader(new FileReader(fileName), courseParser)) {
            return filmsReader.read();
        }
    }

    public static void writeIntoTextFile(String fileName, Courses courses) throws IOException {
        CourseStringConverter courseConverter = new CourseStringConverter(";");
        try (ObjectWriter<Courses> coursesWriter = new CoursesTextWriter(new FileWriter(fileName), courseConverter)) {
            coursesWriter.write(courses);
        }
    }

    public static void writeIntoBinFile(String fileName, Courses courses) throws IOException {
        try (ObjectWriter<Courses> filmsWriter = new CoursesBinWriter(new FileOutputStream(fileName))) {
            filmsWriter.write(courses);
        }
    }

    public static Courses readFromBinFile(String fileName) throws IOException, IllegalFormatException {
        try (ObjectReader<Courses> filmsReader = new CoursesBinReader(new FileInputStream(fileName))) {
            return filmsReader.read();
        }
    }
}
