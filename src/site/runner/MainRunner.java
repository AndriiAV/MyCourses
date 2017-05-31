package site.runner;

import site.Courses;
import site.io.BasicCoursesIO;
import site.io.IllegalFormatException;

import java.io.IOException;

import static java.util.Collections.reverseOrder;
import static site.filter.AndPredicate.allOf;
import static site.filter.CoursePredicates.containsInName;
import static site.filter.CoursePredicates.withLevel;
import static site.sorting.CompositeComparator.multiCriterion;
import static site.sorting.CourseComparators.byLevel;
import static site.sorting.CourseComparators.byName;

public class MainRunner {
    private static final String INPUT_TEXT_FILE = "files/courses.csv";
    private static final String OUTPUT_BIN_FILE = "files/courses.dat";

    public static void main(String[] args) {
        Courses courses = readCoursesFromFile(INPUT_TEXT_FILE);

        courses = courses.filter(allOf(containsInName("a"), withLevel(0, 2)));
        courses.sort(multiCriterion(reverseOrder(byLevel()), byName()));
        System.out.println(courses);

        writeFilmsIntoBinFile(courses, OUTPUT_BIN_FILE);
    }

    private static Courses readCoursesFromFile(String fileName) {
        try {
            return BasicCoursesIO.readFromTextFile(fileName);
        } catch (IOException e) {
            System.out.println("IO Error. " + e.getMessage());
            System.exit(0);
            return null;
        } catch (IllegalFormatException e) {
            System.out.println("Illegal format. " + e.getMessage());
            System.exit(0);
            return null;
        }
    }

    private static void writeFilmsIntoBinFile(Courses courses, String fileName) {
        try {
            BasicCoursesIO.writeIntoBinFile(fileName, courses);
        } catch (IOException e) {
            System.out.println("IO Error. " + e.getMessage());
        }
    }
}

