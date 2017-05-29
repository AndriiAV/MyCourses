package site;

import java.io.Serializable;
import java.util.Objects;

public class Course implements Serializable{
    private final String name;
    private final String description;
    private final int level; // 1/2/3
    private final double price; // UAH
    private final int duration; // weeks

    private static int nextId = 0;
    private final int id = nextId++;

    public Course(String name, String description, int level, double price, int duration) {
        this.name = name;
        this.description = description;
        this.level = level;
        this.price = price;
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public double getPrice() {
        return price;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", level=" + level +
                ", price=" + price +" UAH"+
                ", duration=" + duration +" weeks"+
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course)) return false;
        Course course = (Course) o;
        return level == course.level &&
                Objects.equals(name, course.name) &&
                Objects.equals(price, course.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, level, price);
    }
}