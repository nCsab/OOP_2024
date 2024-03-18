package oop.labor04.Lab4_02;

import java.util.ArrayList;

public class Customer {
    private String firstName;
    private String lastName;
    private ArrayList<BankAccount> accounts = new ArrayList<>();


    public Customer(String fistName, String lastName) {
        this.firstName = fistName;
        this.lastName = lastName;
    }

    public ArrayList<BankAccount> getAccounts() {
        return accounts;
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
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", accounts=" + accounts +
                '}';
    }
}
