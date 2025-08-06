package com.cg.bank.main;

import java.util.Scanner;
import com.cg.bank.bean.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create a savings account
        Account acc = new SavingsAccount(101, "Padmini", 5000);

        System.out.println("\n--- Account Details ---");
        System.out.println(acc.toString());

        acc.deposit(1000);
        acc.withdraw(2000); // This is valid

        acc.withdraw(4000); // This may violate min balance

        sc.close();
    }
}

