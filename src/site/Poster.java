package site;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Poster {
    private final Course course;

    public Date getStartDate() {
        return startDate;
    }

    private final Date startDate;
    private final Teacher teacher;

    public Poster(Course course, Date startDate, Teacher teacher) {
        this.course = course;
        this.startDate = startDate;
        this.teacher = teacher;
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
