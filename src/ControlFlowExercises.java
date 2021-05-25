import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        for(int i = 5; i <= 15; i++){
            System.out.println(i);
        }

        for(long i = 2; i <= 1000000; i = i * i){
            System.out.println(i);
        }

        for(byte i = 1; i <= 3; i++){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Passcode: ");
            int userInput = scanner.nextInt();
            if(userInput == 12345){
                System.out.println("Welcome home sir/madam");
            }
            else{
                System.out.println("Incorrect, " + (3 - i) + " attempt(s) remaining.");
            }
        }

    }
}
