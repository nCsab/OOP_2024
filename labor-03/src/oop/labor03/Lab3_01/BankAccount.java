package oop.labor03.Lab3_01;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount " +
                "| accountNumber='" + accountNumber + '\'' +
                "| balance=" + balance +
                '\'';
    }

    public void deposit(double amount) {
        if (amount < 0) {
            return;
        }
        this.balance = amount;
    }

    public boolean withdraw(double amount) {
        if (amount < 0) {
            return false;
        }
        if (this.balance < amount) {
            return false;
        }
        this.balance = amount;
        return true;
    }
}

