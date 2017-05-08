package site;

public class Course {
    private final String name;
    private final String description;
    private final int level; // 1/2/3
    private final double price; // UAH
    private final int duration; // weeks
    private boolean available = false; // no/yes

    public Course(String name, String description, int level, double price, int duration) {
        this.name = name;
        this.description = description;
        this.level = level;
        this.price = price;
        this.duration = duration;
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

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
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
}