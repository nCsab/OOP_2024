package oop.labor10.Lab10_03;

import java.time.LocalDate;

public class Employee {
    private static int counter = 1;

    private int ID;
    private String firstName;
    private String lastName;
    private double salary;
    private LocalDate birthDate;

    public Employee(String firstName, String lastName, double salary, LocalDate birthDate) {
        this.ID = counter++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.birthDate = birthDate;
    }

    public int getID() {
        return ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("Employee{ID=%d, firstName='%s', lastName='%s', salary=%.2f, birthDate=%s}", ID, firstName, lastName, salary, birthDate);
    }
}

