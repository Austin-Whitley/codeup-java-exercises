package OopLecture;
import java.util.Scanner;


public class UserTools {

    public static Scanner scanner = new Scanner(System.in);

    //Test if the users password is the same as the entered string
    //if so then change the "loggedIn" variable to true
    public static void logIn(User u) {
        System.out.println("Please enter your password: ");

        String userPassword = scanner.nextLine();

        if(userPassword.equals(u.getPassword())){
            System.out.println("Correct! You are now logged in.");
            u.setLoggedIn(true);
        }else{
            System.out.println("Incorrect.");
        }
    }

    //If the user is already logged in and they would like to log out, set the "LoggedIn" variable to false
    public static void logOut(User u){
        System.out.println("Are you sure you want to log out? (Y/N)");
        String userChoice = scanner.nextLine();

        if(userChoice.equalsIgnoreCase("y")){
            System.out.println("You have been logged out");
            u.setLoggedIn(false);
        }else{
            System.out.println("You will stay logged in.");
        }
    }

    public static void changeUsername(User u){
        if(!u.isLoggedIn()){
            System.out.println("Sorry, you have to be logged in to do this");
            logIn(u);
        }else{
            System.out.println("Your Username is: " + u.getUsername());
            System.out.println("Enter a new username: ");
            String newUsername = scanner.nextLine();
            u.setUsername(newUsername);
            System.out.println("Your username has been changed to: " + u.getUsername());
        }
    }

    public static void changePassword(User u){
        if(!u.isLoggedIn()){
            System.out.println("Sorry, you have to be logged in to do this");
            logIn(u);
        }else{
            System.out.println("Please enter your current password:");
            String currentPassword = scanner.nextLine();
            if(u.getPassword().equals(currentPassword)){
                System.out.println("Please enter a new password:");
                String newPassword = scanner.nextLine();

                u.setPassword(newPassword);

            }else{
                System.out.println("Sorry that password is incorrect");
            }
        }
    }

    public static void main(String[] args) {
        User user2 = new User("Blake", "mountainBiker1983", "bikerBlake@aol.com");
        System.out.println("Username: " + user2.getUsername());
        System.out.println("Password: " + user2.getPassword()); //since we are outside of the original class we have to user getters and setters
        System.out.println("Email: " + user2.email);

        logIn(user2);
        changePassword(user2);
    }
}
