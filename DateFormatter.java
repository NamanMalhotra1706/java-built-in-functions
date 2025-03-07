import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatter{
    public static void main(String[] args) {
        LocalDate todayDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String formatedDateTime = todayDate.format(formatter);
        System.out.print("Modiefied date: "+formatedDateTime);

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formatedDateTime2String = todayDate.format(formatter2);
        System.out.print("\nModiefied date: "+formatedDateTime2String);

        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
        String formatedDateTime3String = todayDate.format(formatter3);
        System.out.print("\nModiefied date: "+formatedDateTime3String);


    }
}