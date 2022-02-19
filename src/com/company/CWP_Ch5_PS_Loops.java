package com.company;
import java.util.Scanner;
public class CWP_Ch5_PS_Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//Q1 Write a program to print the following pattern :
/*  * * * *
    * * *
    * *
    *   */
        /*for(int i = 1 ;i<=5 ; i++){
            for(int j=1 ; j<=5;j++){
                System.out.print("");
            }
            for(int j =i ;j<=5 ;j++){
                System.out.print("* ");
            }
            System.out.println();
        } */

        /*       * * * *
                  * * *
                   * *
                    *
         */
       /* for(int i = 1 ;i<=5 ; i++){
            for(int j=1 ; j<=i;j++){
                System.out.print(" ");
            }
            for(int j = i ;j<=5 ;j++){
                System.out.print("* ");
            }
            System.out.println();
        } */

//Q2 Write a program to sum first n even numbers using a for loop.
       /* int n = sc.nextInt();
        int sum = 0;
        for(int i = 1 ;i<=n ;i++){
            if(i%2==0){
                sum = sum+i;
            }
        }
        System.out.println(sum);
    } */

//Q3 Write a program to print the multiplication table of a given number n.
//        int n = sc.nextInt();
//        for(int i =1; i<=10 ;i++) {
//            System.out.println(n * i);
//        }

//Q4  Write a program to print a multiplication table of 10 in reverse order.
//        int n = sc.nextInt();
//        for(int i =10; i>=1 ;i--) {
//            System.out.println(n * i);
//        }

//Q5  Write a program to find the factorial of a given number using for loops.
//        int n = sc.nextInt();
//        int fact =1;
//        for(int i=1 ;i<=n ;i++){
//            fact =fact*i;
//        }
//        System.out.println(fact);

//Q6 Write a program to find the factorial of a given number using while loops.
//        int n = sc.nextInt();
//        int fact =1;
//        int i=1;
//        while(i<=n){
//            fact = fact*i;
//            i++;
//        }
//        System.out.println(fact);

//Q7  Write a program to print the following pattern :

/*  * * * *
    * * *
    * *
    *
 */

    /*    int i=1;
        while( i<=5){

            int j=1;

            while(j<=5){
                System.out.print("");
            j++;
            }
            int k =i;
            while(k<=5){
                System.out.print("* ");
                k++;
            }
            i++;
            System.out.println();
        }  */

//Q8 Write a program to calculate the sum of the numbers occurring in the multiplication table of 8.
       /* int n = 1;
        int sum = 0;
        for(int i =1 ; i<=10 ;i++){
            sum = sum+n*i;
        }
        System.out.println(sum);  */

//Q9 Write a program to sum first n even numbers using a while loop.
       /* int n = sc.nextInt();
        int i=1;
        int sum =0;
        while(i<=n){
            if(i%2==0){
                sum = sum+i;
            }
            i++;
        }
        System.out.println(sum);     */

    }
}
