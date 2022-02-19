package com.company;

import java.util.Scanner;

public class CWP_Ch5_Loops_ReverseTheNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number to reverse it");
        int  actualNum = sc.nextInt();
        int revNum =0;
        int tempNum = actualNum;
        while(tempNum >0){
             int remNum = tempNum%10;
             revNum = revNum*10 + remNum;
             tempNum = tempNum/10;
        }
        System.out.println("the reverse of the number is "  + revNum);
    }
}
