package dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeExample {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date: " + currentDate);

        LocalTime currentTime = LocalTime.now();
        System.out.println("Curremnt Time: " + currentTime);

        LocalDateTime currentDateAndTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + currentDateAndTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateAndTime = currentDateAndTime.format(formatter);

        System.out.println("Formatted Date and Time: " + formattedDateAndTime);
    }
}
