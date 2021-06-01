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
        return min;
    }
    double getDouble(){
        return -1;
    }

    public static void main(String[] args) {
        Input test = new Input();

        System.out.println(test.yesNo());

        test.getInt(1, 10);
        System.out.println(test.getInt(10));


    }

}
