package se.lexicon.skovde.models;

/*
Create a class called BankAccount                                                   - Done
Create fields for account number, balance, customer name, email and phone number.   - Done
Create a constructor that assign values to all fields                               - Done
Make getters and setters for all fields                                             - Done
Create methods to deposit and withdraw funds.                                       - Done
Do not allow a withdrawal to complete if the balance is insufficient.               - Done
Extra: Have a static counter that increment and assign the account number.          -
 */
public class BankAccount {
    private static int counter = 1;

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber; // int is bad for phone numbers

    public BankAccount(double balance, String customerName, String email, String phone)
    {
        this(counter++, balance, customerName, email, phone);// chain constructor MUST be on the first line in a constructor!
    }

    public BankAccount(int accountNumber, double balance, String customerName, String email, String phone)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        phoneNumber = phone;
    }

    public void deposit(double funds)
    {
        balance += funds;//balance = balance + funds;
    }

    public boolean withdraw(double funds)
    {
        if (balance < funds)
        {
            return false;
        }
        else
        {
            this.balance -= funds;
            return true;
        }

    }

    //----- Getters & Setters

    public int getAccountNumber()
    {
        return accountNumber;
    }

    public void setAccountNumber(int accNumber)
    {
        accountNumber = accNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
