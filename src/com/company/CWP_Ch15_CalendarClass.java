package com.company;
import java.util.Calendar;
import java.util.TimeZone;

public class CWP_Ch15_CalendarClass {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone().getID());
    }
}
