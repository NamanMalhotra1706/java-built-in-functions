import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZone{
    public static void main(String[] args) {
        ZonedDateTime zonalTime = ZonedDateTime.now();
        System.out.println("Zonal Time(IST): "+ zonalTime);

        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));
        System.out.println("Zonal Time(GMT): "+gmtTime);

        ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println("Zonal Time(PST): "+pstTime);
    }
}
