package oop.labor07.Lab7_01;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(0.05);
        savingsAccount.deposit(1000);
        System.out.println("Savings Account Balance before interest: $" + savingsAccount.getBalance());
        savingsAccount.addInterest();
        System.out.println("Savings Account Balance after interest: $" + savingsAccount.getBalance());

        CheckingAccount checkingAccount = new CheckingAccount(500);
        System.out.println("\nChecking Account Balance before withdrawal: $" + checkingAccount.getBalance());
        checkingAccount.withdraw(300);
        System.out.println("Checking Account Balance after withdrawal: $" + checkingAccount.getBalance());
        System.out.println("Overdraft Limit: $" + checkingAccount.getOverdraftLimit());

        Bank bank = new Bank("OTP");

        Customer customer1 = new Customer("Nagy", "Csaba");
        Customer customer2 = new Customer("Nagy", "Dezso");

        bank.addCustomer(customer1);
        bank.addCustomer(customer2);

        SavingsAccount savingsAccount1 = new SavingsAccount(0.05);
        CheckingAccount checkingAccount1 = new CheckingAccount(500);
        SavingsAccount savingsAccount2 = new SavingsAccount(0.03);
        CheckingAccount checkingAccount2 = new CheckingAccount(1000);

        customer1.addAccount(savingsAccount1);
        customer1.addAccount(checkingAccount1);
        customer2.addAccount(savingsAccount2);
        customer2.addAccount(checkingAccount2);

        savingsAccount1.deposit(2000);
        checkingAccount1.deposit(1000);
        savingsAccount2.deposit(3000);
        checkingAccount2.deposit(1500);

        bank.printCustomersToStdout();

        savingsAccount1.addInterest();
        savingsAccount2.addInterest();

        bank.printCustomersToStdout();

        savingsAccount1.withdraw(500);
        checkingAccount1.withdraw(200);
        savingsAccount2.withdraw(700);
        checkingAccount2.withdraw(300);

        bank.printCustomersToStdout();
    }
}

