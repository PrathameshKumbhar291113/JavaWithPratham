package com.company;
class MyNewThread1 extends Thread {
    @Override
    public void run() {
        while (true) {
             System.out.println("The thread running now is : Thread 1");
            try {
                Thread.sleep(455);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class MyNewThread2 extends Thread {
    @Override
    public void run() {

        while (true) {
            System.out.println("The thread running now is : Thread 2" );
        }
    }
}

public class CWP_Ch13_Multithreading_ThreadMethods {
    public static void main(String[] args) {
        MyNewThread1 t1 = new MyNewThread1();
        MyNewThread2 t2 = new MyNewThread2();
        t1.start();
//        try{
//            t1.join();
//        }
//        catch(Exception e ){
//            System.out.println(e);
//        }
        t2.start();
    }
}
