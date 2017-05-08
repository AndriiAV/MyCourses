package site;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Runner {
    public static void main(String[] args) throws ParseException {
        Course course1 = new Course("Excel", "Excel for beginners", 1, 2000.00, 4);
        Course course2 = new Course("Word", "Word for professionals", 3, 3000.00, 6);
        Course course3 = new Course("Excel", "Excel for professionals", 3, 3500.00, 1);
        Course course4 = new Course("Excel", "Excel for users", 2, 1500.00, 3);

        Courses courses1 = new Courses();
        courses1.add(course1);
        courses1.add(course2);
        courses1.add(course3);
        courses1.add(course4);

        System.out.println("Normal");
        System.out.println(courses1);
        System.out.println("By name");
        courses1.sortingByName();
        System.out.println(courses1);
        System.out.println("By level");
        courses1.sortingByLevel();
        System.out.println(courses1);
        System.out.println("By price");
        courses1.sortingByPrice();
        System.out.println(courses1);
        System.out.println("By duration");
        courses1.sortingByDuration();
        System.out.println(courses1);


        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

        Teacher teacher1 = new Teacher("Petro", "(050)123-45-67", "petro@gmail.com");

        Poster poster1 = new Poster(course1, sdf.parse("15.05.2017"), teacher1);
        Poster poster2 = new Poster(course2, sdf.parse("30.05.2017"), teacher1);
        Posters posters1 = new Posters();
        posters1.add(poster1);
        posters1.add(poster2);

        Group group1 = new Group(course1, teacher1);
        Student student1 = new Student("Ivan", "(067)123-45-89", "ivan@gmail.com");
        Students studentsList = new Students();
        studentsList.add(student1);

        Groups student1Groups = new Groups();
        student1Groups.add(group1);
        group1.add(student1);

        Group group2 = new Group(course2, teacher1);
        Groups groups1 = new Groups();
        groups1.add(group1);
        groups1.add(group2);

        //System.out.println(courses1);

    }
}
