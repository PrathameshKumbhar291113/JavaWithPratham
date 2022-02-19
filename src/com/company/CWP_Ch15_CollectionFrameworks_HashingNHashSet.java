package com.company;
import java.util.*;
public class CWP_Ch15_CollectionFrameworks_HashingNHashSet{
     public static void main(String[] args) {
          HashSet<Integer> hs = new HashSet<>(10 , 0.5f);
          hs.add(19);
          hs.add(33);
          hs.add(45);
          hs.add(99);
          hs.add(19);
          System.out.println(hs);
    }
}