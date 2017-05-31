package site.runner;

import site.Course;
import site.Courses;
import site.io.IllegalFormatException;

import java.io.IOException;

import static site.io.BasicCoursesIO.*;

public class IORunner {
    private static final String INPUT_TEXT_FILE = "files/courses.csv";
    private static final String OUTPUT_TEXT_FILE = "files/courses-out.csv";
    private static final String BIN_FILE = "files/courses.dat";

    public static void main(String[] args) {
        Course course1 = new Course("Excel", "Excel for beginners", 1, 2000.00, 4);
        Course course2 = new Course("Word", "Word for professionals", 3, 3000.00, 6);
        Course course3 = new Course("Excel", "Excel for professionals", 3, 3500.00, 1);
        Course course4 = new Course("Excel", "Excel for users", 2, 1500.00, 3);

        Courses courses1 = new Courses();
        courses1.add(course1);
        courses1.add(course2);
        courses1.add(course3);
        courses1.add(course4);

        try {
            System.out.println("Reading from text file: " + INPUT_TEXT_FILE);
            Courses courses = readFromTextFile(INPUT_TEXT_FILE);

            System.out.println(courses);

            System.out.println("Writing into text file: " + OUTPUT_TEXT_FILE);
            writeIntoTextFile(OUTPUT_TEXT_FILE, courses1);

            System.out.println("Writing into bin file: " + BIN_FILE);
            writeIntoBinFile(BIN_FILE, courses1);

            System.out.println("Reading from bin file: " + BIN_FILE);
            Courses filmsFromBinFile = readFromBinFile(BIN_FILE);
            System.out.println(filmsFromBinFile);

            System.out.println("DONE");
        } catch (IOException e) {
            System.out.println("IO Error. " + e.getMessage());
        } catch (IllegalFormatException e) {
            System.out.println("Illegal format. " + e.getMessage());
        }
    }
}
