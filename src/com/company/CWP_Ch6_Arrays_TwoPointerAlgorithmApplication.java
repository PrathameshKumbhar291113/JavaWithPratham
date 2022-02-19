package com.company;
import java.util.*;
 public class CWP_Ch6_Arrays_TwoPointerAlgorithmApplication{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Test case 1 : 0 , -1 , 2 , -3 , 1
//        Test case 2 : 1 , 2 , 3
        System.out.println("Enter the number of the testcases u are entering (enter the number of test case u have above :  here we have 2)");
        int t = sc.nextInt();
        while(t-->0){
            System.out.println("Enter the number of elements u want in array");
            int n = sc.nextInt();
            int [] arr = new int[n];
            System.out.println("Enter the elements in array");
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            CWP_Ch6_Arrays_TwoPointerAlgorithmApplication g = new CWP_Ch6_Arrays_TwoPointerAlgorithmApplication();
            if(g.findWP_Ch6_Arrays_TwoPointerAlgorithmApplication(arr,n)){
                System.out.println(" The triplet is present in the given array : 1");
            }else {
                System.out.println("The triplet is not present in given array : 0");
            }
        }
    }

     public boolean findWP_Ch6_Arrays_TwoPointerAlgorithmApplication(int[] arr, int n) {
        Arrays.sort(arr);
        for (int i=0 ;i<n-2;i++){
            if(twoSum(arr , -arr[i] ,i+1)) return true;
        }
        return false;
     }
     public boolean twoSum(int [] a ,int x ,int i){
         int j = a.length- 1;
         while(i<j){
             if(a[i] + a[j] >x){
                 j--;
             }else if(a[i] + a[j] < x){
                 i++;
             }else{
                 return true;
             }
         }
         return false;
     }
 }
