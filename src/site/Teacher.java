package site;

import java.util.ArrayList;

public class Teacher extends Profile {
    private final ArrayList<Courses> teachCourse = new ArrayList<>();
    private int rating;
    public Teacher(String name, String phoneNumber, String email) {
        super(name, phoneNumber, email);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teachCourse=" + teachCourse +
                ", rating=" + rating +
                '}';
    }
}
