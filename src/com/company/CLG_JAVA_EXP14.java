package com.company;
class EvenNumbers extends Thread{
    @Override
    public void run(){
        int n = 0;
        while(n<50){
            if(n%2==0){
                System.out.println(n);
                n = n+2;
                try{
                    Thread.sleep(100);
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}
class OddNumbers extends Thread{
    @Override
    public void run() {
        int n = 1;
        while(n<50) {
            if (n % 2 == 1) {
                System.out.println(n);
                n = n+2;
                try{
                    Thread.sleep(100);
                }catch(Exception e){
                    e.printStackTrace();
                }

            }
        }
    }
}

public class CLG_JAVA_EXP14 {
    public static void main(String[] args) {
        EvenNumbers en = new EvenNumbers();
        OddNumbers on = new OddNumbers();
        en.start();
        on.start();
    }
}