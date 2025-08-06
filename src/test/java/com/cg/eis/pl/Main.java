/*package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeService;
import com.cg.eis.service.EmployeeServiceImpl;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeService service = new EmployeeServiceImpl();

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Employee Designation (Manager/Programmer/Clerk/etc.): ");
        String designation = sc.nextLine();

        Employee emp = new Employee(id, name, salary, designation);
        service.determineInsuranceScheme(emp);

        System.out.println("\n--- Employee Details ---");
        System.out.println(emp);

        sc.close();
    }
}*/
