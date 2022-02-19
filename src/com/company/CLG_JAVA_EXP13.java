package com.company;
import java.io.*;
import java.lang.*;
class LessBalanceException extends Exception{
    LessBalanceException(double amt){
        System.out.println("Withdrawing " + amt + " is Invalid");
    }
}
class Account{
    static int count = 0;
    int accno;
    double bal;
    String name;
    Account(double bal , String name , int accno){
        System.out.println("\nNew Account Opened .....!!!");
        this.bal = bal;
        System.out.println("Account Holder Name is : " + name);
        this.name =  name;
        System.out.println("Your Account Number is  : " + accno);
        this.accno =  accno;
        System.out.println("Total number of accounts : " + count);
    }
    void Deposit(double amt){
        System.out.println("Available Balance is :" + bal);
        bal =  bal + amt;
        System.out.println("Rs.  " + amt + " /- Deposited");
        System.out.println("Now balance after Deposit is + " + bal);
    }
    void Withdraw(double amt) throws LessBalanceException{
        System.out.println("\nAvailable Balance : " + bal );
        bal = bal - amt;
        if(bal<500){
            bal  = bal + amt;
            throw new LessBalanceException(amt);
        }
        System.out.println("Rs. " + amt + " /- Withdrawn");
        System.out.println("Balance after withdrawal " + bal);
    }
    void Balance(){
        System.out.println("\n-----------Customer Information------------");
        System.out.println("=============================================");
        System.out.println("Customer Name : " + name);
        System.out.println("Account Number : " + accno);
        System.out.println("Current Balance : " + bal);
    }

}
public class CLG_JAVA_EXP13 {
    static int i =0;
    public static void main(String[] args) throws IOException{
        Account ob[] =  new Account[10];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double amt;
        String Name;
        int ch , accno , k;
        boolean t = false;
        while(true){
            System.out.println("\n*** Bank Transaction ***");
            System.out.println("1. Opening new Account \n2. Deposit \n3. Withdraw \n4. Balance \n5. Exit");
            System.out.println("Enter Your Choice : ");
            ch = Integer.parseInt(br.readLine());
            switch(ch){
                case 1:
                    System.out.println("Opening new Account : ");
                    System.out.println("Enter your Name : ");
                    Name = br.readLine();
                    System.out.println("\nEnter Account Number : ");
                    accno = Integer.parseInt(br.readLine());
                    System.out.println("\nEnter Initial amount (to be >=1000) : ");
                    amt = Double.parseDouble(br.readLine());
                    if(amt<500){
                        System.out.println("You cannot create an account with less than Rs.1000/-");
                    }else{
                        ob[i] = new Account(amt , Name , accno);
                        i++;
                    }
                break;
                case 2:
                    System.out.println("\nEnter Account number : ");
                    accno = Integer.parseInt(br.readLine());
                    for (k=0;k<i;k++){
                        if(accno == ob[k].accno){
                            t =true;
                            break;
                        }
                    }
                    if(t){
                        System.out.println("\nEnter the Amount for Deposit : ");
                        amt = Double.parseDouble(br.readLine());
                        ob[k].Deposit(amt);
                    }else{
                        System.out.println("Invalid Account Number ...!!!");
                    }
                    t = false;
                break;
                case 3:
                    System.out.println("\nEnter Account number : ");
                    accno = Integer.parseInt(br.readLine());
                    for(k = 0 ; k<i ;k++){
                        t = true;
                        break;
                    }
                    if(t){
                        System.out.println("\nEnter the Amount for Withdraw : ");
                        amt = Double.parseDouble(br.readLine());
                        try{
                            ob[k].Withdraw(amt);
                        }catch (LessBalanceException e){

                        }
                    }else{
                        System.out.println("Invalid Account Number...!!!");
                    }
                    t =false;
                break;
                case 4:
                    System.out.println("\nEnter Account Number : ");
                    accno = Integer.parseInt(br.readLine());
                    for(k =0 ; k<i ;k++){
                        if(accno == ob[k].accno){
                            t = true;
                            break;
                        }
                    }
                    if(t){
                        ob[k].Balance();
                    }else{
                        System.out.println("Invalid Account Number...!!!");
                    }
                    t=false;
                break;
                case 5:
                    System.exit(1);
                break;
                default :
                    System.out.println("Invalid Choice !!!");

            }
        }
    }
}
