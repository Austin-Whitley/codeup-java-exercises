import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {
        //Control statements and loops
//        String customerChoice = "Chocolate";
//
//        switch (customerChoice){
//            case "vanilla":
//                System.out.println("One vanilla coming up");
//                break;
//            case "chocolate":
//                System.out.println("One chocolate coming up");
//                break;
//            case "strawberry":
//                System.out.println("One strawberry coming up");
//                break;
//            default:
//                System.out.println("We dont have that at the moment, Sorry.");
//                break;
//        }
//
//         /* logical operators - &&, ||, ! */
//        int c = 0, d = 100, e = 50;
//
//        //short circuit operator
//        if(c == 1 && e++ < 100){
//            //do anything
//        }
//        System.out.println("e = "+ e);
//        //e is not increased because the moment the first case executes as false the if statement short circuits out of the test.
//
//        if(c == 1 & e++ < 100){
//            //do something
//        }
//        System.out.println("e = "+ e);
        //This does increment e because the single & operator will always test both cases

        //these get stored in the same String pool so they execute as true
//        String myName = "Austin";
//        String anotherName = "Austin";
//
//        String austin = new String("Austin");
//
//        System.out.println(myName == anotherName); //true
//        System.out.println(myName == austin); //false

        //The reason the second is false is because the equality operator looks for the location they are stored and
        // not the value the variables contain
        //it checks the reference code instead of the value
        //further reading: https://codegym.cc/groups/posts/equals-and-string-comparsions

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Whats your name?");
//        String userInput = scanner.next();
//        if(userInput == austin){
//            System.out.println("You are me!");
//        }else{
//            System.out.println("You are not me!");
//        }
        /*-----------------------------Loops!------------------------------*/

        int i = 1;
        while(i <= 10){
            System.out.println("Hello: " + i);
            i++;
        }


    }
}
