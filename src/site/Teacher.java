package site;

import java.util.ArrayList;

public class Teacher extends Profile {
    private final ArrayList<Courses> teachCourse = new ArrayList<>();
    private final ArrayList<Groups> teachGroup = new ArrayList<>();
    private int rating;
    public Teacher(String name, String phoneNumber, String email) {
        super(name, phoneNumber, email);
    }
//new comment

    @Override
    public String toString() {
        return "Teacher{" +
                "name=" + getName() +
                ", teachCourse=" + teachCourse +
                ", rating=" + rating +
                '}';
    }
}
