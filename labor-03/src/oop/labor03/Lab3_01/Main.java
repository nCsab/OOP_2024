package oop.labor03.Lab3_01;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("John", "BLACK");
        BankAccount account1 = new BankAccount("OTP0001");
        customer1.setAccount(account1);
        System.out.println(customer1);
        System.out.println(account1.getAccountNumber() + ": " + account1.getBalance());
        account1.deposit(1000);
        System.out.println(account1.getAccountNumber() + ": " + account1.getBalance());
        Customer customer2 = new Customer("Mary", "WHITE");
        BankAccount account2 = new BankAccount("OTP0002");
        customer2.setAccount(account2);
        System.out.println(customer2);
        System.out.println(account2.getAccountNumber() + ": " + account2.getBalance());
        account2.deposit(3000);
        System.out.println(account2.getAccountNumber() + ": " + account2.getBalance());
        account2.withdraw(3000);
        System.out.println(account2.getAccountNumber() + ": " + account2.getBalance());
        customer2.closeAccount();
        System.out.println("Account closed successfully.");
        System.out.println(customer2);
        customer2.setAccount(customer1.getAccount());
        System.out.println(customer2);
    }
}
