package com.company;
import java.util.Scanner;
class Salary{
    Scanner sc = new Scanner(System.in);
    public int empNo;
    public String empName;
    public double basic;
    public double gSal;
    public double nSal;

    Salary(){
        System.out.println("Enter the employee name");
        this.empName = sc.nextLine();
        System.out.println("Enter the employee num");
        this.empNo = sc.nextInt();
        System.out.println("enter the employee basic");
        this.basic = sc.nextDouble();
    }
    public void calSal(){
        double DA = 0.7*basic;
        double HRA = 0.3*basic;
        int CCA = 240;
        double PF = 0.1*basic;
        int PT = 100;
        gSal =  DA + HRA + PF + CCA;
        nSal = gSal - PT;
    }
    public void display(){
        System.out.println("Employee Name is : " + empName);
        System.out.println("Employee Number is : " + empNo);
        System.out.println("Employee basic is : " + basic);
        System.out.println("The calculated Gross Salary is : " + gSal);
        System.out.println("The calculated Net Salary is : " + nSal);
    }
}
public class CLG_JAVA_EXP1 {
    public static void main(String[] args) {
        Salary s1 = new Salary();
        s1.calSal();
        s1.display();
    }
}
