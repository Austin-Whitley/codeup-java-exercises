package groceryApp;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import util.Input;

public class GroceryList {

    public static void main(String[] args) {

        ArrayList<String> groceryList = new ArrayList<>();
        ArrayList<Integer> tempList = new ArrayList<>();

        HashMap<String, ArrayList<String>> groceryStore = new HashMap<>();
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
        groceryStore.put("B", bakery);
        groceryStore.put("D", dairy);
        groceryStore.put("F", frozenFood);
        groceryStore.put("M", meatAndSeafood);

        String[] sectionList = {"Bakery", "Dairy", "Frozen foods", "Meat and Seafood"};

        System.out.println("Would you like to make a grocery list?");
        Input input = new Input();
        System.out.print("(Yes/No) | Answer: ");
        String userChoice = input.getString();
        if(userChoice.equalsIgnoreCase("yes")) {
            while (!userChoice.equalsIgnoreCase("end")) {
                System.out.println("==========================================================");
                System.out.println("Welcome to A-E-B");
                System.out.println("Please select a section to look through: ");
                int i = 0;
                for (Object sectionKey : groceryStore.keySet()) {
                    System.out.print(sectionKey + " : ");
                    System.out.println(sectionList[i]); //since groceryStore.get('key') was printing the whole arrayList of items
                    // Im iterating through a regular array that holds the section names
                    i++;
                }
                System.out.print("Selection: ");
                userChoice = input.getString();
                //show section based on user response
                int k = 0;
                int userItem = 0;
                if (userChoice.equalsIgnoreCase("b")) {
                    System.out.println("Welcome to the Bakery:");

                    tempList = printSection(bakery, input, k, userItem); //call print section method to list items and take user input
                    for (Integer integer : tempList) {
                        ArrayList<String> tempArray = groceryStore.get(userChoice.toUpperCase(Locale.ROOT));
                        groceryList.add(tempArray.get(integer));
                    }
                    tempList.clear();
                } else if (userChoice.equalsIgnoreCase("d")) {
                    System.out.println("Welcome to the Dairy isle:");
                    tempList = printSection(dairy, input, k, userItem);
                    for (Integer integer : tempList) {
                        ArrayList<String> tempArray = groceryStore.get(userChoice.toUpperCase(Locale.ROOT));
                        groceryList.add(tempArray.get(integer));
                    }
                    tempList.clear();

                } else if (userChoice.equalsIgnoreCase("f")) {
                    System.out.println("Welcome to the Frozen section:");

                    tempList = printSection(frozenFood, input, k, userItem);
                    for (Integer integer : tempList) {
                        ArrayList<String> tempArray = groceryStore.get(userChoice.toUpperCase(Locale.ROOT));
                        groceryList.add(tempArray.get(integer));
                    }
                    tempList.clear();
                } else if (userChoice.equalsIgnoreCase("m")) {
                    System.out.println("Welcome to the Meat and Seafood section:");

                    tempList = printSection(meatAndSeafood, input, k, userItem);

                    for (Integer integer : tempList) {
                        ArrayList<String> tempArray = groceryStore.get(userChoice.toUpperCase(Locale.ROOT));
                        groceryList.add(tempArray.get(integer));
                    }
                    tempList.clear();
                } else {
                    System.out.println("I'm sorry that section is not available.");
                }
            }
        }
        else if(userChoice.equalsIgnoreCase("no")){
            System.out.println("No");
        }else{
            System.out.println("That option is not available");
        }
        for(int m = 0; m < groceryList.size(); m++) {
            System.out.println(groceryList.get(m));
        }
    }

    private static ArrayList<Integer> printSection(ArrayList<String> section, Input input, int k, int userItem) {
        ArrayList<Integer> itemsChosen = new ArrayList<>();
        while(userItem != -1) {
        for (Object item: section) {
            System.out.print((k + 1) + " : ");
            System.out.print(item + "\n");
            k++;
        }
            System.out.println("Enter a number to add it to your cart.");
            System.out.print("(-1 to EXIT) Selection: #");
            userItem = input.getInt();
            k = 0;
            if(userItem != -1) {
                itemsChosen.add(userItem - 1);
            }else{
                System.out.println("Going back to the HUB...");
            }
        }
        return itemsChosen;
    }

}
