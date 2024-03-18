package oop.labor05;

import oop.labor05.model.Student;
import oop.labor05.model.Course;
import oop.labor05.model.MyDate;
import oop.labor05.model.Training;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Course> courses = readCourses("courses.csv");
        ArrayList<Student> students = readStudents("students.csv");

        Random random = new Random();
        ArrayList<Training> trainings = new ArrayList<>();

        for (Course course : courses) {
            double price = 1000 + (2000 - 1000) * random.nextDouble();
            MyDate startDate = new MyDate(2023, 3, 21);
            MyDate endDate = new MyDate(2023, 3, 25);
            Training training = new Training(course, price, startDate, endDate);

            for (int i = 0; i < 10; i++) {
                int studentIndex = random.nextInt(students.size());
                Student student = students.get(studentIndex);
                training.enroll(student);
            }

            trainings.add(training);
        }

        for (Student student : students) {
            System.out.println(student.getFirstName() + " " + student.getLastName());
            for (Training training : trainings) {
                if (training.isEnrolled(student)) {
                    System.out.println(training.getCourse().getName() + ", " + training.getCourse().getDescription());
                }
            }
        }
    }

    private static ArrayList<Student> readStudents(String fileName) {
        ArrayList<Student> students = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length < 3) {
                    continue;
                }
                String id = parts[0];
                String firstName = parts[1];
                String lastName = parts[2];
                students.add(new Student(id, firstName, lastName));
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        return students;
    }

    private static ArrayList<Course> readCourses(String fileName) {
        ArrayList<Course> courses = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length < 3) {
                    continue;
                }
                String name = parts[0];
                String description = parts[1];
                int numHours = Integer.parseInt(parts[2].trim());
                courses.add(new Course(name, description, numHours));
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        return courses;
    }
}
