/*Create a class Game, which allows a user to play "Guess the Number" game once.
Game should have the following methods:
1-Constructor to generate the random number
2-takeUserInput() to take a user input of number
3- isCorrectNumber() to detect whether the number entered by the user is true
4- getter and setter for noOfGuesses
5- Use properties such as noOfGuesses(int) etc. to get this task done!
         */
package com.company;
import java.util.Scanner;
import java.util.Random;
class Game{
    private final int  r;
    private int i;
    private int number_of_guesses=0;
    Scanner sc=new Scanner(System.in);
    public void setNumber_of_guesses(int n) {
        number_of_guesses = n;
    }
    public int getNumber_of_guesses() {
        return number_of_guesses;
    }
    public Game(){
        Random rand=new Random();
        int random_number= rand.nextInt(1,101);
        r=random_number;
    }
    public void take_user_input() {
        System.out.print("please Enter your number: ");
        int input_number = sc.nextInt();
        if (input_number>0&& input_number<101){
            i=input_number;
        }
        else {
            System.out.println("enter number between 1 to 100");
            i=input_number;
        }
    }
    public void isCorrectNumber() {
        while (true) {
            take_user_input();
            if (i > r) {
                System.out.println("number entered is greater");
                number_of_guesses++;
            } else if (i < r) {
                System.out.println("Number enter is smaller");
                number_of_guesses++;
            } else {
                System.out.println("you  entered correct number");
                number_of_guesses++;
                break;
            }
        }
    }
    public void toWin(){
        if (number_of_guesses<=10){
            System.out.println("you win");
        }
        else {
            System.out.println("you lose");
        }
    }
}
public class Exersise_3_GuessTheNumberOops {
    Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("game start");
        Game guess_number=new Game();
        guess_number.isCorrectNumber();
        System.out.println("you guessed in "+guess_number.getNumber_of_guesses()+" guesses");
        guess_number.toWin();
    }
        }