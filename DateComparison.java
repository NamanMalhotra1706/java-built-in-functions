import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateComparison {
    public static void main(String[] args) {
        LocalDate todayDate = LocalDate.now();
        System.out.println("Today Date: "+todayDate);
        LocalDate eventDate = LocalDate.of(2025, 3, 9);

        System.out.println("Event Date: "+eventDate);
        System.out.println("Is today before event date?  " + todayDate.isBefore(eventDate));
        System.out.println("Is today after event date?  " + todayDate.isAfter(eventDate));
        System.out.println("Is today is event date?  " + todayDate.isEqual(eventDate));
    }
}


// Sample Case
// Today Date: 2025-03-07
// Event Date: 2025-03-09
// Is today before event date?  true
// Is today after event date?  false
// Is today is event date?  false