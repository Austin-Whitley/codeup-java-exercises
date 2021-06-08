package groceryApp;
import java.util.Scanner;

public class Input {

    //this works but they want us to create a constructor for the scanner class
//    private Scanner scanner = new Scanner(System.in);

    private Scanner scanner;
    //create a constructor for the scanner so we can use it later
    public Input(){
        this.scanner = new Scanner(System.in);
    }

    //create a new Method that returns a string using the scanner we created.
    public String getString(){
        System.out.println("Do you have any string?");
        return this.scanner.nextLine();
    }

    boolean yesNo(){
        String userChoice = scanner.nextLine();
        return userChoice.trim().equalsIgnoreCase("y") || userChoice.trim().equalsIgnoreCase("yes");
    }

    //get a number from the user that is between two numbers
    int getInt(int min, int max){
        System.out.printf("Enter a whole number between %d and %d%n", min, max);
        int userChoice = scanner.nextInt();
        if(userChoice >= min && userChoice <= max){
            return userChoice;
        }else{
            System.out.println("That number is invalid");
            return getInt(min, max);
        }
    }

    //create an overloaded method (a method that shares its name with another) to get a whole number from the user
    int getInt(){
        System.out.println("Enter a number without decimals");
        return scanner.nextInt();
    }

    //get a number from the user that is between two numbers
    public double getDouble(double min, double max){
        System.out.printf("Please enter a decimal number between %f and %f%n", min, max);
        double userChoice = scanner.nextDouble();
        if(userChoice >= min && userChoice <= max){
            return userChoice;
        }else{
            System.out.println("That number is invalid");
            return getDouble(min, max);
        }
    }
    //create an overloaded method (a method that shares its name with another) to get a decimal number from the user
    public double getDouble(){
        System.out.println("Gimme your double");
        return scanner.nextDouble();
    }
}
