package site;

import java.util.Date;

public class Runner {
    public static void main(String[] args) {
        Course course1 = new Course("Excel", "Excel for beginners", 1, 2000.00, 4);
        Course course2 = new Course("Excel", "Excel for professionals", 3, 3000.00, 6);
        Courses courses1 = new Courses();
        courses1.add(course1);
        courses1.add(course2);

        Poster poster1 = new Poster(course1, new Date());
        Poster poster2 = new Poster(course2, new Date());
        Posters posters1 = new Posters();
        posters1.add(poster1);
        posters1.add(poster2);

        Teacher teacher1 = new Teacher("Petro", "(050)123-45-67", "petro@gmail.com");

        Group group1 = new Group(course1, teacher1);
        Group group2 = new Group(course2, teacher1);
        Groups groups1 = new Groups();
        groups1.add(group1);
        groups1.add(group2);

        Student student1 = new Student("Ivan", "(067)123-45-89", "ivan@gmail.com");
        Groups student1Groups = new Groups();
        student1Groups.add(group1);


        System.out.println(student1);

    }
}
