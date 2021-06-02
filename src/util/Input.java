package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public String getString(String string){
        return string;
    }

    boolean yesNo(){
        String userChoice = scanner.nextLine();
        if(userChoice.equalsIgnoreCase("y") || userChoice.equalsIgnoreCase("yes")){
            return true;
        }
        else{
            return false;
        }
    }
    int getInt(int min, int max){
        System.out.printf("Enter a number between %d and %d%n", min, max);
        int userChoice = scanner.nextInt();
        if(userChoice >= min && userChoice <= max){
            return userChoice;
        }else{
            getInt(min, max);
            return -1;
        }
    }
    int getInt(int num){
        return num;
    }
    double getDouble(double min, double max){
        System.out.printf("Please enter a number between %f and %f%n", min, max);
        double userChoice = scanner.nextDouble();
        if(userChoice >= min && userChoice <= max){
            return userChoice;
        }else{
            getDouble(min, max);
            return -1;
        }
    }
    double getDouble(){
        return -1;
    }

}
