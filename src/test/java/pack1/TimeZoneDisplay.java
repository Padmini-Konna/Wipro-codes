package pack1;

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeZoneDisplay {
    public static void printCurrentDateTime(String zoneIdStr) {
        try {
            ZoneId zoneId = ZoneId.of(zoneIdStr);
            ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneId);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
            System.out.println("Current date and time in " + zoneIdStr + ": " + zonedDateTime.format(formatter));
        } catch (Exception e) {
            System.out.println("Invalid Zone ID: " + zoneIdStr);
        }
    }

    public static void main(String[] args) {
        printCurrentDateTime("America/New_York");
        printCurrentDateTime("Europe/London");
        printCurrentDateTime("Asia/Tokyo");
        printCurrentDateTime("US/Pacific");
        printCurrentDateTime("Africa/Cairo");
        printCurrentDateTime("Australia/Sydney");
    }
}
