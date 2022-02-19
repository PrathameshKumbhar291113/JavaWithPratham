package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CWP_Ch15_JavaTimePackage_DateTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd:MM:yyyy -- E H:m a");
        DateTimeFormatter dtf2 = DateTimeFormatter.ISO_LOCAL_DATE;
        String MyDate = ldt.format(dtf);
        String MyDate2 = ldt.format(dtf2);
        System.out.println(MyDate);
        System.out.println(MyDate2);
    }
}
