import java.util.Random;
import java.util.Scanner;

public class HighLow {

    public static void HighLow(int numberOfGuesses){
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int userGuess = 0;

        int winningNumber = rand.nextInt(100)+1;

        System.out.println("Please guess a number: ");
        for(int i = 1; i <= numberOfGuesses; i++){

            userGuess = sc.nextInt();

            if(userGuess == winningNumber){
                System.out.println("GOOD GUESS!");
                System.out.printf("You won with %d guesses left!", numberOfGuesses - i);
                i = numberOfGuesses;
            }else if(userGuess > winningNumber){
                System.out.println("LOWER!");
                System.out.printf("You have %d guesses left!%n", numberOfGuesses - i);
            }else if(userGuess < winningNumber){
                System.out.println("HIGHER!");
                System.out.printf("You have %d guesses left!%n", numberOfGuesses - i);
            }
            if(userGuess < 1 || userGuess > 100){
                System.out.println("The winning number will only be between 1 - 100");
            }

            System.out.println("Try again!");
        }
    }

    public static void main(String[] args) {
        HighLow(50);
    }
}
