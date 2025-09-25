import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) { 

        ZonedDateTime nowUtc = ZonedDateTime.now(ZoneId.of("UTC"));

        ZonedDateTime nowKst = nowUtc.withZoneSameInstant(ZoneId.of("Asia/Seoul"));

        LocalDate todayKst = nowKst.toLocalDate();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = todayKst.format(formatter);
        
        System.out.println(formattedDate);
    }
}