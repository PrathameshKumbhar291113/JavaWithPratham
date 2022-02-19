package com.company;
class NegativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "Radius cannot be negative";
    }
    @Override
    public String getMessage() {
        return "Do not enter negative value";
    }
}
public class CWP_Ch14_TryCatchBlock_ThrowVsThrows {
    public static double area(int r) throws NegativeRadiusException{
        if(r<0){
            throw new NegativeRadiusException();
        }
        double result = Math.PI*r*r;
        return result;
    }

    public static int divide(int a , int b) throws ArithmeticException{
//        Made by pratham
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
//            use by the user
        try{
//            int c = divide(6,0);
//            System.out.println(c);
            double ar = area(9);
            System.out.println(ar);
        }
        catch(Exception e){
            System.out.println(" exception! ");
        }

        System.out.println("This is the finish of code");
    }
}