import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeZones {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss z");

        ZonedDateTime currentTime = ZonedDateTime.now();

        ZonedDateTime gmtTime = currentTime.withZoneSameInstant(ZoneId.of("GMT"));
        System.out.println("Current Time in GMT: " + gmtTime.format(formatter));

        ZonedDateTime istTime = currentTime.withZoneSameInstant(ZoneId.of("Asia/Kolkata"));
        System.out.println("Current Time in IST: " + istTime.format(formatter));

        ZonedDateTime pstTime = currentTime.withZoneSameInstant(ZoneId.of("America/Los_Angeles"));
        System.out.println("Current Time in PST: " + pstTime.format(formatter));

        
    }
}
