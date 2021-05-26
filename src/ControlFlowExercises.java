import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        for(int i = 5; i <= 15; i++){
            System.out.println(i);
        }

        for(long i = 2; i <= 1000000; i = i * i){
            System.out.println(i);
        }

        final int pin = 12345;

        for(byte i = 1; i <= 3; i++){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Passcode: ");
            int userNum = scanner.nextInt();
            if(userNum == pin){
                System.out.println("Welcome home sir/madam");
                i = 3;
            }else if(i == 3){
                System.out.println("you've been locked out");
            }
            else{
                System.out.println("Incorrect, " + (3 - i) + " attempt(s) remaining.");
            }
        }

        int userInput = 0;
        Scanner scanner = new Scanner(System.in);
        String userResponse = "";
        do {
            System.out.println("What number would you like to go to?");
            userInput = scanner.nextInt();

            System.out.println("Your number: " + userInput);
            System.out.println("Here's a table of powers to your number.");
            System.out.println("Number | Squared | Cubed ");
            for (int i = 0; i <= userInput; i++) {
                System.out.println(i + "\t\t| " + (i * i) + "\t| " + (i * i * i));
            }
            System.out.println("Would you like to continue? Yes/No : ");
            userResponse = scanner.next();
        }while(userResponse.equals("yes") || userResponse.equals("Yes") || userResponse.equals("YES"));

//        int userInput = 0;
//        do{
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Please enter a number: ");
//            userInput = scanner.nextInt();
//            System.out.println("Your number: " + userInput);
//            System.out.println("Here's a table of powers around your number.");
//            System.out.println("Number | Squared | Cubed ");
//            System.out.println(userInput - 2 + "\t\t| " + ((userInput-2) * (userInput-2)) + "\t| " + ((userInput-2) * (userInput-2) * (userInput-2)));
//            System.out.println(userInput - 1 + "\t\t| " + ((userInput-1) * (userInput-1)) + "\t| " + ((userInput-1) * (userInput-1) * (userInput-1)));
//            System.out.println(userInput + "\t\t| " + (userInput * userInput) + "\t| " + (userInput * userInput * userInput));
//            System.out.println(userInput + 1 + "\t\t| " + ((userInput+1) * (userInput+1)) + "\t| " + ((userInput+1) * (userInput+1) * (userInput+1)));
//            System.out.println(userInput + 2 + "\t\t| " + ((userInput+2) * (userInput+2)) + "\t| " + ((userInput+2) * (userInput+2) * (userInput+2)));
//
//            System.out.println("Enter another number: \n (enter -1 to exit)");
//        }while(userInput != -1);

        int userGrade = 0;
        do {
            System.out.println("Enter your grade: (0-100)");
            userGrade = scanner.nextInt();

            if(userGrade >= 88){
                System.out.println("A");
            }else if(userGrade >= 80){
                System.out.println("B");
            }else if(userGrade >= 67){
                System.out.println("C");
            }else if(userGrade >= 60){
                System.out.println("D");
            }else if(userGrade >= 0){
                System.out.println("F");
            }else{
                System.out.println("Uncaught exception");
            }

            System.out.println("Enter another grade: \n (enter -1 to exit)");
        }while(userGrade != -1);
    }
}
