package oop.labor06.Lab6_01;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("OTP");

        Customer customer1 = new Customer("John", "Doe");
        Customer customer2 = new Customer("Jane", "Doe");
        bank.getCustomers().add(customer1);
        bank.getCustomers().add(customer2);

        for (int i = 0; i < 2; i++) {
            customer1.addAccount(new BankAccount());
            customer2.addAccount(new BankAccount());
        }

        Customer customerWithId1 = bank.getCustomer(1);
        if (customerWithId1 != null) {
            System.out.println("Customer with ID 1:");
            System.out.println(customerWithId1);
            System.out.println("Account numbers: " + customerWithId1.getAccountNumbers());
        } else {
            System.out.println("Customer with ID 1 not found.");
        }

        for (BankAccount account : customer1.getAccounts()) {
            account.deposit(1000);
        }
        for (BankAccount account : customer2.getAccounts()) {
            account.deposit(1500);
        }

        Customer customerWithId2 = bank.getCustomer(2);
        if (customerWithId2 != null) {
            System.out.println("\nCustomer with ID 2:");
            System.out.println(customerWithId2);
            System.out.println("Account numbers: " + customerWithId2.getAccountNumbers());
        } else {
            System.out.println("Customer with ID 2 not found.");
        }
        System.out.println();
        bank.printCustomersToStdout();
        bank.printCustomersToFile("bank_customers.csv");
    }
}