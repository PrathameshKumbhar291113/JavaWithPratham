package com.company;
public class CWP_Ch14_TryCatchBlock_Introduction{
    public static void main(String[] args) {
        int a =400;
        int b=0;
//        int c=a/b'
        int c;
        try{
            c=a/b;
            System.out.println(c);
        }catch (Exception e){
            System.out.println("There was a Exception due to : Reason" + e);
        }
        System.out.println("End Of The Code");
    }
}
