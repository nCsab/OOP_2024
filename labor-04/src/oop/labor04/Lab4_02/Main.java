package oop.labor04.Lab4_02;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("lab4_2.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(", ");
                if (data[0].equals("Customer")) {
                    Customer customer = new Customer(data[1], data[2]);
                    customers.add(customer);
                } else if (data[0].equals("Account")) {
                    if (data.length == 3) {
                        BankAccount account = new BankAccount(data[1], Double.parseDouble(data[2]));
                        customers.get(customers.size() - 1).addAccount(account);
                    } else {
                        System.out.println("Invalid data for account: " + line);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Customer customer : customers) {
            System.out.println(customer.getFirstName() + " " + customer.getLastName() + " accounts:");
            for (BankAccount account : customer.getAccounts()) {
                System.out.println(account);
            }
        }
    }
}