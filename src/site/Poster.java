package site;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Poster {
    private final Course course;
    private final Date startDate;

    public Poster(Course course, Date startDate) {
        this.course = course;
        this.startDate = startDate;
    }
    SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

    @Override
    public String toString() {
        return "Poster{" +
                "course=" + course +
                ", startDate=" + sdf.format(startDate) +
                '}';
    }
}
