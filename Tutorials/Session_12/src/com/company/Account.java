package com.company;

public class Account {
    private String name;
    private String email;
    private String phone;
    private int accountNumber;
    private double balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0.0;
        }
    }

    public void deposit(double money) {
        if(money <= 0) {
            System.out.println("Invalid amount. Cannot deposit");
        } else {
            this.balance += money;
            System.out.println("You deposited: $" + money + ". Your new balance is: " + this.balance);
        }
    }

    public void withdraw(double money) {
        if(this.balance - money < 0) {
            System.out.println("Withdrawn not possible because withdraw amount is more than your balance");
            System.out.println("You only have a balace of $" + this.balance);
        } else {
            System.out.println("You withdrawed amount: " + money);
            this.balance -= money;
            System.out.println("Remaining balance is: " + this.balance);
        }
    }
}
