package oop.labor03.Lab3_02;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Dean", "GREEN");
        for (int i = 1; i <= 5; i++) {
            BankAccount account = new BankAccount("account" + i);
            customer1.addAccount(account);
            int depositAmount = (int) (Math.random() * 10000);
            account.deposit(depositAmount);
        }
        Customer customer2 = new Customer("Sam", "BROWN");
        for (int i = 1; i <= 9; i++) {
            BankAccount account = new BankAccount("account" + i);
            customer2.addAccount(account);
            int depositAmount = (int) (Math.random() * 5000);
            account.deposit(depositAmount);
        }
        System.out.println(customer1);
        System.out.println(customer2);
        customer1.closeAccount(customer1.getAccount("account1").getAccountNumber());
        customer2.closeAccount(customer2.getAccount("account9").getAccountNumber());
        System.out.println(customer1);
        System.out.println(customer2);
    }
}
