package com.cg.bank.bean;

public class CurrentAccount extends Account {
    private final double overdraftLimit = 5000;

    public CurrentAccount(int accNo, String accHolderName, double balance) {
        super(accNo, accHolderName, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Overdraft limit exceeded. Cannot withdraw.");
        }
    }
}

