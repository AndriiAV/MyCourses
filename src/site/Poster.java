package site;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Poster {
    private final Course course;
    private final Date startDate;
    private final Teacher teacher;

    public Poster(Course course, Date startDate, Teacher teacher) {
        this.course = course;
        this.startDate = startDate;
        this.teacher = teacher;
    }

    public Date getStartDate() {
        return startDate;
    }

    SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

    public String getCourse() {
        return course.getName();
    }

    public String getTeacher() {
        return teacher.getName();
    }

    public String getSdf(){
        return sdf.format(startDate);
    }

    public static boolean testDate (String sdf){
        Pattern p = Pattern.compile("([0-2]\\d|3[01])+\\.(0\\d|1[012])\\.(\\d{4})");
        Matcher m = p.matcher(sdf);
        return m.matches();
    }

    @Override
    public String toString() {
        return "Poster{" +
                "course=" + course +
                ", startDate=" + sdf.format(startDate) +
                '}';
    }
}
