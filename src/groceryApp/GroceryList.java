package groceryApp;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class GroceryList {

    public static void main(String[] args) {
        HashMap<Character, ArrayList<String>> groceryStore = new HashMap<>();
        //bakery section
        ArrayList<String> bakery = new ArrayList<>();
        bakery.add("Bread");
        bakery.add("Donuts");
        bakery.add("Danish");
        bakery.add("sweet rolls");
        bakery.add("cinnamon rolls");
        bakery.add("coffee cake");
        //dairy section
        ArrayList<String> dairy = new ArrayList<>();
        dairy.add("Butter");
        dairy.add("Cheese");
        dairy.add("Milk");
        dairy.add("Yogurt");
        dairy.add("Whipped cream");
        dairy.add("Heavy cream");
        //Meat and Sea food section
        ArrayList<String> meatAndSeafood = new ArrayList<>();
        meatAndSeafood.add("Chicken");
        meatAndSeafood.add("Steak");
        meatAndSeafood.add("Pork");
        meatAndSeafood.add("Sausage");
        meatAndSeafood.add("Shrimp");
        meatAndSeafood.add("Salmon");
        //Frozen foods section
        ArrayList<String> frozenFood = new ArrayList<>();
        frozenFood.add("Ice cream");
        frozenFood.add("Waffles");
        frozenFood.add("Garlic Bread");
        frozenFood.add("Entrees");
        frozenFood.add("Pizza");
        frozenFood.add("Vegetables");

        //Grocery store hashmap containing each section
        groceryStore.put('B', bakery);
        groceryStore.put('D', dairy);
        groceryStore.put('F', frozenFood);
        groceryStore.put('M', meatAndSeafood);

        String[] sectionList = {"Bakery", "Dairy", "Frozen foods", "Meat and Seafood"};

        System.out.println("Would you like to make a grocery list?");
        Input input = new Input();
        System.out.println("(Yes/No) | Answer: ");
        String userChoice = input.getString();
        if(userChoice.equalsIgnoreCase("yes")){
            System.out.println("Welcome to A-E-B");
            System.out.println("Please select a section to look through: ");
            int i = 0;
            for (Object sectionKey: groceryStore.keySet()){
                System.out.print(sectionKey + " : ");
                System.out.println(sectionList[i]);
                i++;
            }
            userChoice = input.getString();
            if(userChoice.equalsIgnoreCase("b")){
                System.out.println();
            }else if(userChoice.equalsIgnoreCase("d")){

            }else if(userChoice.equalsIgnoreCase("f")){

            }else if(userChoice.equalsIgnoreCase("m")){

            }

        }
        else if(userChoice.equalsIgnoreCase("no")){
            System.out.println("No");
        }else{
            System.out.println("That option is not available");
        }
    }
}
