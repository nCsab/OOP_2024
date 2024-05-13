package oop.labor12.fel_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Bac {
    private HashSet<Integer> studentIds = new HashSet<>();
    private Map<Integer, Student> students = new HashMap<>();

    public Bac(String fileName) {
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String[] tokens = scanner.nextLine().split(" ");
                int id = Integer.parseInt(tokens[0]);
                String firstName = tokens[1];
                String lastName = tokens[2];
                Student student = new Student(id, firstName, lastName);
                students.put(id, student);
                studentIds.add(id);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        readExamResults("Magyar", "magyar.txt");
        readExamResults("Roman", "roman.txt");
        readExamResults("Matek", "matek.txt");

        for (Student student : students.values()) {
            student.calculateAverage();
        }
    }

    private void readExamResults(String subject, String fileName) {
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String[] tokens = scanner.nextLine().split(" ");
                int id = Integer.parseInt(tokens[0]);
                double mark = Double.parseDouble(tokens[1]);
                Student student = students.get(id);
                if (student != null) {
                    student.addMark(subject, mark);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public int countPassedStudents() {
        return (int) students.values().stream().filter(Student::hasPassed).count();
    }

    public List<Student> getFailedStudents() {
        List<Student> failedStudents = new ArrayList<>();
        for (int id : studentIds) {
            Student student = students.get(id);
            if (student != null && !student.hasPassed()) {
                failedStudents.add(student);
            }
        }
        failedStudents.sort(Comparator.comparing(Student::getLastName).thenComparing(Student::getFirstName));
        return failedStudents;
    }
}
