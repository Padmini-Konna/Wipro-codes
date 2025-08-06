package com.cg.bank.bean;

public abstract class Account {
    protected int accNo;
    protected String accHolderName;
    protected double balance;

    // Constructor
    public Account(int accNo, String accHolderName, double balance) {
        this.accNo = accNo;
        this.accHolderName = accHolderName;
        this.balance = balance;
    }

    // Abstract method
    public abstract void withdraw(double amount);

    // Deposit method
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited: " + amount);
    }

    // Getters
    public int getAccNo() {
        return accNo;
    }

    public String getAccHolderName() {
        return accHolderName;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account No: " + accNo +
               "\nName: " + accHolderName +
               "\nBalance: " + balance;
    }
}
