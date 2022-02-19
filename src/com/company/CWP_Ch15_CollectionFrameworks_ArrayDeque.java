package com.company;

import java.util.ArrayDeque;

public class CWP_Ch15_CollectionFrameworks_ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> al = new ArrayDeque<>();
        al.add(5);
        al.add(7);
        al.add(9);
        al.add(6);
        al.add(8);
        al.add(9);
        al.addFirst(98);
        al.addLast(87);
        al.addFirst(999);
        al.addLast(111);
        System.out.println(al.getFirst());
        System.out.println(al.getLast());
    }
}
