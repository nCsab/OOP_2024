package oop.labor10.Lab10_03;

import java.time.LocalDate;

class Manager extends Employee {
    private String department;

    public Manager(String firstName, String lastName, double salary, LocalDate birthDate, String department) {
        super(firstName, lastName, salary, birthDate);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return String.format("Manager{ID=%d, firstName='%s', lastName='%s', salary=%.2f, birthDate=%s, department='%s'}", getID(), getFirstName(), getLastName(), getSalary(), getBirthDate(), department);
    }
}
