package com.cg.eis.main;

import java.util.Scanner;
import com.cg.eis.bean.Employee2;
import com.cg.eis.exception.InvalidNameException;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Input
            System.out.print("Enter First Name: ");
            String firstName = sc.nextLine().trim();

            System.out.print("Enter Last Name: ");
            String lastName = sc.nextLine().trim();

            // Validation
            if (firstName.isEmpty() || lastName.isEmpty()) {
                throw new InvalidNameException("First name and Last name cannot be blank.");
            }

            // Create Employee
            Employee2 emp = new Employee2(firstName, lastName);
            System.out.println("\n✅ Employee created successfully!");
            System.out.println(emp);

        } catch (InvalidNameException e) {
            System.out.println("\n❌ Error: " + e.getMessage());
        }

        sc.close();
    }
}

