package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class CWP_Ch15_CollectionFrameworks_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> al = new LinkedList<>();
        al.add(5);
        al.add(7);
        al.add(9);
        al.add(6);
        al.add(8);
        al.add(9);
        al.addFirst(98);
        al.addLast(87);
        for(int i = 0 ;i<al.size();i++){
            System.out.print(al.get(i) + " , ");
        }
    }
}
