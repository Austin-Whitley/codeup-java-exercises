import java.util.Scanner;

public class StringExercise {
    public static void main(String[] args) {
        String output1 = "We don't need no education\n" +
                "We don't need no thought control";
        String output2 = "Check \"this\" out!, \"s inside of \"s!";
        String output3 = "In windows, the main drive is usually C:\\";
        String output4 = "I can do backslashes \\, double backslashes \\\\,\n" +
                "and the amazing triple backslash \\\\\\!";

        System.out.println(output1 + "\n" + output2 + "\n"+ output3 + "\n"+ output4);

    }
}
class bob{
    public static void main(String[] args) {
        System.out.println("Say something to bob:");
        System.out.println("Type \"end\" to stop talking to bob");
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
        }while(!userInput.equals("end"));

    }
}
