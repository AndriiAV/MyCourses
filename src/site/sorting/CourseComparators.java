package site.sorting;

import site.Course;

import java.util.Comparator;

public class CourseComparators {

    private CourseComparators() {}

    public static Comparator<Course> byId() {
        return new Comparator<Course>() {
            @Override
            public int compare(Course a, Course b) {
                return Long.compare(a.getId(), b.getId());
            }
        };
    }

    public static Comparator<Course> byLevel() {
        return new Comparator<Course>() {
            @Override
            public int compare(Course a, Course b) {
                return Integer.compare(a.getLevel(), b.getLevel());
            }
        };
    }

    public static Comparator<Course> byName() {
        return new Comparator<Course>() {
            @Override
            public int compare(Course a, Course b) {
                return a.getName().compareTo(b.getName());
            }
        };
    }
}
