package org.example.Date;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class Date {
    public static void main(String[] args) throws InterruptedException {


        Instant start = Instant.now();
        System.out.println(start);
        Thread.sleep(1000);
        Instant end = Instant.now();
        Duration duration  = Duration.between(start,end);
        System.out.println("Difference in seconds: " +duration.getSeconds());


        LocalDate today = LocalDate.now();
        System.out.println(today);

        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_YEAR,7);
        System.out.println(cal.getTime());

        LocalDate date = LocalDate.now();
        LocalDate newdate = date.minus(4, ChronoUnit.DAYS);
        System.out.println(newdate);

        ZonedDateTime dt = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println(dt);
    }

}
