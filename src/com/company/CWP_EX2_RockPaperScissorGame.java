package com.company;

import java.util.Random;
import java.util.Scanner;

public class CWP_EX2_RockPaperScissorGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("-------------------Welcome to play the game-------------------");
        System.out.println("----------Press S to Start the game and E to End the game-----------");
        char startGame = sc.next().charAt(0);

        System.out.println("Enter the Player number ");
        String pName = sc.next();
        System.out.println("You have only got 5 chances so do your best :: ALL THE BEST BUDDY ");
        int i=1;
        while(i<=5){
            if(startGame == 'S' || startGame == 's'){

                System.out.println("This is " + pName +"'s turn now ");
                System.out.println("Choose \n" +
                        "0. for ROCK \n" +
                        "1. for PAPER \n" +
                        "2. for SCISSORS");
                int playerInput = sc.nextInt();

                //   generate  random number

                int compsInput = rand.nextInt(3);


                if(playerInput == compsInput){
                    System.out.println(pName + " & Computer tied !!!");
                }
                else if(playerInput>compsInput){
                    System.out.println(pName + " WON THE GAME !!!");
                }
                else{
                    System.out.println(pName + " LOSE THE GAME !!!");
                }

            }else if(startGame == 'E' || startGame == 'e'){
                System.out.println("The Game has ENDED");
            }
            i++;
        }

    }
}
