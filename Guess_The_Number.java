//The system generates random number between 1 to 100.
//if entered number is less then shows lower or if number is higher then shows higher.
//game continues until the user guess the number.
//count number of attempts.

import java.util.Random;
import java.util.Scanner;

class GuessingGame{
    public int Computer_number;
    public int Your_number;
    public int total_attempt=0;
    GuessingGame(){
        Random rand= new Random();                //computer number
        this.Computer_number= rand.nextInt(100);
    }
    void userInput(){                         //user number
        System.out.println("Guess the number: ");
        Scanner sc= new Scanner(System.in);
        Your_number= sc.nextInt();
    }

    public int getTotal_attempt() {
        return total_attempt;
    }
    public void setTotal_attempt(int total_guesses){
        this.total_attempt= total_guesses;
    }
    boolean isCorrect(){
        total_attempt++;
        if(Your_number==Computer_number){
            System.out.println("You have guessed it right "+Computer_number+" is the number");
            System.out.println("Total attempts: "+total_attempt);
            return true;
        }
        else if(Your_number<Computer_number){
            System.out.println("too lower.... Try again");
        }
        else if(Your_number>Computer_number){
            System.out.println("too higher...Try again");
        }
        return false;
    }
}

public class Guess_The_Number {
    public static void main(String[] args){
        GuessingGame obj= new GuessingGame();
        boolean correct= false;
        while (!correct){
            obj.userInput();
            correct= obj.isCorrect();
        }
    }
}
