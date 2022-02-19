package com.company;
import java.util.*;
public class CWP_Ch15_CollectionFrameworks_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
         al.add(5);
         al.add(7);
         al.add(9);
         al.add(6);
         al.add(8);
         al.add(9);
         ArrayList<Integer> al2 = new ArrayList<>(5);
         al2.add(209);
         al2.add(221);
         al2.add(988);
         al2.add(111);
        al.addAll( al2 );
        al.set(2 , 3);
        System.out.println(al.contains(9));
        System.out.println(al.contains(99));
        System.out.println(al.indexOf(999));
        System.out.println(al.indexOf(9));
        System.out.println(al.lastIndexOf(9));
         for(int i = 0 ;i<al.size();i++){
             System.out.print(al.get(i) + " , ");
         }
    }
}
