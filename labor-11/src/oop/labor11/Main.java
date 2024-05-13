package oop.labor11;

public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage("data11.txt");
        System.out.println("Products before update:");
        storage.displayProducts();
        int updatedCount = storage.update("update12.txt");
        System.out.println("\nNumber of products updated: " + updatedCount);
        System.out.println("\nProducts after update:");
        storage.displayProducts();


    }
}
