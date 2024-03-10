package oop.labor02.bank;

public class BankAccount {
    private String accountNumber;
    private double balance;
    public BankAccount(String accountNumber)
    {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public String getAccountNumber()
    {
        return this.accountNumber;
    }

    public double getBalance()
    {
        return this.balance;
    }
    public void deposit(double amount){
        this.balance += amount;
    }

    public boolean withdraw(double amount)
    {
        if(this.balance < amount || amount<0) return false;
        this.balance -= amount;
        return true;
    }
}
