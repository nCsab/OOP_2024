package oop.labor06.Lab6_01;
import java.io.PrintStream;
import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }


    public Customer getCustomer(int customerId) {
        for (Customer customer : customers) {
            if (customer.getId() == customerId) {
                return customer;
            }
        }
        return null;
    }

    private void printCustomers( PrintStream ps ) {
        ps.println("ID, Firstname, Last name, Number of bank accounts");
        for( Customer customer: customers ) {
            ps.println( customer.getId()+", " + customer.getFirstName() + ", "+
                    customer.getLastName()+", "+customer.getNumAccounts());
        }
        ps.close();
    }
    public void printCustomersToStdout() {
        printCustomers( System.out );
    }
    public void printCustomersToFile( String filename ) {
        try {
            printCustomers( new PrintStream(filename ));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

