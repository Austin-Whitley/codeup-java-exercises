import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        System.out.println("Hey, my mom said you wanted to talk or something.. whats up man?");
        System.out.println("Reply to bob or type \"end\" to stop talking to bob");
        Scanner scanner = new Scanner(System.in);
        String userInput = "";

        do {
            userInput = scanner.nextLine();

            System.out.print("Bob: ");
            if (userInput.endsWith("?")) {
                System.out.print("Sure.\n");
            } else if (userInput.endsWith("!")) {
                System.out.print("Whoa, chill out!\n");
            } else if (userInput == "") {
                System.out.print("Fine. Be that way!\n");
            }else if(userInput.equals("end")){
                System.out.print("later man.\n");
            }else {
                System.out.print("Whatever.\n");
            }
        }while(!userInput.equalsIgnoreCase("end"));
    }
}
