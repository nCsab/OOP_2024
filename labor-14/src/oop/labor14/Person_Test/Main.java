package oop.labor14.Person_Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Csaba", 1990));
        persons.add(new Person("Norbi", 1985));
        persons.add(new Person("David", 1995));

        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });

        for (Person person : persons) {
            System.out.println(person.getName() + " - " + person.getBirthYear());
        }

    }
}
