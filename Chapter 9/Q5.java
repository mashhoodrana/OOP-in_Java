import java.util.GregorianCalendar;

public class Q5 {

    public static void main(String[] args) {
        // Get current date information
        GregorianCalendar calendar = new GregorianCalendar();
        int year = calendar.get(GregorianCalendar.YEAR);
        int month = calendar.get(GregorianCalendar.MONTH) + 1; // Month is 0-indexed
        int day = calendar.get(GregorianCalendar.DAY_OF_MONTH);

        System.out.println("Current Date:");
        System.out.printf("Year: %d, Month: %d, Day: %d\n", year, month, day);

        // Set elapsed time to 1234567898765L
        calendar.setTimeInMillis(1234567898765L);

        year = calendar.get(GregorianCalendar.YEAR);
        month = calendar.get(GregorianCalendar.MONTH) + 1; // Month is 0-indexed
        day = calendar.get(GregorianCalendar.DAY_OF_MONTH);

        System.out.println("Date for elapsed time 1234567898765L:");
        System.out.printf("Year: %d, Month: %d, Day: %d\n", year, month, day);
    }
}