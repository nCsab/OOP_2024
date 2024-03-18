package oop.labor05.model;

public class Course {
    private final String name;
    private final String description;
    private final int duration;

    public Course(String name, String description, int duration) {
        this.name = name;
        this.description = description;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return String.format("%s (%d hours): %s", name, duration, description);
    }
}
