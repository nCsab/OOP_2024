package oop.labor04.Lab4_02;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double v) {
        this.accountNumber = accountNumber;
        this.balance = v;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            return;
        }
        this.balance += amount;
    }

    public void close() {
        this.balance = 0;
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

    @Override
    public String toString() {
        return "BankAccount " +
                "| accountNumber='" + accountNumber + '\'' +
                "| balance=" + balance +
                '\'';
    }
}



