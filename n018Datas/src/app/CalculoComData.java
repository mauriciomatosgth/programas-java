package app;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class CalculoComData {
    public static void main(String[] args) {
        // alterar datas e ver a duração entre uma data e outra
        Date x1 = new Date();
        Date x2 = new Date(System.currentTimeMillis());
        Date x3 = new Date(0L);

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusDays(14);
        LocalDate nextYearLocalDate = d04.plusYears(14);


        System.out.println("pastWeekLocalDate = " +pastWeekLocalDate);
        System.out.println("nextWeekLocalDate " +nextWeekLocalDate);
        System.out.println("nextWeekLocalDate " +nextYearLocalDate);


        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d05.plusDays(14);

        System.out.println("pastWeekLocalDateTime = " +pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime = " +nextWeekLocalDateTime);

       Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
       Instant nextWeekInstant = d06.plus(7,ChronoUnit.DAYS);

        System.out.println("pastWeekInstant = "+ pastWeekInstant);
        System.out.println("nextWeekInstant = "+ nextWeekInstant);

        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(),d04.atStartOfDay());
        Duration t2 = Duration.between(pastWeekLocalDateTime,d05);
        Duration t3 = Duration.between(pastWeekInstant,d06);
        Duration t4 = Duration.between(d06,pastWeekInstant);


        System.out.println("t1 dias = "+t1.toDays());
        System.out.println("t2 dias = "+ t2.toDays());
        System.out.println("t3 dias = "+ t3.toDays());
        System.out.println("t4 dias = "+ t4.toDays());

        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);





    }
}
