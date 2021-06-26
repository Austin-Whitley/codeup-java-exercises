package dankPackage;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class User extends ItemList{

    private int wallet;
    private HashMap<Item, Integer> inventory = new HashMap<>();


    public HashMap<Item, Integer> getInventory() {
        return inventory;
    }
    public void addItem(Item i) {
        if(getInventory().containsKey(i)){
            this.inventory.put(i, inventory.get(i) + 1);
        }else{
            this.inventory.put(i, 1);
        }
    }

    public int getWallet(){
        return this.wallet;
    }
    public void addMoney(int amt){
        this.wallet += amt;
    }

    public void getItemInformation(Item i){
        i.getItemInfo();
    }

    public static void main(String[] args) {
        User austin = new User();
        Scanner scanner = new Scanner(System.in);

        String userChoice = "";

        System.out.println("Enter: 'help' to get assistance");
        //while the user hasn't entered 'end' keep playing
        while(!userChoice.equalsIgnoreCase("end")){

            //Help menus
            if(userChoice.equalsIgnoreCase("help") || userChoice.equalsIgnoreCase("help list")){
                System.out.println("help inventory : show list of inventory commands");
                System.out.println("help balance : show a list of balance commands");
                System.out.println("help actions : show a list of available actions");
            }else if(userChoice.equalsIgnoreCase("help inventory") || userChoice.equalsIgnoreCase("help inv")) {
                System.out.println("open inv : See what items you are carrying");
                System.out.println("sell {item} : trade an item for money");
                System.out.println("use {item} : use an item, you will not get it back after using it. (doesnt work on everything)");
            }else if(userChoice.equalsIgnoreCase("help balance") || userChoice.equalsIgnoreCase("help bal")){
                System.out.println("bal : view how much money you have");
            }else if(userChoice.equalsIgnoreCase("help actions") || userChoice.equalsIgnoreCase("help act")){
                System.out.println("pick apple : add an apple to your inventory");
            }

            //grab user input
            userChoice = scanner.nextLine();

            //test random number generator
            if(userChoice.equalsIgnoreCase("get rand")){
                for(int i = 0; i <= 10; i++) {
                    System.out.println((int) Math.floor(Math.random() * (3)+ 1));
                }
            }

            //fishing
            if(userChoice.equalsIgnoreCase("fish")){
                if(austin.inventory.containsKey(fishingrod)){
                    System.out.println("You cast out your rod...");

                    int rand = (int)Math.floor(Math.random()*(3) + 1);
                    // 1/3 chance to catch a fish - fish, junk, nothing
                    if(rand == 1){ //caught a regular fish
                        rand = (int) Math.floor(Math.random() * (100)+ 1);

                        if(rand <= 50){ //fish
                            austin.addItem(fish);
                            System.out.println("You caught a fish!");
                        }else if(rand <= 80){ //rare fish
                            austin.addItem(rarefish);
                            System.out.println("You caught a Rare fish!");
                        }else if(rand <= 95){ //legendary fish
                            austin.addItem(legendaryfish);
                            System.out.println("You caught a Legendary fish!");
                        }else if(rand <= 100){ //exotic fish
                            austin.addItem(exoticfish);
                            System.out.println("You caught an Exotic fish!");
                        }else{
                            System.out.println("Something went wrong...");
                        }


                    }else if(rand == 2){ //junk
                        System.out.println("You found some junk!");

                    }else{
                        System.out.println("wooo! NOTHING");
                    }
                }else{
                    System.out.println("You need a fishing rod to do this.");
                }
            }

            //get item info
            if(userChoice.contains("get info")){

                String search = userChoice.toLowerCase(Locale.ROOT);
                String[] findItem = search.split("get info ");


//                System.out.println(search);
//                System.out.println(findItem[1]);

                //I need to be able to search through a hashmap of objects only using a string
                System.out.println(austin.inventory.get(findItem[1]));

                //theses are how this would normally be called:
                apple.getItemInfo();
                fish.getItemInfo();
            }

            if(userChoice.equalsIgnoreCase("pick apple")){
                austin.addItem(apple);
                System.out.println("You put an apple in your inventory!");
            }
            if(userChoice.equalsIgnoreCase("open inv")){
                System.out.println("Inventory: ");
                for(Item i: austin.inventory.keySet()){
                    String item = i.getItemName();
                    String numberOfItem = austin.inventory.get(i).toString();

                    System.out.println(numberOfItem + " : " + item);
                }
            }

        }
    }
}
