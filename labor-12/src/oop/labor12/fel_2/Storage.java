package oop.labor12.fel_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Storage {
    private TreeMap<Integer, Product> products;

    public Storage(String filename) {
        products = new TreeMap<>();
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split("\\s+");
                int identifier = Integer.parseInt(parts[0]);
                String name = parts[1];
                int amount = Integer.parseInt(parts[2]);
                int price = Integer.parseInt(parts[3]);
                products.put(identifier, new Product(identifier, name, amount, price));
            }
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
                Product product = products.get(identifier);
                if (product != null) {
                    product.increaseAmount(newAmount);
                    updatedProductsCount++;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return updatedProductsCount;
    }

    public Map<Integer, Product> getProducts() {
        return products;
    }
}