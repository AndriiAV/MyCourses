package site;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Students {
    private ArrayList<Student> listOfStudent = new ArrayList<>();

    public void sortingByName (){
        Collections.sort(listOfStudent, new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        return  o1.getName().compareTo(o2.getName());
                    }
                }
        );
    }

    public void filtering (){
    }

    public void add(Student student) {
        listOfStudent.add(student);
    }
    public void remove (Student student) {
        listOfStudent.remove(student);
    }
}
