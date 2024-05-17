package oop.labor10.Lab10_01;

public class Main {
    public static void main(String[] args) {
        SortingDemo demo = new SortingDemo("fruits.txt");
        System.out.println("Gyumolcsok: ");
        demo.printFruits();

        System.out.println("ABC sorrend: ");
        demo.sortAlphabetically();
        demo.printFruits();

        System.out.println("ABC sorrend forditva: ");
        demo.sortReverseAlphabetically();
        demo.printFruits();
    }
}

