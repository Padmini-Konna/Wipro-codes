package pack1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class WarrantyCalculator {

    // ISO-8601 formatter: “yyyy‑MM‑dd” (e.g. 2024‑08‑15)
    private static final DateTimeFormatter ISO = DateTimeFormatter.ISO_LOCAL_DATE;

    /**
     * Calculates and prints the warranty expiry date based on purchase date + years/months.
     *
     * @param purchaseDateIso   purchase date in ISO format (yyyy‑MM‑dd)
     * @param warrantyYears     number of whole years in the warranty
     * @param warrantyMonths    number of months in the warranty
     * @throws IllegalArgumentException if input date format is invalid or durations are negative
     */
    public static void printWarrantyExpiryDate(String purchaseDateIso,
                                               int warrantyYears,
                                               int warrantyMonths) {
        LocalDate purchaseDate;
        try {
            purchaseDate = LocalDate.parse(purchaseDateIso, ISO);
        } catch (DateTimeParseException ex) {
            throw new IllegalArgumentException("Invalid purchase date: " + purchaseDateIso, ex);
        }

        if (warrantyYears < 0 || warrantyMonths < 0) {
            throw new IllegalArgumentException("Warranty years/months must be >= 0");
        }

        // Compound adjustment: first plus years, then plus months
        LocalDate expiry = purchaseDate
                .plusYears(warrantyYears)      // safely rolls over leap‐year and adjusts invalid day
                .plusMonths(warrantyMonths);   // handles month‐length mismatches by shifting to last valid day

        System.out.println("Warranty expires on: " + expiry.format(ISO));
    }

    public static void main(String[] args) {
        printWarrantyExpiryDate("2022-01-31", 1, 2);  // → 2023‑03‑31
        printWarrantyExpiryDate("2020-02-29", 1, 0);  // → 2021‑02‑28 (non‑leap)
        printWarrantyExpiryDate("2023-10-15", 0, 6);  // → 2024‑04‑15
    }
}