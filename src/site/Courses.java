package site;

import java.util.ArrayList;
import java.util.StringJoiner;

public class Courses {
    private final ArrayList<Course> listOfCourses = new ArrayList<>();

    public void sorting (){
    }
    public void filtering (){
    }

    public void add(Course course) {
        listOfCourses.add(course);
    }
    public void remove (Course course) {
        listOfCourses.remove(course);
    }

    public ArrayList<Course> getListOfCourses() {
        return listOfCourses;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner("\n");
        for (Course course: listOfCourses) {
            joiner.add(course.toString());
        }
        return "Courses:\n" + joiner.toString();
    }
}
