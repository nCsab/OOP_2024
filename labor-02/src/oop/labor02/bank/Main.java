package oop.labor02.bank;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("OTP00001");
        System.out.println("The account number is: " + account.getAccountNumber());
        System.out.println("The balance is: " + account.getBalance());
        account.deposit(1000);
        boolean result = account.withdraw(500);
        if(!result){
            System.out.println("You don't have sufficient funds for this operation");
        }
        System.out.println("The balance is: " + account.getBalance());
        boolean result2 = account.withdraw(1000);
        if(!result2){
            System.out.println("You don't have sufficient funds for this operation");
        }
        System.out.println("The balance is: " + account.getBalance());
        BankAccount account2 = new BankAccount("OTP00002");
        System.out.println("The account number is: " + account2.getAccountNumber());
        account2.deposit(2000);
        System.out.println("The balance is: " + account2.getBalance());
    }
}
