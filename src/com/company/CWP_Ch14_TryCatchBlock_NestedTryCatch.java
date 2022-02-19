package com.company;
import java.util.Scanner;
public class CWP_Ch14_TryCatchBlock_NestedTryCatch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*int []marks =new int[4];
        marks[0] = 8;
        marks[1] = 4;
        marks[2] = 41;
        marks[3] = 94;
        System.out.println("Enter the array index number");
        int ind = sc.nextInt();
        try{
            System.out.println("This is Nested Try Catch Block");
            try{
                System.out.println(marks[ind]);

            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Sorry This index does not exist");
                System.out.println("Exception in level2");
            }
        }
        catch(Exception e) {
            System.out.println("Exception in Level1");
        }
        System.out.println("This is the end of code");  */

// Quick Quiz:  Write a java program that allows to keep accessing an array until a valid index is given by the user.
        int []marks =new int[4];
        marks[0] = 8;
        marks[1] = 4;
        marks[2] = 41;
        marks[3] = 94;
        boolean flag = true;
        while(flag){
            System.out.println("Enter the array index number");
            int ind = sc.nextInt();
            try{
                System.out.println("This is Nested Try Catch Block");
                try{
                    System.out.println(marks[ind]);
                    flag = false;
                }
                catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("Sorry This index does not exist");
                    System.out.println("Exception in level2");
                }
            }
            catch(Exception e) {
                System.out.println("Exception in Level1");
            }
            System.out.println("This is the end of code");
        }

    }
}
