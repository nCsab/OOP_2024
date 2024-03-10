package oop.labor03.Lab3_01;

public class Customer {
    private String firstName;
    private String lastName;
    private BankAccount account;

    public Customer(String fistName, String lastName) {
        this.firstName = fistName;
        this.lastName = lastName;
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public BankAccount getAccount() {
        return account;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void closeAccount() {
        this.account = null;
    }

    @Override
    public String toString() {
        return "Customer " +
                "| firstName='" + firstName + '\'' +
                "| lastName='" + lastName + '\'' +
                "| account=" + account +
                '\'';
    }
}

