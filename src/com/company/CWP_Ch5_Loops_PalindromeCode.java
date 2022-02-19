package com.company;
import java.util.Scanner;
public class CWP_Ch5_Loops_PalindromeCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the any number to check whether the given number is palindrome or not");
        int actualNumber = sc.nextInt();
        int tempNumber = actualNumber;
        int reverseNumber = 0;
        while(tempNumber>0){
            int remNumber = tempNumber%10;
            reverseNumber = reverseNumber*10 + remNumber;
            tempNumber = tempNumber/10;
        }
        if(reverseNumber == actualNumber){
            System.out.println("The given number " + actualNumber + " is Palindrome");
        }else{
            System.out.println("The given number " + actualNumber + " is not Palindrome");
        }

    }
}
