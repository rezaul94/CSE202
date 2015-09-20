/**
 * Created by USER on 9/20/2015.
 */
public class Account {
    private Customer customer;
    private int accountNumber;
    private double balance;
    private String branch;

    public Account(Customer customer, int accountNumber, double balance){
        this.customer=customer;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    public Account(Customer customer, int accountNumber, String branch){
        this.customer=customer;
        this.accountNumber=accountNumber;
        this.branch=branch;
        this.balance=0;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public String getBranch() {
        return branch;
    }

    public String getCustomerName(){
        return customer.getName();
    }

    public void credit(double ammount){
        balance+=ammount;
    }

    public void debit(double ammount){
        if (ammount <= balance) {
            balance -= ammount;
        } else {
            System.out.println("Amount withdrawn exceeds the current balance!");
        }
    }

    public void print(){
        System.out.println("Customer: " + getCustomerName()+" Branch: "+ getBranch()+ " A/C no: "+ getAccountNumber() + " Balance: " + getBalance());
    }
}
