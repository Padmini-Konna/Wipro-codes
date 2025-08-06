package com.cg.person.main;

import java.util.Scanner;
import com.cg.person.bean.Person;
import com.cg.person.exception.InvalidAgeException;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Input
            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter age: ");
            int age = sc.nextInt();

            // Validate age
            if (age <= 15) {
                throw new InvalidAgeException("Age must be greater than 15.");
            }

            // Valid person
            Person person = new Person(name, age);
            System.out.println("\n✅ Person created successfully!");
            System.out.println(person);

        } catch (InvalidAgeException e) {
            System.out.println("\n❌ Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("\n❌ Invalid input.");
        }

        sc.close();
    }
}
