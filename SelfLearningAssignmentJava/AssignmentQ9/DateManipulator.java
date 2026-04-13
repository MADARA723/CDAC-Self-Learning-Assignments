package AssignmentQ9;



import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateManipulator {

    private static final DateTimeFormatter FORMATTER =
            DateTimeFormatter.ofPattern("dd-MM-yyyy");

    // 🔹 String → Date
    public static LocalDate stringToDate(String dateStr) {
        return LocalDate.parse(dateStr, FORMATTER);
    }

    // 🔹 Date → String
    public static String dateToString(LocalDate date) {
        return date.format(FORMATTER);
    }

    // 🔹 Days between (manual calculation)
    public static int daysBetween(LocalDate d1, LocalDate d2) {

        // ensure d1 is before d2
        if (d1.isAfter(d2)) {
            LocalDate temp = d1;
            d1 = d2;
            d2 = temp;
        }

        int days = 0;

        while (!d1.equals(d2)) {
            d1 = d1.plusDays(1); // move one day forward
            days++;
        }

        return days;
    }
}