package oop.labor07.Lab7_01;

import java.util.ArrayList;

public class Customer {
    private static int numCustomers;
    private final int id;
    private String firstName;
    private String lastName;
    private ArrayList<BankAccount> accounts = new ArrayList<>();

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = ++numCustomers;
    }

    public int getId() {
        return id;
    }

    public ArrayList<BankAccount> getNumAccounts() {
        return accounts;
    }

    public ArrayList<String> getAccountNumbers() {
        ArrayList<String> accountNumbers = new ArrayList<>();
        for (BankAccount account : accounts) {
            accountNumbers.add(account.getAccountNumber());
        }
        return accountNumbers;
    }


    public void addAccount(BankAccount account) {
        for (BankAccount acc : accounts) {
            if (acc.getAccountNumber().equals(account.getAccountNumber())) {
                System.out.println("Account with number " + account.getAccountNumber() + " already exists.");
                return;
            }
        }
        accounts.add(account);
    }

    public BankAccount getAccount(String accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        System.out.println("Account with number " + accountNumber + " not found.");
        return null;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void closeAccount(String accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                account.close();
                accounts.remove(account);
                return;
            }
        }
        System.out.println("Account with number " + accountNumber + " not found.");
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", accounts=" + accounts +
                '}';
    }
}
