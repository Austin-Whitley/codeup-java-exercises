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
            int userNum = scanner.nextInt();
            if(userNum == 12345){
                System.out.println("Welcome home sir/madam");
                i = 3;
            }
            else{
                System.out.println("Incorrect, " + (3 - i) + " attempt(s) remaining.");
            }
        }

        int userInput = 0;
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter a number: ");
            userInput = scanner.nextInt();
            System.out.println("Your number: " + userInput);
            System.out.println("Here's a table of powers around your number.");
            System.out.println("Number | Squared | Cubed ");
            System.out.println(userInput - 2 + "\t\t| " + ((userInput-2) * (userInput-2)) + "\t| " + ((userInput-2) * (userInput-2) * (userInput-2)));
            System.out.println(userInput - 1 + "\t\t| " + ((userInput-1) * (userInput-1)) + "\t| " + ((userInput-1) * (userInput-1) * (userInput-1)));
            System.out.println(userInput + "\t\t| " + (userInput * userInput) + "\t| " + (userInput * userInput * userInput));
            System.out.println(userInput + 1 + "\t\t| " + ((userInput+1) * (userInput+1)) + "\t| " + ((userInput+1) * (userInput+1) * (userInput+1)));
            System.out.println(userInput + 2 + "\t\t| " + ((userInput+2) * (userInput+2)) + "\t| " + ((userInput+2) * (userInput+2) * (userInput+2)));

            System.out.println("Enter another number: \n (enter -1 to exit)");
        }while(userInput != -1);

    }
}
