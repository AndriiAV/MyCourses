package site;

import site.filter.Predicate;

import java.io.Serializable;
import java.util.*;

public class Courses implements Iterable<Course>, Serializable {
    private final List<Course> listOfCourses = new ArrayList<>();

    public void sortingByName (){
        Collections.sort(listOfCourses, new Comparator<Course>() {
            @Override
            public int compare(Course o1, Course o2) {
                return  o1.getName().compareTo(o2.getName());
            }
        }
        );
    }

    public void sortingByLevel (){
        Collections.sort(listOfCourses, new Comparator<Course>() {
                    @Override
                    public int compare(Course o1, Course o2) {
                        if (o1.getLevel() < o2.getLevel()) return -1;
                        if (o1.getLevel() > o2.getLevel()) return 1;
                        return 0;
                    }
                }
        );
    }

    public void sortingByPrice (){
        Collections.sort(listOfCourses, new Comparator<Course>() {
                    @Override
                    public int compare(Course o1, Course o2) {
                        if (o1.getPrice() < o2.getPrice()) return -1;
                        if (o1.getPrice() > o2.getPrice()) return 1;
                        return 0;
                    }
                }
        );
    }

    public void sortingByDuration (){
        Collections.sort(listOfCourses, new Comparator<Course>() {
                    @Override
                    public int compare(Course o1, Course o2) {
                        if (o1.getDuration() < o2.getDuration()) return -1;
                        if (o1.getDuration() > o2.getDuration()) return 1;
                        return 0;
                    }
                }
        );
    }

    public void add(Course course) {
        listOfCourses.add(course);
    }
    public void remove (Course course) {
        listOfCourses.remove(course);
    }

    public List<Course> getListOfCourses() {
        return listOfCourses;
    }

    public Courses filter(Predicate<Course> predicate) {
        Courses res = new Courses();

        for (Course course : listOfCourses) {
            if (predicate.apply(course)) {
                res.add(course);
            }
        }

        return res;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner("\n");
        for (Course course: listOfCourses) {
            joiner.add(course.toString());
        }
        return "Courses:\n" + joiner.toString();
    }


    public void sort(Comparator<Course> comparator) {
        Collections.sort(listOfCourses, comparator);
    }

    @Override
    public Iterator<Course> iterator() {
        return listOfCourses.iterator();
    }
}