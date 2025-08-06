package com.cg.eis.bean;

public class Employee2 {
    private String firstName;
    private String lastName;

    public Employee2(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Employee Full Name: " + firstName + " " + lastName;
    }
}
