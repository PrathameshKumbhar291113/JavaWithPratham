package com.company;
import java.util.Scanner;
class InvalidInputException extends Exception{
    @Override
    public String toString() {
        return "Cannot Return 8 & 9";
    }
}
class CannotDivideByZeroException extends Exception{
    @Override
    public String toString() {
        return "Cannot divide by Zero";
    }
}
class MaxInputException extends Exception {
    @Override
    public String toString() {
        return "Value Reached the maximum range";
    }
}
    class MaxMultiplierReachedException extends Exception{
        @Override
        public String toString() {
            return "Value Reached the maxMultiplier Range";
        }
}
class CustomCalculator{
    double add(double a , double b) throws InvalidInputException , MaxInputException{
        if(a>10000 || b>10000){
            throw new MaxInputException();
        }
        if(a==8||b==9){
            throw new InvalidInputException();
        }
        return a+b;
    }
    double sub(double a , double b) throws MaxInputException{
        if(a>10000 || b>10000){
            throw new MaxInputException();
        }
        return a-b;
    }
    double mul(double a , double b) throws MaxInputException , MaxMultiplierReachedException{
        if(a>7000||b>7000){
            throw new MaxMultiplierReachedException();
        }

        if(a>10000 || b>10000){
            throw new MaxInputException();
        }
        return a*b;
    }
    double div(double a , double b) throws CannotDivideByZeroException , MaxInputException{
        if(a>10000 || b>10000){
            throw new MaxInputException();
        }
        if(b==0){
            throw new CannotDivideByZeroException();
        }
        return a/b;
    }
}

public class CWP_EX6_CalculatorUsingExceptions {
    /*
    Problem statement : You have to create a calculator with the following operations
    1. + -> Addition
        2. - -> Subtraction
        3. * -> Multiplication
        4. / -> Division
        which throws the following exceptions:
        1. Invalid input Exception ex: 8 & 9
        2. Cannot divide by 0 Exception
        3. Max Input Exception if any of the inputs is greater than 100000
        4. Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000
      */
    public static void main(String[] args) throws InvalidInputException ,  CannotDivideByZeroException , MaxInputException , MaxMultiplierReachedException{
        Scanner sc = new Scanner(System.in);

        CustomCalculator cc  =new CustomCalculator();

        System.out.println("Enter the first number");
        double a = sc.nextDouble();

        System.out.println("Enter the second number");
        double b = sc.nextDouble();
        try{
            cc.div(a,b);
            cc.add(a,b);
            cc.mul(a,b);
            cc.sub(a,b);
        }
        catch (MaxInputException | InvalidInputException  | CannotDivideByZeroException | MaxMultiplierReachedException e ){
            System.out.println(e);
        }

        System.out.println("The code is not terminating in between , its getting fully executed");
    }
}
