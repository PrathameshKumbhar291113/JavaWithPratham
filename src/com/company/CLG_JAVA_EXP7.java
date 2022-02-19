package com.company;
import java.util.Vector;
public class CLG_JAVA_EXP7{
    public static void main(String[] args) {
        Vector <String> info = new Vector<>();
        info.add("Pratham");
        info.add("Sharu");
        info.add("Aditya");
        info.add("Abhijeet");
        info.add("Donald");
        info.add("Rohit");
        info.add("Siddesh");
        for (String element : info) {
            System.out.print(element + "  , ");
        }
        System.out.println();
        System.out.println(info.contains("Pratham"));
        info.remove("Pratham");

        System.out.println(info.contains("Prathamesh"));
        info.add("Prathamesh");

        for(String element : info){
            System.out.print(element + " , ");
        }
    }
}
