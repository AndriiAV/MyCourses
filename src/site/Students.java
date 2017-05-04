package site;

import java.util.ArrayList;

public class Students {
    private ArrayList<Student> listOfStudent = new ArrayList<>();

    public void sorting (){
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
