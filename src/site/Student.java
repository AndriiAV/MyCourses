package site;

import java.util.ArrayList;

public class Student extends Profile {


//    private ArrayList<Course> registeredCourses = new ArrayList<>();
    private ArrayList<Group> studentGroups = new ArrayList<>();

 /*   public void setRegisteredCourses(ArrayList<Course> registeredCourses) {
        this.registeredCourses = registeredCourses;
    }
*/    public void setStudentGroups(ArrayList<Group> studentGroups) {
        this.studentGroups = studentGroups;
    }

    public Student(String name, String phoneNumber, String email) {
        super(name, phoneNumber, email);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name=" + getName() +
                ", PhoneNumber=" + getPhoneNumber() +
                ", Email=" + getEmail() +
  //              ", registeredCourses=" + registeredCourses +
                ", studentGroups=" + studentGroups +
                '}';
    }
}
