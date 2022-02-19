package com.company;

import java.util.Scanner;

class Area{
    public int length;
    public int breath;

    public void setDim(int length ,int breath){
        this.length = length;
        this.breath = breath;
    }
    public int getArea(){
        System.out.println("Area of the Rectangle");
        return length * breath;
    }
}
public class CLG_JAVA_EXP5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length : ");
        int len = sc.nextInt();
        System.out.println("Enter the breadth : ");
        int bre = sc.nextInt();
        Area a = new Area();
        a.setDim(len ,bre);
        System.out.println(a.getArea());
    }
}
