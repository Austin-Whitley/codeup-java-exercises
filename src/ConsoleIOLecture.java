import java.util.Scanner;

public class ConsoleIOLecture {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        String name = "Eduardo";
        System.out.printf("Hello, %s", name);

        //format allows you to insert variables inside the print line.
        //we can pass in numbers with %d, floats with %f, strings with %s, and booleans with %b
        //when using %f you can determine the number of trailing decimal places by including it in the %format
        //Example: pi = 3.1415926 (%.2f, pi) will print 3.14, where .2 is the determinate of decimal places
        //if no variable is passed for a boolean the default value is true
        //full documentation can be found here: https://docs.oracle.com/javase/tutorial/java/data/numberformat.html
        System.out.format("%d is %s's favorite number %b%n", 42, name, false);

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Hey friend, hows it goin?");
//        String userInput = scanner.nextLine();
//
//        System.out.printf("You're feeling: %s%n", userInput);
//
//        //Next instance
//        System.out.println("Give me a number friendo!");
//        int userNum = scanner.nextInt();
//
//        System.out.println("Dang! " + userNum + " That's a pretty cool number friendo!");

        System.out.println("Give me a number: ");
        String userString = scanner.nextLine();

        double userNumber = Double.parseDouble(userString);


    }
}
