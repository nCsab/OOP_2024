package oop.labor05.model;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class Training {
    private final Course course;
    private final MyDate startDate;
    private final MyDate endDate;
    private final List<Student> enrolledStudents;

    public Training(Course course, double price, MyDate startDate, MyDate endDate) {
        this.course = course;
        this.startDate = startDate;
        this.endDate = endDate;
        this.enrolledStudents = new ArrayList<>();
    }

    public Course getCourse() {
        return course;
    }

    public MyDate getStartDate() {
        return startDate;
    }

    public MyDate getEndDate() {
        return endDate;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void enroll(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
        }
    }

    public void printToFile() {
        String filename = String.format("%s_%s_%s.csv",
                course.getName(),
                startDate.toString(),
                endDate.toString());
        try (FileWriter writer = new FileWriter(filename)) {
            for (Student student : enrolledStudents) {
                writer.write(student.toString() + "\n");
            }
            writer.flush();
        } catch (IOException e) {
            System.err.println("Failed to write file: " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Training{\n")
                .append("  course='").append(course).append("'\n")
                .append("  startDate=").append(startDate).append("\n")
                .append("  endDate=").append(endDate).append("\n");
        for (Student student : enrolledStudents) {
            builder.append("  ").append(student).append("\n");
        }
        builder.append("}");
        return builder.toString();
    }

    public boolean isEnrolled(Student student) {
        return enrolledStudents.contains(student);
    }
}
