package com.company;
import java.util.Scanner;
public class CWP_Ch14_TryCatchBlock_HandlingSpecificExceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []marks =new int[4];
        marks[0] = 8;
        marks[1] = 4;
        marks[2] = 41;
        marks[3] = 94;
        System.out.println("Enter the array index number");
        int ind = sc.nextInt();

        System.out.println("Enter the value u want to divide with ");
        int num = sc.nextInt();

        try{
            System.out.println("The value entered in the index is " + marks[ind]);
            System.out.println("The value of array -  value/num " + marks[ind]/num);
        }
        catch (ArithmeticException e){
            System.out.println("An Arithmetic Exception has occurred ");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("This is the array out of index bound exception ha occurred ");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Some other Exception has occurred ");
            System.out.println(e);
        }


    }
}
