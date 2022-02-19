package com.company;
import java.util.Scanner;
public class CWP_AllStarPat {
    public static void main(String[] args) {
        Scanner sc  =  new Scanner(System.in);
        System.out.println("Enter the number of stars u want to print");
        int n = sc.nextInt();
//        Star triangle (right angle triangle)
        /*    for(int i = 1 ;i<=n;i++){
                for(int j = 1 ; j<=n ;j++){
                    System.out.print("");
                }
                for(int j =1 ;j<=i;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }       */

//        Reverse star triangle (right angle)
      /*  for(int i =1 ;i<=n ;i++){
            for (int j=1 ;j<=i ;j++){
                System.out.print("");
            }
            for(int j =i ;j<=n ;j++){
                System.out.print("* ");
            }
            System.out.println();
        }   */

//        Star triangle (Equilateral)
        /*for(int i=1;i<=n;i++){
            for(int j =i ;j<=n ;j++){
                System.out.print(" ");
            }
            for(int j=1 ;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        } */

//        Reverse star triangle (equilateral)
      /*  for(int i = 1 ;i<=n ; i++){
            for(int j=1 ; j<=i;j++){
                System.out.print(" ");
            }
            for(int j = i ;j<=n ;j++){
                System.out.print("* ");
            }
            System.out.println();
        }    */

//      Right sided star triangle (right angle triangle)
      /*  for(int i =1 ;i<=n;i++){
            for(int j =i ; j<=n ;j++){
                System.out.print("  ");
            }
            for(int j =1 ;j<=i ;j++){
                System.out.print("* ");
            }
            System.out.println();
        } */

//       Rev Right sided star triangle (right angle triangle)
      /*  for(int i=1;i<=n;i++){
            for(int j =1 ;j<=i ;j++){
                System.out.print("  ");
            }
            for(int j=i ;j<=n ;j++){
                System.out.print("* ");
            }
            System.out.println();
        }    */

//      Hill Star Triangle
      /*  for(int i=1;i<=n;i++){
            for(int j=i ;j<=n ;j++){
                System.out.print("  ");
            }
            for(int j=1 ;j<=i;j++){
                System.out.print("* ");
            }
            for(int j =1 ;j<i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }   */

//        Rev Star Triangle
        /*for(int i=1;i<=n;i++){
            for(int j=1 ;j<=i;j++){
                System.out.print("  ");
            }
            for(int j=i ;j<=n;j++){
                System.out.print("* ");
            }
            for(int j=i ;j<n;j++){
                System.out.print("* " );
            }
            System.out.println();
        } */

//        Diamond pattern
      /*  for(int i=1;i<n;i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for (int j = 1; j <= i; j++) {
                    System.out.print("  ");
            }
            for (int j = i; j <= n; j++) {
                   System.out.print("* ");
            }
            for (int j = i; j < n; j++) {
                    System.out.print("* ");
            }
            System.out.println();
        }     */

//        Left sided hill pattern
        /*for(int i = 1 ;i<n;i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i =1 ;i<=n ;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("");
            }
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }    */

//        Right sided Hill pattern
        /*for(int i =1 ;i<n;i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j =1 ;j<=i ;j++){
                System.out.print("  ");
            }
            for(int j=i ;j<=n ;j++){
                System.out.print("* ");
            }
            System.out.println();
        }   */

    }
}
