package pack1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateDurationCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter a date (dd-MM-yyyy): ");
        String inputDate = scanner.nextLine();

        // Define the date format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        try {
            // Parse the input string to a LocalDate
            LocalDate userDate = LocalDate.parse(inputDate, formatter);

            // Get the current date
            LocalDate currentDate = LocalDate.now();

            // Calculate the duration between the dates
            Period period = Period.between(userDate, currentDate);

            // Calculate total days
            long totalDays = Math.abs(java.time.temporal.ChronoUnit.DAYS.between(userDate, currentDate));

            // Print the result
            System.out.println("\nDuration:");
            System.out.println("Years: " + Math.abs(period.getYears()));
            System.out.println("Months: " + Math.abs(period.getMonths()));
            System.out.println("Days (excluding full months): " + Math.abs(period.getDays()));
            System.out.println("Total Days: " + totalDays);

        } catch (Exception e) {
            System.out.println("Invalid date format. Please use dd-MM-yyyy.");
        }

        scanner.close();
    }
}

