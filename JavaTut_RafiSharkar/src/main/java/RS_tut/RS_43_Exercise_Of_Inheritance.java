package RS_tut;


import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses;

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }

    Game(){         // constructor has not any return type
        Random rand = new Random();
        this.number = rand.nextInt(10);
    }
    void takeUserInput(){
        System.out.print("Guess the number: ");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    boolean isCorrectNumber(){
        if (inputNumber == number){
            return true;
        } else if (inputNumber < number) {
            System.out.println("Too low...");
        } else if (inputNumber > number) {
            System.out.println("Too high...");
        }
        return false;
        }

    }


public class RS_43_Exercise_Of_Inheritance {
    public static void main(String[] args) {
        /*
        Create a class Game, which allows a user to play "Guess the Number"
        game once. Game should have the following methods:
        1.  Constructor to generate the random number,
        2.  takeUserInput() to take user input of number,
        3.  isCorrectNumber() to detect whether the number entered by the user is true,
        4.  getter and setter for noOfGuesses.
        Use properties such as no)fGuesses(int), etc to get this task done!
         */

        Game g = new Game();
        boolean b = false;
        int steps = 0;
        while (!b){
            steps += 1;
            g.takeUserInput();
            System.out.println("computer take: "+ g.number);
            System.out.println("You take: "+ g.inputNumber);
            b = g.isCorrectNumber();
            System.out.println(b);
        }
        System.out.println("you take: " + steps + "steps");

    }
}
