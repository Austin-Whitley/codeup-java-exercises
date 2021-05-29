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
            result = result + num1;
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
        int userDice = 0;
        int roll = 0;

        System.out.println("Please give me a dice to roll: \n[d3], [d4], [d6], [d8], [d10], [d12], [d20]");
        userDice = sc.nextInt();

        for(int i = 1; i <= 2; i++) {
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
            }
            if(i == 1) {
                System.out.print("Your rolls are: " + roll);
            }
        }
        System.out.print(" and ");
        return roll;
    }


    public static void main(String[] args) {
        System.out.println( "Addition: " + Addition(5, 5));
        System.out.println("Subtraction: " + Subtraction(10,5));
        System.out.println("Multiplication: " + Multiplication(5,10));
        System.out.println("Division: " + Division(25,5));
        System.out.println("Modulus: " + Modulus(24,5));

        getInteger(1, 10);
        System.out.println(factorial());
        System.out.printf("%d%n", diceRoll());
    }
}
