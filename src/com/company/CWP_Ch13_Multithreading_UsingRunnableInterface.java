package com.company;
class MyRunnableThread1 implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println("This is the runnable thread 1");
        }

    }
}
class MyRunnableThread2 implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println("This is the runnable thread 2");
        }
    }
}


public class CWP_Ch13_Multithreading_UsingRunnableInterface {
    public static void main(String[] args) {
        MyRunnableThread1 bullet1 = new MyRunnableThread1();
        Thread gun1 = new Thread(bullet1);

         MyRunnableThread2 bullet2 = new MyRunnableThread2();
         Thread gun2 = new Thread(bullet2);

         gun1.start();
         gun2.start();
    }
}
