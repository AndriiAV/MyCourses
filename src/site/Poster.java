package site;

import java.util.Date;

public class Poster {
    private final Course course;
    private final Date startDate;

    public Poster(Course course, Date startDate) {
        this.course = course;
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "Poster{" +
                "course=" + course +
                ", startDate=" + startDate +
                '}';
    }
}
