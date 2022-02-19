package com.company;
import java.util.Scanner;
public class CWP_Ch2_PS_Operators{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//Q1 What will be the result of the following expression:
//        float a = 7/4f*9/2f;
//        System.out.println(a);

//Q2 Write a java program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade.
//        char grade = 'A';
//        grade = (char) (grade+8);
//        System.out.println(grade);

       // Decrypting the grade
//        grade = (char) (grade-8);
//        System.out.println(grade);

//Q3 Use comparison operators to find out whether a given number is greater than the user entered number or not
//        int a = sc.nextInt();
//        if(a<10){
//            System.out.println("num is lesser ");
//        }else{
//            System.out.println("num is greater ");
//        }

//Q4 Write the following expression in a java program:
//(v^2-u^2)/2as
//        int v =2 ,u=3 ,a=4 ,s=5;
//        int c = (v*v)-(u*u)/2*a*s;
//        System.out.println(c);

//Q5 Find the value of 'a' in expression given below :
//int x = 7
//int a = 7*49/7 + 35/7
        int x = 7;
        int a = (x*49/7) + (35/7);
        System.out.println(a);

    }
}
