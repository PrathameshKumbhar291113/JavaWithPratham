package com.company;
import java.util.Scanner;
import java.util.Random;

class GuessNumGame{
    public int ranNumGen ;
    public int userGivenInput;
    public int  noOFGuesses = 0;

//    Here Random Number Is Generated using random class
//    Constructor GuessNumGame is going to be created down below
    public GuessNumGame(){
        Random rand  = new Random();
        ranNumGen = rand.nextInt(100);
    }

//    Method to take user input
    public void userGivenInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number ...... in 5 attempts !");
        userGivenInput = sc.nextInt();
    }

//  Here create a boolean method to check all the conditions
public boolean isCorrectNumber() {
    noOFGuesses++;
    if (noOFGuesses == 5) {
        System.out.format("Yo bro you did your best , but you loose , the number was %d  , Try again Later !", ranNumGen);
        return true;
    } else if (userGivenInput == ranNumGen) {
        System.out.format("Yea you did it ,  you guessed the correct number %d in %d number of attempt..... ", ranNumGen, noOFGuesses);
        return true;
    } else if (userGivenInput > ranNumGen) {
        System.out.println("Too High......Think a bit lower number..... \n");
    } else {
        System.out.println("Too Low......Think a bit higher number..... \n ");
    }
    return false;
}

}

public class CWP_EX3_GuessTheNumberGame {
    public static void main(String[] args){
        GuessNumGame game = new GuessNumGame();
        boolean bool = false;
        while(!bool){
            game.userGivenInput();
            bool = game.isCorrectNumber();
        }
    }
}
