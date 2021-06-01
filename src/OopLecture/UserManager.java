package OopLecture;
import java.util.Scanner;

public class UserManager {
    public static Scanner scanner = new Scanner(System.in);

    public static void startMenu(User u){
        System.out.println("Welcome, what would you like to do?");
        System.out.println("1. Log in \n2. Exit Program");
        int userChoice = scanner.nextInt();
        if(userChoice == 1){
           UserTools.logIn(u);
           editPreferences(u);
        }else if(userChoice == 2){
            System.out.println("Thank you for your time, Bye!");
        }
    }

    public static void editPreferences(User u){
        if(!u.isLoggedIn()){
            System.out.println("You need to log in first");
            UserTools.logIn(u);
        }else{
            System.out.println("Welcome to your preferences. Would you like to: \n1. change your password? \n2. change your Username? \n3. Get profile description?");
            int userChoice = scanner.nextInt();
            System.out.println("You chose choice: " + userChoice);
            switch (userChoice){
                case 1:
                    UserTools.changePassword(u);
                    editPreferences(u);
                    break;
                case 2:
                    UserTools.changeUsername(u);
                    editPreferences(u);
                    break;
                case 3:
                    u.describeUser();
                    editPreferences(u);
                    break;
                default:
                    UserTools.logOut(u);
            }
        }
    }

    public static void main(String[] args) {

        User testUser = new User();
        testUser.id = 1;
        testUser.setUsername("Austin");
        testUser.setPassword("PassTheWord");
        testUser.email = "Austin.whitley@gmail.com";

//        UserTools.logIn(testUser);

        startMenu(testUser);


    }
}
