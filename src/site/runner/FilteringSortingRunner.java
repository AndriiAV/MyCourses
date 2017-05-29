package site.runner;

import site.Course;
import site.Courses;

import static site.filter.AndPredicate.allOf;
import static site.filter.CoursePredicates.containsInName;
import static site.filter.CoursePredicates.withLevel;
import static site.sorting.CompositeComparator.multiCriterion;
import static java.util.Collections.reverseOrder;
import static site.sorting.CourseComparators.byLevel;
import static site.sorting.CourseComparators.byName;

public class FilteringSortingRunner {
    public static void main(String[] args) {
        Courses courses = createCourses();

        System.out.println("Normal courses\n"+courses);

        courses = courses.filter(allOf(containsInName("Excel"), withLevel(1, 2)));
        System.out.println("\nFiltered courses\n"+courses);

        courses.sort(multiCriterion(reverseOrder(byLevel()), byName()));
        System.out.println("\nSorted and filtered courses\n"+courses);
    }

    public static Courses createCourses() {
        Course course1 = new Course("Excel", "Excel for beginners", 1, 2000.00, 4);
        Course course2 = new Course("Word", "Word for professionals", 3, 3000.00, 6);
        Course course3 = new Course("Excel", "Excel for professionals", 3, 3500.00, 1);
        Course course4 = new Course("Excel", "Excel for users", 2, 1500.00, 3);

        Courses courses = new Courses();
        courses.add(course1);
        courses.add(course2);
        courses.add(course3);
        courses.add(course4);

        return courses;
    }
}
