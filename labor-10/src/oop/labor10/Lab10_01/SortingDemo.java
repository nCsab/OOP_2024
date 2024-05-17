package oop.labor10.Lab10_01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class SortingDemo {

    private ArrayList<String> fruits;

    public SortingDemo(String filename) {
        fruits = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                fruits.add(line.trim());
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sortAlphabetically() {
        Collections.sort(fruits);
    }

    public void sortReverseAlphabetically() {
        Collections.sort(fruits, Collections.reverseOrder());
    }

    public void printFruits() {
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SortingDemo demo = new SortingDemo("fruits.txt");
        System.out.println("Original order:");
        demo.printFruits();

        System.out.println("Sorted alphabetically:");
        demo.sortAlphabetically();
        demo.printFruits();

        System.out.println("Sorted in reverse alphabetical order:");
        demo.sortReverseAlphabetically();
        demo.printFruits();
    }
}
