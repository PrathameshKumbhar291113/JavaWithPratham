package com.company;
import java.util.Scanner;
public class CWP_Ch6_PS_Arrays {
    public static void main(String[] args) {
        Scanner sc  =  new Scanner(System.in);

//Q1 Create an array of 5 floats and calculate their sum.
       /* float [] arr = {10.8f,12.47f,15.02f,7.15f,14.0f};
        float sum=0;

        for(float element : arr){
            sum = sum+element;
        }
        System.out.println(sum); */

//Q2 Write a program to find out whether a given integer is present in an array or not.
       /* int []marks = {12,15,87,98,11};
        int num =12;
        boolean isPresentArray =false;
        for(int element : marks){
            if(num==element){
                isPresentArray = true;
            break;
            }
        }
        if(isPresentArray){
            System.out.println("Num is present ");
        }else{
            System.out.println("Num is not present");
        } */

//Q3 Calculate the average marks from an array containing marks of all students in physics using a for-each loop
      /*  int [] phyMarks = {50,30,55,70,80};
        int avg =0;
        for(int element : phyMarks){
            avg = (avg+element);
        }
        System.out.println(avg/ phyMarks.length);  */

//Q4 Create a Java program to add two matrices of size 2x3.

      /*  System.out.println("Enter the size of matrix ex -[2][2]");
        int row = sc.nextInt();
        int col = sc.nextInt();

        int [][] a = new int[row][col];
        int [][] b = new int[row][col];

        System.out.println("enter the elements of array a");
        for(int i=0 ;i<row;i++){
            for(int j=0;j<col;j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements of array b");
        for(int i=0 ;i<row;i++){
            for(int j=0 ;j<col;j++){
                b[i][j] = sc.nextInt();
            }
        }
        int [][]c = new int[row][col];

        for(int i=0 ;i<row;i++){
            for (int j=0;j<col;j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(c[i][j] +" ");
            }
            System.out.println();
        }     */

//Q5  Write a Java program to reverse an array.
        /*int [] a = {12,11,10,9,8,7,6};
        int l = a.length;
        int n = Math.floorDiv(a.length, 2);

        for(int i=0 ;i<n;i++){
            int temp = a[i];
            a[i] = a[l-i-1];
            a[l-i-1] =temp;
        }
        for(int ele : a){
            System.out.println(ele);
        }    */

//Q6 Write a Java program to find the maximum element in an array.

       /* int []a ={1,2,3,5,68,9};
        int max = Integer.MIN_VALUE;
        for(int ele : a){
            if(ele>max){
                max = ele;
            }
        }
        System.out.println(max);   */

//Q7 Write a Java program to find the minimum element in a Java array.
            /*    int []b ={12,1000,5,2,111};
                int min = Integer.MAX_VALUE;
                for(int ele : b){
                    if(ele<min){
                        min =ele;
                    }
                }
                System.out.println(min);      */

//Q8 Write a Java program to find whether an array is sorted or not.
     /*   int []arr = {1,5,6,8,10,11,16};
        boolean isSorted = true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                    isSorted = false;
                    break;
            }
        }
        if(isSorted){
            System.out.println("Array is sorted");
        }else{
            System.out.println("Array is not sorted");
        }   */

    }
}
