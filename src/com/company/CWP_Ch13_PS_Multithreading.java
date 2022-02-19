package com.company;

import javax.swing.plaf.TableHeaderUI;

//Q1 Write a program to print "Good morning" and "Welcome" continuously on the screen in Java using threads.
//Q2 Add a step method in the welcome thread of question 1 to delay its execution for 200ms.
//Q3 Demonstrate gerPriority() and setPriority() methods in Java threads.
//Q4  How do you get the state of a given thread in Java?
//Ans : getState() method is used to get the state of a given thread in Java. --> check implementation onn line 45
//Q5 How do you get the reference to the current thread in Java?
//Ans : currentThread() method is used to reference the current thread in Java.
class GoodMorning extends Thread{
    @Override
    public void run() {
//        while(true){
//            System.out.println("Good Morning");
//        }
//        System.out.println("Good Morning");

    }
}
class Welcome extends Thread{
    @Override
    public void run() {
        while(true){
//            Implementation of sleep method
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Welcome");
        }

    }
}
public class CWP_Ch13_PS_Multithreading {
    public static void main(String[] args) {
        GoodMorning gm = new GoodMorning();
        Welcome zenzen = new Welcome();
        gm.setPriority(9);
        zenzen.setPriority(6);

        System.out.println(gm.getPriority());
        System.out.println(zenzen.getPriority());

        System.out.println(gm.getState());

        gm.start();
        System.out.println(gm.getState());
        System.out.println(Thread.currentThread().getState());
//        zenzen.start();

    }
}
