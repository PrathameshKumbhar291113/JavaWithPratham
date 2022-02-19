package com.company;
import java.util.Scanner;
class MyException extends Exception{
    @Override
    public String toString(){
        return "This is toString()";
    }

    @Override
    public String getMessage() {
        return "This is the getMessage() ";
    }
}
class MaxAgeException extends Exception{
    @Override
    public String toString(){
        return "Do not entered the age above 60";
    }

    @Override
    public String getMessage() {
        return "Make sure the age is correct";
    }
}
public class CWP_Ch14_TryCatchBlock_ExceptionClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a<60){
            try{
//                throw new MyException();
//                throw new ArithmeticException("This is an Arithmetic Exception");
                throw new MaxAgeException();
            }
            catch(Exception e){
//                System.out.println(e);
                System.out.println(e.toString());
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
        System.out.println("This is the end of the code ");
    }
}