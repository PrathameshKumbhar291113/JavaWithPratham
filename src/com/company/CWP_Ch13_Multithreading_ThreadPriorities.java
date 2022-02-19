package com.company;
class MyThr3 extends Thread {
    MyThr3(String name) {
        super(name);
    }

    @Override
    public void run() {

        while (true) {
            System.out.println("The thread running now is : " + this.getName());
        }
    }
}
public class CWP_Ch13_Multithreading_ThreadPriorities {
        public static void main(String[] args) {
            MyThr3 t1 = new MyThr3("Pratham");
            MyThr3 t2 = new MyThr3("Shreya");
            MyThr3 t3 = new MyThr3("Rhucha");
            MyThr3 t4 = new MyThr3("Sharu");
            MyThr3 t5 = new MyThr3("Mom (Most Important)");

            t1.setPriority(Thread.MIN_PRIORITY);
            t2.setPriority(Thread.MIN_PRIORITY);
            t3.setPriority(Thread.MIN_PRIORITY);
            t4.setPriority(Thread.MIN_PRIORITY);
            t5.setPriority(Thread.MAX_PRIORITY);

            t1.start();
            t2.start();
            t3.start();
            t4.start();
            t5.start();


        } 
}
