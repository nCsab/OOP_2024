package oop.labor03.Lab3_02;

public class Customer {
    private String firstName;
    private String lastName;
    public static final int MAX_ACCOUNTS = 10;
    private int numAccounts;
    private BankAccount account;

    private BankAccount accounts[] = new BankAccount[MAX_ACCOUNTS];

    public Customer(String fistName, String lastName) {
        this.firstName = fistName;
        this.lastName = lastName;
    }

    public int getNumAccounts() {
        return numAccounts;
    }

    public void addAccount(BankAccount account) {
        if (numAccounts < MAX_ACCOUNTS) {
            accounts[numAccounts] = account;
            numAccounts++;
        } else {
            System.out.println("Cannot add more than " + MAX_ACCOUNTS + " accounts.");
        }
    }

    public BankAccount getAccount(String accountNumber) {
        for (int i = 0; i < numAccounts; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                return accounts[i];
            }
        }
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
        for (int i = 0; i < numAccounts; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                accounts[i] = accounts[numAccounts - 1];
                accounts[numAccounts - 1] = null;
                numAccounts--;
                System.out.println("Account " + accountNumber + " closed successfully.");
                return;
            }
        }
        System.out.println("Account " + accountNumber + " does not exist.");
    }


    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append(firstName + ' ' + lastName + " accounts:\n");
        for (int i = 0; i < numAccounts; ++i) {
            result.append("\t" + accounts[i] + "\n");
        }
        return result.toString();
    }
}
