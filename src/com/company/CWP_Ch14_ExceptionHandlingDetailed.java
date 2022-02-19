package com.company;
public class CWP_Ch14_ExceptionHandlingDetailed {
    public static void main(String[] args) {
//        try{
//            int a =9;
//            int b =0;
//            int c =a/b;
//            System.out.println(c);
//        }catch (Exception e){
//            System.out.println(e.getMessage() + " Check the code again ");
//        }
//        System.out.println("This code runs after throwing an exception");
        fun1();
        System.out.println("End of the code");

    }
    public static void fun1(){
        fun2();
    }
    public static void fun2(){
        try{
//        fun3();
//        fun4();
        Thread.sleep(3000);
        }catch (InterruptedException e){
           e.printStackTrace();
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage() + " You have entered the denominator as 0");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage() + " check the value entered in the index , enter the value equal to the size of the array");
        } //finally{
//            System.out.println("Sorry for the inconvenience");
//        }
        System.out.println("After delay");
    }
    public static void fun3(){

            int q =10;
            int d =0;
            int c = q/d;
            System.out.println(c);
            int []arr =new int [4];
            System.out.println(arr[6]);

    }
    public static void fun4() throws IllegalArgumentException{
        boolean isDanger =true;
        if(isDanger){
            throw new IllegalArgumentException("This is an Danger error");
        }
    }
}