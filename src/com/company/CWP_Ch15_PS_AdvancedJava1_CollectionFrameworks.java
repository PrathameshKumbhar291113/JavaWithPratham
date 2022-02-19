package com.company;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class CWP_Ch15_PS_AdvancedJava1_CollectionFrameworks {
    public static void main(String[] args) {
//        Q1 Create an ArrayList and store the names of ten students inside it. Print it using a for each loop.
        ArrayList<String> al = new ArrayList<>();
        al.add("Stud 1");
        al.add("Stud 2");
        al.add("Stud 3");
        al.add("Stud 4");
        al.add("Stud 5");
        al.add("Stud 6");
        al.add("Stud 7");
        al.add("Stud 8");
        al.add("Stud 9");
        al.add("Stud 10");

//        for(int i=0 ;i<al.size();i++){
//            System.out.println(al.get(i));
//        }
        for (Object o: al) {//Used for each loop to print the array list
            System.out.println(o);
        }

//        Q2 Use the Date class in Java to print the time in the following format : 21:47:02.
        Date d =new Date();
        System.out.println(d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());

//        Q3 Use the Calendar class in Java to print the time in the following format : 21:47:02.
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));

//        Q4 Use the java.time API in Java to print the time in the following format : 21:47:02
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dtf =DateTimeFormatter.ofPattern("H : m : s . a");
        String MyDate = ldt.format(dtf);
        System.out.println(MyDate);
//        Q5  Create a Set(HashSet) in java. Try to store the duplicate values elements inside this set and verify that only one instance is stored.
        HashSet<Integer> hs = new HashSet<>(6,0.5f);
        hs.add(99);
        hs.add(12);
        hs.add(55);
        hs.add(12);
        hs.add(66);
        hs.add(99);
        System.out.println(hs);


    }
}
