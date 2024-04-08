package oop.labor07.Lab7_01;

public class BankAccount {
    public static final String PREFIX = "OTP";
    public static final int ACCOUNT_NUMBER_LENGTH = 10;
    protected static int numAccounts = 0;
    protected final String accountNumber;
    protected double balance;

    protected BankAccount() {
        ++numAccounts;
        this.accountNumber = createAccountNumber();
    }

    private static String createAccountNumber() {
        int accountIndex = numAccounts;
        String accountNumber = PREFIX + String.format("%0" + (ACCOUNT_NUMBER_LENGTH - PREFIX.length()) + "d", accountIndex);
        return accountNumber;
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
        if (amount < 0 || this.balance < amount) {
            return false;
        }
        this.balance -= amount;
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




