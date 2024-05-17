package oop.labor10.Lab10_03;

import java.io.FileNotFoundException;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Company company = new Company("RIOT Games");
        company.hireAll("employees.csv");

        System.out.println("ABC sorrend: ");
        company.sortByComparator(Comparator.comparing(Employee::getLastName).thenComparing(Employee::getFirstName));
        company.printAll(System.out);

        System.out.println("\nFizetes szerint csokkeno sorrend: ");
        company.sortByComparator((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()));
        company.printAll(System.out);

        System.out.println("\nVezetok, majd alkalmazottak, mindket kategoria ABC sorrendben:");
        company.sortByComparator((e1, e2) -> {
            if (e1 instanceof Manager && !(e2 instanceof Manager)) {
                return -1;
            } else if (!(e1 instanceof Manager) && e2 instanceof Manager) {
                return 1;
            } else {
                return Comparator.comparing(Employee::getLastName).thenComparing(Employee::getFirstName).compare(e1, e2);
            }
        });
        company.printAll(System.out);
    }
}

