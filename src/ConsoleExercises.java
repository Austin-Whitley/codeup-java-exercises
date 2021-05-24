import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        //variables
        Scanner scanner = new Scanner(System.in);
        double pi = 3.14159;

        int userInt = 0;
        double userLength = 0.0;
        double userWidth = 0.0;
        double userHeight = 0.0;

        String wordOne = "";
        String wordTwo = "";
        String wordThree = "";

        String userString = "";


        System.out.format("The value of pi is approximately %.2f %n", pi);

        System.out.println("Please enter a number:");
        userInt = scanner.nextInt();
        System.out.println("You entered: "+ userInt);

        //QUESTION: What happens if you input something that is not an integer?
        //ANSWER: The Compiler throws an exception since the expected input is not of the same datatype

        System.out.println("Please enter Three words (separated by a [SPACE]): ");
        wordOne = scanner.next();
        wordTwo = scanner.next();
        wordThree = scanner.next();

        System.out.printf("Word one was: \"%s\", word two was: \"%s\", and word three was: \"%s\"", wordOne, wordTwo, wordThree);

        //QUESTION: What happens if you enter less than 3 words?
        //ANSWER: When you try to submit your two word answer they terminal just returns to the next line and nothing
        //        else is printed to the screen. You must enter three words to continue

        //QUESTION: What happens if you enter more than 3 words?
        //ANSWER: Nothing will happen unless your next instance of user input is using the .next() method, in which
        //        case the input will overflow to those instances

        System.out.println("Please enter a sentence: ");
        userString = scanner.nextLine();
        userString = scanner.nextLine();
        System.out.println(userString);

        //QUESTION: do you capture all the words using the .next() method?
        //ANSWER: No, only the first word, the whitespace acts as a separator.

        System.out.println("Please enter the LENGTH then WIDTH then HEIGHT of your classroom in FEET: ");

        userString = scanner.nextLine();
        String[] arrOfString = userString.split(" ", 3);

        userLength = Double.parseDouble(arrOfString[0]);
        userWidth = Double.parseDouble(arrOfString[1]);
        userHeight = Double.parseDouble(arrOfString[2]);

        System.out.println(userLength);
        System.out.println(userWidth);
        System.out.println(userHeight);

        System.out.println("Your classroom's perimeter: " + (userLength*2 + userWidth*2)
                + "ft\nArea: " + (userLength * userWidth) + "^2ft\nVolume: " + (userLength * userWidth * userHeight) + "^3ft");

    }
}
