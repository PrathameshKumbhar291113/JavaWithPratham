package com.company;
class MyThread1 extends Thread{
    @Override
    public void run() {
        int i=0;
        while(i<5000){
            System.out.println("Thread 1 is Chatting");
            i++;
        }

    }
}class MyThread2 extends Thread{
    @Override
    public void run() {
        int i=0;
        while(i<5000){
            System.out.println("Thread 2 is Playing Game");
            i++;
        }
    }
}

public class CWP_Ch13_Multithreading_UsingThreadClass {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.start();
        t2.start();
    }
}
