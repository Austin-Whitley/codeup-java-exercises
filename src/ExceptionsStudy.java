import java.util.Scanner;

public class ExceptionsStudy {
    public String maybeAnInteger = "42";
    public String notAnInteger = "Hey! I'm not a number";

    public void askForAnInteger(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter an Integer: ");
        String userInput = scanner.nextLine();
        try{
            int userInputInteger = Integer.parseInt(userInput);
        }catch(NumberFormatException nfx){
            System.out.println("Please enter an Integer this time... : " + userInput + " : is not a number");
        }finally {
            System.out.println("Thank you for using this application");
            System.out.println("Please visit again");
        }
    }

    //*** side note *** More specific catches must come before more general ones. when we chain exceptions, we need
    // the largest baskets on the bottom.
    //Or you will ironically get an "Already been caught" exception when trying to catch an exception.
    public void askForMoreComplexInteger(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        String userInput = scanner.nextLine();
        try{
            int userInputInteger = Integer.parseInt(userInput, 10, 15,10);
        }catch(IndexOutOfBoundsException iobe){
            System.out.println("Your string wasn't long enough");
        }catch(NumberFormatException nfe){
            System.out.println("No integer between characters 10 and 15");
        }catch(Exception e){
            System.out.println("In case we missed anything with the specific catches");
        }
        finally{
            System.out.println("Thank you for visiting, please come back again.");
        }


    }

    public void echoWord() throws IllegalArgumentException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("I'm a parrot. Please say something and I will repeat it.");
    }

}
