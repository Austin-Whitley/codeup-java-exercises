import java.util.Random;
import java.util.Scanner;

public class MethodsExercises {
    public static int Addition(int num1, int num2){
        return num1 + num2;
    }
    public static int Subtraction(int num1, int num2){
        return num1 - num2;
    }
    public static int Multiplication(int num1, int num2){
        int result = 0;
        for(int i = 0; i < num2; i++){
            result += num1;
        }
        return result;
    }
    public static double Division(double num1, double num2){
        return num1 / num2;
    }
    public static double Modulus(double num1, double num2){
        return num1 % num2;
    }

    public static int getInteger(int min, int max){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Please enter a number between %d and %d%n", min, max);
        int userInput = 0;
        do {
            userInput = sc.nextInt();
            if (userInput <= max && userInput >= min) {
                System.out.println("Looks like you know how to follow directions!");

            } else {
                System.out.printf("Please enter a number between %d and %d%n", min, max);
            }
        }while(userInput > max || userInput < min);

        return userInput;
    }

    public static long factorial(){
        long result = 1;
        int num1 = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter a number between 1 - 10 | (-1 to exit)");
            num1 = sc.nextInt();
            if (num1 <= 10 && num1 >= 1) {
                System.out.printf("%d! = ", num1);
                for (int i = 1; i <= num1; i++) {
                    System.out.printf(" %d ", i);
                    result = result * i;
                    if (i < num1) {
                        System.out.print(" x ");
                    } else {
                        System.out.printf(" = %d%n", result);
                        result = 1;
                    }
                }
            }else if(num1 == -1){
                System.out.println("Thank you, come again!");
            }
            else {
                System.out.println("That number is not between 1-10... try again..%n");
            }
        }while(num1 != -1);

        return result;
    }

    public static int diceRoll(){
        Scanner sc = new Scanner(System.in);
        Random randDice = new Random();

        int userDice = 0, roll = 0;
        boolean stopRolling = false;
        String userChoice = "";

        do {
            System.out.println("Please give me a dice to roll: \n[3], [4], [6], [8], [10], [12], [20]");
            userDice = sc.nextInt();

            for (int i = 1; i <= 2; i++) {
                if (userDice == 3) {
                    roll = randDice.nextInt(userDice + 1);
                } else if (userDice == 4) {
                    roll = randDice.nextInt(userDice + 1);
                } else if (userDice == 6) {
                    roll = randDice.nextInt(userDice + 1);
                } else if (userDice == 8) {
                    roll = randDice.nextInt(userDice + 1);
                } else if (userDice == 10) {
                    roll = randDice.nextInt(userDice + 1);
                } else if (userDice == 12) {
                    roll = randDice.nextInt(userDice + 1);
                } else if (userDice == 20) {
                    roll = randDice.nextInt(userDice + 1);
                }else{
                    if(i == 1) {
                        System.out.println("I haven't seen that die before");
                    }
                }
                //=============================================//
                if (i == 1) {
                    System.out.print("Your rolls are: " + roll);
                }
            }
            System.out.printf(" and %d%n", roll);
            System.out.println("Would you like to roll again? ('y' or 'n')");
            userChoice = sc.next();
            if(userChoice.equalsIgnoreCase("y")){
                stopRolling = false;
            }else if(userChoice.equalsIgnoreCase("n")){
                stopRolling = true;
            }else{
                System.out.println("Uncaught exception: breaking...");
                break;
            }
        }while(!stopRolling);
        return roll;
    }

    //Validate user input
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

//        System.out.println( "Addition: " + Addition(5, 5));
//        System.out.println("Subtraction: " + Subtraction(10,5));
//        System.out.println("Multiplication: " + Multiplication(5,10));
//        System.out.println("Division: " + Division(25,5));
//        System.out.println("Modulus: " + Modulus(24,5));
//
//        getInteger(1, 10);
//        System.out.println(factorial());
//        diceRoll();
        HighLow(10);
    }
}
