package site.filter;

import site.Course;

public class CoursePredicates {
    private CoursePredicates() {}

    public static Predicate<Course> withId(final int id) {
        return new Predicate<Course>() {
            @Override
            public boolean apply(Course elem) {
                return elem.getId() == id;
            }
        };
    }

    public static Predicate<Course> containsInName(final String nameSubstring) {
        return new Predicate<Course>() {
            @Override
            public boolean apply(Course elem) {
                return elem.getName().toLowerCase().contains(nameSubstring.toLowerCase());
            }
        };
    }

    public static Predicate<Course> withLevel(final int minLevel, final int maxLevel) {
        return new Predicate<Course>() {
            @Override
            public boolean apply(Course elem) {
                return elem.getLevel() >= minLevel && elem.getLevel() <= maxLevel;
            }
        };
    }

    public static Predicate<Course> withPrice(final int minPrice, final int maxPrice) {
        return new Predicate<Course>() {
            @Override
            public boolean apply(Course elem) {
                return elem.getPrice() >= minPrice && elem.getPrice() <= maxPrice;
            }
        };
    }
}

