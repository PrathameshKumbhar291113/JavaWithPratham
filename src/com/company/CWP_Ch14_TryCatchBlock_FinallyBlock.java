package com.company;
public class CWP_Ch14_TryCatchBlock_FinallyBlock {
    public static int basicCodeForFinallyBlock(){
        try{
            int a =1;
            int b=0;
            int c =a/b;
            return c;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("This is the end of this function");
        }
        return 0;
    }
    public static int goForFinallyBlock(){
        try{
            for(int i=0;i<5;i++){
                if(i==2){
                    System.out.println("Here we are gonna break ");
                    break;
                }
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("After break also this statement is gonna get print");
        }
        return 0;
    }
    public static void main(String[] args) {
        int k = basicCodeForFinallyBlock();
        System.out.println(k);
        int s =goForFinallyBlock();
        System.out.println(s);
        int a =9 ,b=5;
        while (true){
            try {
                System.out.println(a/b);
            }
            catch(Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("Im finally for value b " + b);
                b--;
            }
        }
//        We can write the try block 
        try{
            System.out.println(5/0);
        }
        finally{
            System.out.println("Yess this is possible");
        }
    }

}
