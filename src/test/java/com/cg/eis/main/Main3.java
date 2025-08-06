package com.cg.eis.main;

import java.util.Scanner;
import com.cg.eis.bean.Employee3;
import com.cg.eis.exception.EmployeeException;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Input
            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();

            // Validate salary
            if (salary < 3000) {
                throw new EmployeeException("Salary must be at least 3000.");
            }

            // If valid, create employee
            Employee3 emp = new Employee3(id, name, salary);
            System.out.println("\n✅ Employee created successfully!");
            System.out.println(emp);

        } catch (EmployeeException e) {
            System.out.println("\n❌ Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("\n❌ Invalid input.");
        }

        sc.close();
    }
}
