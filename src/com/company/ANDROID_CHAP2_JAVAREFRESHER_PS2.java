package com.company;

public class ANDROID_CHAP2_JAVAREFRESHER_PS2 {
    public static void main(String[] args) {
//        Q1. Write a java program to print the multiplication table of a given number.
        int tableof = 5,result;
        for(int i =1 ; i<=10;i++){
            result = tableof * i;
//            System.out.println(result);
        }
//        Q5 Write a java program to sum first n even numbers using for loops.
        int n = 10 , sum =0;
        for(int i =1 ; i<=n ; i++){
            if(i%2==0){
                sum = sum+i;
            }
        }
        System.out.println(sum);

//      Q6 Write a program to print the following pattern:
        /*
            * * * *
              * * *
                * *
                  *
         */
        int s =4;
        for (int i=1 ;i<=n;i++){
            for(int j =1 ;j<=i ;j++){
                System.out.print("  ");
            }
            for(int j=i ;j<=s ;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}