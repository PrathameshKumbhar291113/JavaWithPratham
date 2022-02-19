package com.company;
public class CWP_RecursionDetailBasics {

//    Q1 Print num from 5 to 1
   /* static void printNumb(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNumb(n-1);
    } */

//    Q2 Print num from 1 to 5
  /*  static void printNum(int n ){
        if(n==6)
         return ;
        System.out.println(n);
        printNum(n + 1);
    }   */

//    Q3 print sum of n terms (ascending order)
     /*   static void sumOfNum(int i ,int n ,int sum){
            if(i==n) {
                sum += i;
                System.out.println(sum);
                return;
            }
            sum+=i;
            sumOfNum(i+1 , n ,sum);
        }   */

//    Q4 Print factorial of number n
    /*static int facto(int n){
        if(n==0||n==1){
            return 1;
        }else {
            return n*facto(n-1);
        }
    } */



//    Q5 Print fibonacci series till n term (output should be like - 0,1,1,2,3,5,8,13)
    /*static void printFibSeries(int a ,int b ,int n){
        if(n==0){
            return;
        }
        int c = a+b;
        System.out.println(c);
        printFibSeries(b ,c,n-1);
    } */

//    Print x^n (stack height  = n)
    /*static int calcPower(int x , int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int xPowNM1 =calcPower(x,n-1);
        int xPowN = x*xPowNM1;
        return xPowN;
    } */

//    Q7 Print x^n (stack height = log n)
  static int calcPower(int x , int n) {
       if (n == 0) {
           return 1;
       }
       if (x == 0) {
           return 0;
       }
       if(n%2==0){
           return calcPower(x,n/2)*calcPower(x ,n/2);
       }else{
           return calcPower(x , n/2)*calcPower(x,n/2)* x;
       }
  }
    public static void main(String[] args) {
//        Q1 Rec method calling
//        printNumb(5);

//        Q2 Rec method calling
//        printNum(1);

//        Q3 Rec method calling
//                sumOfNum(1 , 7 ,0);

//        Q4 Rec method calling
//         System.out.println(facto(6));

//        Q5 Rec method calling
//        int a =0 ,b=1;
//        System.out.println(a);
//        System.out.println(b);
//        int n = 43;
//        printFibSeries(a ,b ,n-2);

//        Q6 Rec method calling
        /*  int x=2 , n=5;
          int ans = calcPower(x,n);
        System.out.println(ans);   */

//        Q7 Rec method calling
        int x=2 , n=5;
        int ans = calcPower(x,n);
        System.out.println(ans);
    }
}
