package oop.labor12.fel_3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bac bac = new Bac("nevek1.txt");
        System.out.println("Number of students who have successfully passed the BAC exam: " + bac.countPassedStudents());
        System.out.println("List of students who have failed the BAC exam:");
        List<Student> failedStudents = bac.getFailedStudents();
        for (Student student : failedStudents) {
            System.out.println(student);
        }
    }
    }

