package com.company;
import java.util.Scanner;
public class CWP_Ch4_PS_ConditionalStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//Q1 Write a program to find out whether a student is pass or fail;
//  if it requires a total of 40% and at least 33% in each subject to pass. Assume 3 subjects and take marks as input from the user.
      /*  int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();
        float avg = (sub1+sub2+sub3)/3.0f;
        if(avg>=40 && sub1>=33&& sub2>=33 && sub3>=33){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }  */

//Q2 Calculate income tax paid by an employee to the government as per the slabs mentioned below:
//Income Slab	Tax
//2.5L – 5.0L  	5%
//5.0L – 10.0L 	20%
//Above 10.0L	30%
//Note that there is not tax below 2.5L. Take the input amount as input from the user.

        /* System.out.println("Enter your income in Lakhs per annum");
        float tax = 0;
        float income = sc.nextFloat();
        if(income<=2.5){
            tax = tax + 0;
        }
        else if(income>2.5f && income <= 5f){
            tax = tax + 0.05f * (income - 2.5f);
        }
        else if(income>5f && income <= 10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5f);
        }
        else if(income>10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5f);
            tax = tax + 0.3f * (income - 10.0f);
        }

        System.out.println("The total tax paid by the employee is: " + tax); */

//        Write a program to find out the type of website from the URL:
//.com – commercial website
//.org – organization website
//.in – Indian website
        System.out.println("Enter the website");
        String website =sc.nextLine();
        if(website.endsWith(".com")){
            System.out.println("Commercial Site");
        }else if(website.endsWith(".org")){
            System.out.println("Organization Site");
        }else if(website.endsWith(".in")){
            System.out.println("Indian Site");
        }

    }
}
