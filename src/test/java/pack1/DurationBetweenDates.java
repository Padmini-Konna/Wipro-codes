package pack1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DurationBetweenDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        try {
            // Input first date
            System.out.print("Enter the first date (dd-MM-yyyy): ");
            String firstInput = scanner.nextLine();
            LocalDate date1 = LocalDate.parse(firstInput, formatter);

            // Input second date
            System.out.print("Enter the second date (dd-MM-yyyy): ");
            String secondInput = scanner.nextLine();
            LocalDate date2 = LocalDate.parse(secondInput, formatter);

            // Ensure the earlier date comes first
            if (date2.isBefore(date1)) {
                LocalDate temp = date1;
                date1 = date2;
                date2 = temp;
            }

            // Calculate the period
            Period period = Period.between(date1, date2);

            // Calculate total number of days
            long totalDays = java.time.temporal.ChronoUnit.DAYS.between(date1, date2);

            // Output
            System.out.println("\nDuration between the two dates:");
            System.out.println("Years : " + period.getYears());
            System.out.println("Months: " + period.getMonths());
            System.out.println("Days  : " + period.getDays());
            System.out.println("Total number of days: " + totalDays);

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter dates in dd-MM-yyyy format.");
        }

        scanner.close();
    }
}
