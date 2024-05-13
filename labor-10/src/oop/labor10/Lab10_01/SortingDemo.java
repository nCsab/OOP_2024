package oop.labor10.Lab10_01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class SortingDemo {
    private ArrayList<String> fruits;


    public SortingDemo(String filename) {
        fruits = new ArrayList<>();
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                fruits.add(scanner.next());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void printFruits() {
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();
    }

    public void sortReverseAlphabetically() {
        Collections.sort(fruits, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }

        });
    }

    public void sortAlphabetically() {
        Collections.sort(fruits);
    }
}
