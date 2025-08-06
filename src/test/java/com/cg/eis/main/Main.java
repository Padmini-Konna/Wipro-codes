package com.cg.eis.main;

import java.util.Scanner;
import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeService;
import com.cg.eis.service.EmployeeServiceImpl;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();  // consume newline

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        sc.nextLine(); // consume newline

        System.out.print("Enter Designation (Manager/Programmer/Clerk): ");
        String designation = sc.nextLine();

        // Create employee and service
        Employee emp = new Employee(id, name, salary, designation);
        EmployeeService service = new EmployeeServiceImpl();

        service.getInsuranceScheme(emp);
        System.out.println("\n--- Employee Details ---");
        service.displayEmployeeDetails(emp);

        sc.close();
    }
}
