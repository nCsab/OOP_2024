package oop.labor10.Lab10_03;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Company {
    private String name;
    private ArrayList<Employee> employees;

    public Company(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void hire(Employee employee) {
        employees.add(employee);
    }

    public void hireAll(String csvFile) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(csvFile));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(", ");
            if (parts.length < 6) {
                System.err.println("Invalid line format: " + line);
                continue;
            }
            String firstName = parts[0];
            String lastName = parts[1];
            double salary = Double.parseDouble(parts[2]);
            int year = Integer.parseInt(parts[3]);
            int month = Integer.parseInt(parts[4]);
            int day = Integer.parseInt(parts[5]);

            LocalDate hireDate = LocalDate.of(year, month, day); // Születési dátum LocalDate objektumba

            String department = null;
            if (parts.length == 7) {
                department = parts[6];
            }

            if (department != null) {
                employees.add(new Manager(firstName, lastName, salary, hireDate, department));
            } else {
                employees.add(new Employee(firstName, lastName, salary, hireDate));
            }
        }
        scanner.close();
    }


    public void fire(int id) {
        employees.removeIf(employee -> employee.getID() == id);
    }

    public void printAll(PrintStream out) {
        for (Employee employee : employees) {
            out.println(employee);
        }
    }

    public void printManagers(PrintStream out) {
        for (Employee employee : employees) {
            if (employee instanceof Manager) {
                out.println(employee);
            }
        }
    }

    public void sortByComparator(Comparator<Employee> comp) {
        Collections.sort(employees, comp);
    }
}

