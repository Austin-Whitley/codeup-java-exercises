package dankPackage;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.HashMap;
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

            userChoice = scanner.nextLine();

            if(userChoice.equalsIgnoreCase("fish")){
                if(austin.inventory.containsKey(fishingrod)){
                    System.out.println("You cast out your rod...");
                    int rand = (int)Math.floor(Math.random()*(100 + 1)+1);
                    if(rand )
                }else{
                    System.out.println("You need a fishing rod to do this.");
                }
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
