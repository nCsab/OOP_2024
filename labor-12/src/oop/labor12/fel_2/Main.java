package oop.labor12.fel_2;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage("data11.txt");
        System.out.println("Products before update:");
        printProducts(storage.getProducts());

        int updatedCount = storage.update("update12.txt");
        System.out.println("\nNumber of products updated: " + updatedCount);
        System.out.println("\nProducts after update:");
        printProducts(storage.getProducts());
    }

    private static void printProducts(Map<Integer, Product> products) {
        for (Product product : products.values()) {
            System.out.println(product);
        }
    }


    }
