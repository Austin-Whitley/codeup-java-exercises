package groceryApp;

public class GroceryList {

    public static void main(String[] args) {
        System.out.println("Would you like to make a grocery list?");
        Input input = new Input();
        System.out.println("(Yes/No) | Answer: ");
        String userChoice = input.getString();
        if(userChoice.equalsIgnoreCase("yes")){
            System.out.println("Yes");
        }
        else if(userChoice.equalsIgnoreCase("no")){
            System.out.println("No");
        }else{
            System.out.println("That option is not available");
        }
    }
}
