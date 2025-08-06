package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public void getInsuranceScheme(Employee emp) {
        double salary = emp.getSalary();
        String designation = emp.getDesignation();

        if (salary >= 50000 && designation.equalsIgnoreCase("Manager")) {
            emp.setInsuranceScheme("Scheme A");
        } else if (salary >= 20000 && salary < 50000 && designation.equalsIgnoreCase("Programmer")) {
            emp.setInsuranceScheme("Scheme B");
        } else if (salary >= 10000 && salary < 20000 && designation.equalsIgnoreCase("Clerk")) {
            emp.setInsuranceScheme("Scheme C");
        } else {
            emp.setInsuranceScheme("No Scheme");
        }
    }

    @Override
    public void displayEmployeeDetails(Employee emp) {
        System.out.println(emp.toString());
    }
}


