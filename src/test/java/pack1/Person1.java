package pack1;

import java.time.LocalDate;
import java.time.Period;

public class Person1 {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;

    public Person1(String firstName, String lastName, LocalDate dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dob;
    }

    
    public static String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    
    public static int calculateAge(LocalDate dob, LocalDate currentDate) {
        if (dob == null || currentDate == null || dob.isAfter(currentDate)) {
            throw new IllegalArgumentException("Invalid dates");
        }
        return Period.between(dob, currentDate).getYears();
    }

    @Override
    public String toString() {
        String fullName = getFullName(firstName, lastName);
        int age = calculateAge(dateOfBirth, LocalDate.now());
        return "Person: " + fullName + ", Age: " + age;
    }

    public static void main(String[] args) {
        Person1 p1 = new Person1("John", "Doe", LocalDate.of(1990, 5, 20));
        Person1 p2 = new Person1("Jane", "Smith", LocalDate.of(2003, 12, 15));

        System.out.println(p1);
        System.out.println(p2);
    }
}

