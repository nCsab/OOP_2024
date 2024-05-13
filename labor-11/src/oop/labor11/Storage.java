package oop.labor11;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Storage {
    private ArrayList<Product> products;

    public Storage(String filename) {
        products = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split("\\s+");
                int identifier = Integer.parseInt(parts[0]);
                String name = parts[1];
                int amount = Integer.parseInt(parts[2]);
                int price = Integer.parseInt(parts[3]);
                products.add(new Product(identifier, name, amount, price));
            }
            Collections.sort(products);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public int update(String updateFilename) {
        int updatedProductsCount = 0;
        try (Scanner scanner = new Scanner(new File(updateFilename))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split("\\s+");
                int identifier = Integer.parseInt(parts[0]);
                int newAmount = Integer.parseInt(parts[1]);
                for (Product product : products) {
                    if (product.getIdentifier() == identifier) {
                        product.increaseAmount(newAmount);
                        updatedProductsCount++;
                        break;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return updatedProductsCount;
    }

    public Product getProductById(int id) {
       /* for (Product product : products) {
            if (product.getIdentifier() == id) {
                return product;
            }
        }
        return null; // Product not found*/
        int i = Collections.binarySearch(products, null, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return Integer.compare(o1.getIdentifier(), id);
            }
        });

        return null;
    }

    public void displayProducts() {
        for (Product product : products) {
            System.out.println(product);
        }
    }
}