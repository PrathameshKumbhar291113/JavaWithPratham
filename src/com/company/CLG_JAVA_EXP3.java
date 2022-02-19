/*  Quadratic equation form
       ax^2 + bx + c = 0;
       to find  x = (-b ± √D)/2a , where D = b2 – 4ac
       Nature of roots:
       D > 0, roots are real and distinct (unequal)
       D = 0, roots are real and equal (coincident)
       D < 0, roots are imaginary and unequal*/
package com.company;
import java.util.Scanner;
public class CLG_JAVA_EXP3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a for ax^2");
        int a = sc.nextInt();
        System.out.println("Enter the value of b for bx");
        int b = sc.nextInt();
        System.out.println("Enter the value of c for constant");
        int c = sc.nextInt();

        double D = (b*b - 4*a*c);
        double d = Math.sqrt(D);
    if(D==0){
        System.out.println("There will be only one root x");
        float x = (-b)/(2*a);
        System.out.println(x);
    }else if(D>0) {
            System.out.println("The solution exist  , x1 & x2 are 2 real roots ");
            double x1 = (-b + d) / 2 * a;
            System.out.println(x1);
            double x2 = (-b - d) / 2 * a;
            System.out.println(x2);
        }else if(D<0){
            System.out.println("The roots are complex or the roots are not real , since the solution does not exist");
        }

    }
}
