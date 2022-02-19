package com.company;

import java.util.ArrayList;
import java.util.Scanner;
class MyGeneric<T1 , T2>{
    int val;
    private T1 t1;
     private T2 t2;


    public MyGeneric(int val, T1 t1 ,T2 t2) {
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }
     public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }


}
public class CWP_Ch16_AdvancedJava_JavaGenerics {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
//       ArrayList<int> arrayList = new ArrayList(); --> This will produce an error
//        arrayList.add("Str1");
//        arrayList.add(11);
//        arrayList.add(867);
//        arrayList.add(new Scanner(System.in));
//        int a = (int)arrayList.get(0);
        MyGeneric<String , Integer> g1 = new MyGeneric(12 ," Pratham " , 125);
        Integer int2 =g1.getVal();
        String str =  g1.getT1();
        Integer int1 = g1.getT2();
        System.out.println( int2 + str + int1);

    }
}
