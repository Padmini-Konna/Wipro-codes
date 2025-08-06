package com.cg.bank.bean;

public class SavingsAccount extends Account {
    private final double minimumBalance = 1000;

    public SavingsAccount(int accNo, String accHolderName, double balance) {
        super(accNo, accHolderName, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= minimumBalance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance. Minimum balance must be maintained.");
        }
    }
}
