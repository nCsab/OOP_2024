package oop.labor10.Lab10_01;

public class Main {

    public static void main(String[] args) {
        SortingDemo sortingDemo = new SortingDemo("fruits.txt");
        sortingDemo.printFruits();
        System.out.println("fruits after sorted Alphabetically: ");
        sortingDemo.sortAlphabetically();
        sortingDemo.printFruits();
        System.out.println("fruits after sort reverse Alpabetically: ");
        sortingDemo.sortReverseAlphabetically();
        sortingDemo.printFruits();
    }
}
