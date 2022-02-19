package com.company;

import java.util.Scanner;

public class HelloJava {
    public int sum(int a  , int b){
        int c =  a + b;
        return c;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int [][] a  =  {{1,2,3},
//                         {4,5,6}};
//        int [][] b  =  {{1,2,3},
//                         {4,5,6}};
//        int [][] c =  {{0,0,0},
//                         {0,0,0}};
//
//
//        for(int i = 0 ;i<2; i++){
//            for(int j = 0 ; j<3 ; j++){
//                c[i][j] = a[i][j] + b[i][j];
//            }
//        }
//        System.out.println("Printing the elements of array c");
//        for(int i =0 ; i<2; i++ ){
//            for(int j = 0 ; j<3; j++){
//                System.out.print(c[i][j] + " ");
//            }
//            System.out.println();
//        }

//        System.out.println("Enter the size: ");
//        int size = sc.nextInt();
//        int [] arr = new int[size];
//        System.out.println("Enter the elements :");
//        for(int i=0;i< arr.length;i++){
//            arr[i]= sc.nextInt();
//        }
//        for (int i=0;i< arr.length/2;i++){
//            int temp = arr[i];
//            arr[i] = arr[size-i-1];
//            arr[size-i-1] = temp;
//        }
//        for (int ele:arr) {
//            System.out.println(ele);
//        }
//        boolean isSorted =  true;
//        int []  ar = { 1,21,3,4,5,6,7};
//        for(int i =  0 ; i<ar.length -1; i++){
//            if (ar[i]>ar[i+1]){
//                isSorted =  false;
//                break;
//            }
//        }
//        if(isSorted){
//            System.out.println("Array is sorted ");
//        }else{
//            System.out.println("Array is not sorted");
//        }

//        sum(2 , 3);

    }
}