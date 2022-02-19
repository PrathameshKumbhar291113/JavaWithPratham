package com.company;
import java.util.Scanner;
public class CLG_JAVA_EXP2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the bike 1 speed");
         double bike1 =sc.nextDouble();
        System.out.println("Enter the bike 2 speed");
         double bike2 =sc.nextDouble();
        System.out.println("Enter the bike 3 speed");
         double bike3 =sc.nextDouble();
        System.out.println("Enter the bike 4 speed");
         double bike4 =sc.nextDouble();
        System.out.println("Enter the bike 5 speed");
         double bike5 =sc.nextDouble();

        double avgSpeed = (bike1 + bike2 +bike3 + bike4 + bike5)/5;
        System.out.println("The Average Sepeed of the five bikers " + avgSpeed);
        if(bike1>avgSpeed){
            System.out.println("The biker 1 qualify with the speed of " +bike1);
        }
        if(bike2>avgSpeed){
            System.out.println("The biker 2 won qualify the speed of " +bike2);
        }
        if(bike3>avgSpeed){
            System.out.println("The biker 3 qualify with the speed of " +bike3);
        }
        if(bike4>avgSpeed){
            System.out.println("The biker 4 qualify with the speed of " +bike4);
        }
        if(bike5>avgSpeed){
            System.out.println("The biker 5 qualify with the speed of " +bike5);
        }
    }
}