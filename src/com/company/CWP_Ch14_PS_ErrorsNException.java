package com.company;

import java.util.Scanner;

/*class Student {
    int m;

    public void setMarks(int marks) {
        if (marks <= 0 || marks >= 100)
            throw new IllegalArgumentException(Integer.toString(marks));
        else
            m = marks;
    }
}*/
class CustomException extends Exception{
    @Override
    public String toString() {
        return "Max Retries Reached";
    }
}

public class CWP_Ch14_PS_ErrorsNException {
    public static void retriesReached() throws CustomException{
            throw new CustomException();
    }
    public static void main(String[] args) {
//        Q1 Write a java program to demonstrate syntax, logical 2 runtime errors.
//        Syntax Error's - int a = 4  OR   a=19;

//        Logical Error's int age =78;
//        int year_born  = 2020-78;

//      Runtime Error's
//        System.out.println(5/0);

//        Q2  Write a java program that prints "HaHa" during Arithmetic exception and "HeHe" during an Illegal argument exception.

//        try{
//            int a = 66/0; -->it has arithmetic exception bcz we value of num/0 is not define
//            Student st = new Student(); ---> it has illegal argument exception bcz in if else statement :: range 0f marks is from 0 to 100
//            so if i entered marks greater than 100 then it will throw an illegal argument exception
//            st.setMarks(102);
//            System.out.println(st.m);

//        }
//        catch(ArithmeticException  e){
//            System.out.println("ArithmeticException");
//        System.out.println("Haha");
//            System.out.println(e);
//        }
//        catch(IllegalArgumentException e){
//            System.out.println("IllegalArgumentException");
//        System.out.println("Hehe");
//            System.out.println(e);
//          }

//        Q3 Write a program that allows you to given. If max retries exceed 5 print "errors".
        int [] marks = new int[4];
        marks[0] = 5;
        marks[1] = 45;
        marks[2] = 58;
        marks[3] = 95;
        Scanner sc = new Scanner(System.in);
        int i=0;
        boolean flag = true;
        while(flag && i<5){
        try{
            System.out.println("Enter the index ");
            int index = sc.nextInt();
            System.out.println("Value of the marks [index] is" + marks[index]);
            break;
        }
        catch (Exception e){
            System.out.println("Invalid Index");
            i++;
        }
        if(i>=5){
            System.out.println("ERROR");
                try {
                    retriesReached();
                } catch (CustomException ex) {
                    ex.printStackTrace();
                }
        }
        }
    }
}
