package com.company;
public class CWP_Ch7_PS_MethodsNRecursion {
//    Q1 Write a Java method to print the multiplication table of a number n.
   /* static void mulTable(int n){
        for(int i=1 ; i<=10 ; i++){
            System.out.println(n*i);
        }
    } */

// Q2 Write a program using functions to print the following pattern:
//  *
//  * *
//  * * *
//  * * * *

  /*static void pattern1(int n){
      for(int i=1 ;i<=n ; i++){
          for(int j=1 ;j<=n;j++){
              System.out.print("");
          }
          for(int j=1 ;j<=i ;j++){
              System.out.print("* ");
          }
          System.out.println();
      }
  } */

//Q3 Write a recursive function to calculate the sum of first n natural numbers.
    /*static int sum(int n){
       if(n==1) {
           return 1;
       }else{
           return n +sum(n-1);
       }
    } */

//Q4 Write a function to print the following pattern:
//    * * * *
//    * * *
//    * *
//    *
        /*static void pattern2(){
          for(int i = 1; i<= 5; i++){
              for(int j=1 ;j<=i;j++){
                  System.out.print("");
              }
              for(int j = i; j<= 5; j++){
                  System.out.print("* ");
              }
              System.out.println();
          }
        } */

//Q5 Write a function to print the nth term of the Fibonacci series using recursion.
    /*static int fibRec(int n){
        if(n==1||n==2){
            return n-1;
        }else{
            return fibRec(n-1) + fibRec(n-2);
        }
    } */

//Q6 Write a function to find the average of a set of numbers passed as arguments.
    /*static int num(int n , int ...marks){
        int avg =0;
        for(int i=0 ; i< n; i++){
          avg = avg+marks[i];
        }
        return avg/n;
    } */

//Q7 Write a program using functions to print the following pattern: using recursion
//  *
//  * *
//  * * *
//  * * * *
/*  static void pattern1_rec(int n){
    if (n > 0) {
        pattern1_rec(n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();
     }
  } */

//    Q8 Write a function to print the following pattern:
//    * * * *
//    * * *
//    * *
//    *
//    ans not got

//    Q9 Write a function to convert Celsius temperature into Fahrenheit
  /*  static float tempConverter(float n){
        return n*(9f/5) + 32;
    }  */

//   Q10  Write  iterative function to calculate the sum of first n natural numbers.
        static int sumOFNTerm(int n){
            int sum =0;
            for(int i = 1 ;i<=n;i++){
                sum = sum+i;
            }
            return sum;
        }

    public static void main(String[] args) {
//        Calling for Q1 method :: method line 3
//          int a =5;
//          mulTable(a);

//          Calling for Q2 :: method 10
//          pattern1(5);

//          Calling for Q3 :: method 28
//          System.out.println(sum(5));

//          Calling method Q4 :: method 37
//            pattern2();

//          Calling method Q5 :: method 54
//          System.out.println(fibRec(6));

//          Calling method Q6 :: method 63
//          System.out.println(num(3 ,12,15,20));

//          Calling method Q7 :: method 72
//            pattern1_rec(5);

//         Calling method Q8 :: method 87
//        Not solved

//        Calling method Q9 :: method 94
//        System.out.println(tempConverter(5));

//        Calling method Q10 :: method 99
        System.out.println(sumOFNTerm(5));
    }
}
