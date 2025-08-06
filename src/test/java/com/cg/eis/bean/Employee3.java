package com.cg.eis.bean;

public class Employee3 {
    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employee3(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee ID: " + id +
               "\nName: " + name +
               "\nSalary: " + salary;
    }
}

