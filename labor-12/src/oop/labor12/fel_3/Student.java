package oop.labor12.fel_3;

import java.util.HashMap;
import java.util.Map;

class Student {
    private final int ID;
    private final String firstName;
    private final String lastName;
    private double average;
    private Map<String, Double> marks = new HashMap<>();

    public Student(int ID, String firstName, String lastName) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void addMark(String subjectName, Double mark) {
        marks.put(subjectName, mark);
    }

    public void calculateAverage() {
        double sum = marks.values().stream().mapToDouble(Double::doubleValue).sum();
        average = sum / marks.size();
    }

    public boolean hasPassed() {
        for (double mark : marks.values()) {
            if (mark < 5) {
                return false;
            }
        }
        return average >= 6;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        return "ID: " + ID + ", Name: " + firstName + " " + lastName + "\n" + getExamResults();
    }

    private String getExamResults() {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, Double> entry : marks.entrySet()) {
            result.append("\t").append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }
        return result.toString();
    }
}