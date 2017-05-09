package site;

import java.util.ArrayList;

public class Group {
    private final Course course;
    private final Teacher teacher;
    private final ArrayList<Student> listOfStudents = new ArrayList<>();

    public Group(Course course, Teacher teacher) {
        this.course = course;
        this.teacher = teacher;
    }

    public void add(Student student) {
        listOfStudents.add(student);
    }

    public String getTeacher() {
        return teacher.getName();
    }

    public String getCourse() {
        return course.getName();
    }

    @Override
    public String toString() {
        return "Group{" +
                "course=" + course +
                ", teacher=" + teacher +
                ", listOfStudents=" + listOfStudents +
                '}';
    }
}
