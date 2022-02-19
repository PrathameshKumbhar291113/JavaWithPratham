package com.company;

import java.util.Scanner;
public class CWP_Ch3_String_ReverseStringLetterByLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to reverse");
        String actualString = sc.nextLine();
        String reverseString ="";
        for(int l =actualString.length()-1 ;l>=0;l--){
            reverseString =reverseString+actualString.charAt(l);
        }
        System.out.println("Reverse of the String is " + reverseString);

        StringBuffer s = new StringBuffer(actualString);
        System.out.println(s.reverse());
    }
}
