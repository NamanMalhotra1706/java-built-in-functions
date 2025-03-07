import java.time.LocalDate;

public class DateArithmetic {
    public static void main(String[] args) {
        LocalDate currenDate = LocalDate.now();
        LocalDate plusDate = currenDate.plusDays(7);
        LocalDate plusMonth = plusDate.plusMonths(1);
        LocalDate plusYear = plusMonth.plusYears(2);

        LocalDate minusWeek = plusYear.minusWeeks(3);

        System.out.println("Modified Date: " + minusWeek);
    }
}

// Sample Case
// Modified Date: 2027-03-24
