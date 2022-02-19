package com.company;
class MyThr1 extends Thread{
//    Constructors Of Thread
    public MyThr1(){
        System.out.println("This is the Thread() constructor");
    }
    public MyThr1(String name){
       super(name);
    }
    @Override
    public void run() {
        System.out.println("This is the method run for Thread : MyThr1");
    }
}

class MyThr2 implements Runnable{
    MyThr2(){
        System.out.println("This is the default constructor : Thread()");
    }
    MyThr2(Runnable target){
        System.out.println("This is the Constructor for Thread(Runnable target)");
    }
    MyThr2(Runnable target , String name){
        System.out.println("This is the constructor for Thread(Runnable target , String name)");
    }
    @Override
    public void run() {
        System.out.println("This is the method of run for Thread : MyThr2");
    }
}
public class CWP_Ch13_Multithreading_ThreadConstructors {
    public static void main(String[] args) {
     MyThr1 t1 = new MyThr1("Pratham");
     MyThr1 t2 = new MyThr1();
        t1.start();
        System.out.println("The thread for constructor MyThr1(String name) : " + t1.getName());
        System.out.println("The thread Id for constructor MyThr1 " + t1.getId() );

        MyThr2 t3 = new MyThr2();
        MyThr2 t4 = new MyThr2(t3);
        Thread th1 = new Thread(t4);
        th1.start();
        MyThr2 t5 = new MyThr2(t3,"Prathamesh K");
        Thread th2 = new Thread(t5);
        th2.start();
        System.out.println("name of the thread constructor MyThr2(Runnable target ,  String name) : " + th2.getName());

    }
}
