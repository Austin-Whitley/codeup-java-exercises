package dankPackage;

import java.lang.invoke.SwitchPoint;
import java.util.*;

public class User extends ItemList{

    private int wallet;
    private HashMap<Item, Integer> inventory = new HashMap<>();
    private String location;


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

    public void sellItem(Item i){
        if(getInventory().containsKey(i)){
            //remove one value from the item (if there are multiple)
            this.inventory.put(i, inventory.get(i) - 1);
            //if the item value reaches 0 remove it from the inventory
            if(this.inventory.get(i) == 0){
                this.inventory.remove(i);
            }
            System.out.println(i.getItemName() + " " + inventory.get(i));
            this.addMoney(i.getSalePrice());
        }else{
            System.out.println("You dont have that item");
        }
    }

    public void sellAllItem(Item i){
        if(getInventory().containsKey(i)){

            for(int repeatable = this.inventory.get(i); repeatable >= 0; repeatable--) {
                //remove one value from the item (if there are multiple)
                this.inventory.put(i, inventory.get(i) - 1);
                //if the item value reaches 0 remove it from the inventory
                if (this.inventory.get(i) == 0) {
                    this.inventory.remove(i);
                }
                System.out.println(i.getItemName() + " " + inventory.get(i));
                this.addMoney(i.getSalePrice());
            }

        }else{
            System.out.println("You dont have that item");
        }
    }

    public int getWallet(){
        return this.wallet;
    }
    public void addMoney(int amt){
        this.wallet += amt;
    }
    public void buyItem(int price){
        this.wallet -= price;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void getItemInformation(Item i){
        i.getItemInfo();
    }

    public User (){

    }

    public User(int wallet, HashMap<Item, Integer> inventory, String location) {
        this.wallet = wallet;
        this.inventory = inventory;
        this.location = location;
    }

    public Item findItemByName(String name){
        for(Item i : itemsList){
            if(i.getItemName().equalsIgnoreCase(name)){
                System.out.println(name + " sold for: $" + i.getSalePrice());
                return i;
            }else{
                System.out.println("That item does not exist");
            }
        }
        return air;
    }

    public static Item pickApple(User austin){
        if(austin.location.equals("forest")) {
            return apple;
        }

        return air;
    }

    public static void hunt(User austin){
        if(austin.inventory.containsKey(rifle)){
            System.out.println("You venture out into the wild...");

            int rand = (int)Math.floor(Math.random()*(3) + 1);
            // 1/3 chance to kill an animal - animal, junk, nothing
            if(rand == 1){ //caught an animal
                rand = (int) Math.floor(Math.random() * (100)+ 1); //random number 1-100 to determine what type of fish you caught

                //whats the likely hood to catch any of these animals?
                if(rand <= 20){ //skunk
                    austin.addItem(skunk);
                    System.out.println("You killed a skunk!");
                }else if(rand <= 50){ //rabbit
                    austin.addItem(rabbit);
                    System.out.println("You killed a rabbit!");
                }else if(rand <= 60){ //boar
                    austin.addItem(boar);
                    System.out.println("You killed a boar!");
                }else if(rand <= 70){ //deer
                    austin.addItem(deer);
                    System.out.println("You killed a deer!");
                }else if(rand <= 88){ //ox
                    austin.addItem(ox);
                    System.out.println("You killed an ox!");
                }else if(rand <= 92){ //bear
                    austin.addItem(bear);
                    System.out.println("You killed a bear!");
                }else if(rand <= 97){ //lion
                    austin.addItem(lion);
                    System.out.println("You killed a lion");
                }else if(rand <= 100){ //dragon
                    austin.addItem(dragon);
                    System.out.println("You killed a dragon!");
                }else{
                    System.out.println("Error: hunting Rand out-of-bounds");
                }
                //SWEET SCORE!! You caught some junk while fishing!
            }else if(rand == 2){ //Junk list
                rand = (int) Math.floor(Math.random() * (3)+ 1);
                if(rand == 1) {
                    System.out.println("You killed some junk.. wait what?");
                    austin.addItem(junk);
                }else if(rand == 2){
                    System.out.println("You found some garbage in the woods!");
                    austin.addItem(garbage);
                }else if(rand == 3){
                    System.out.println("You found an old boot!");
                    austin.addItem(oldboot);
                }

            }else{
                System.out.println("wooo! NOTHING");
            }
        }else{
            System.out.println("You need a rifle to do this.");
        }

    }

    public static void fishing(User austin){
        if(austin.inventory.containsKey(fishingrod)){
            System.out.println("You cast out your rod...");

            int rand = (int)Math.floor(Math.random()*(3) + 1);
            // 1/3 chance to catch a fish - fish, junk, nothing
            if(rand == 1){ //caught a regular fish
                rand = (int) Math.floor(Math.random() * (100)+ 1); //random number 1-100 to determine what type of fish you caught

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
                    System.out.println("Error: fishing Rand out-of-bounds");
                }
                //SWEET SCORE!! You caught some junk while fishing!
            }else if(rand == 2){ //Junk list
                rand = (int) Math.floor(Math.random() * (3)+ 1);
                if(rand == 1) {
                    System.out.println("You found some junk!");
                    austin.addItem(junk);
                }else if(rand == 2){
                    System.out.println("You found some garbage!");
                    austin.addItem(garbage);
                }else if(rand == 3){
                    System.out.println("You found an old boot!");
                    austin.addItem(oldboot);
                }

            }else{
                System.out.println("wooo! NOTHING");
            }
        }else{
            System.out.println("You need a fishing rod to do this.");
        }
    }

    public static void main(String[] args) {
        User austin = new User();
        Scanner scanner = new Scanner(System.in);

        austin.setLocation("plains");

        //pickpocket victims
        HashMap<String, Integer> victims = new HashMap<>();
        victims.put("man", 3000);
        victims.put("woman", 3000);
        victims.put("bum", 3);
        victims.put("kid", 10);
        victims.put("merchant", 15000);

        String userChoice = "";

        System.out.println("Enter: 'help' to get assistance");
        //while the user hasn't entered 'end' keep playing
        while(!userChoice.equalsIgnoreCase("end")){

//====================================HELP MENU==============================================\\
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
                System.out.println("fish: cast out your fishing rod in a nearby body of water");
                System.out.println("hunt: travel through the woods to hunt for animals");
                System.out.println("fight: attack monsters that enter your vicinity");
                System.out.println("walk: move your player around to different areas to use unique actions");
                System.out.println("map: retrieve your current location");
            }

            //grab user input
            userChoice = scanner.nextLine();

//            //test random number generator
//            if(userChoice.equalsIgnoreCase("get rand")){
//                for(int i = 0; i <= 10; i++) {
//                    System.out.println((int) Math.floor(Math.random() * (3)+ 1));
//                }
//            }
            if(userChoice.equalsIgnoreCase("fight")){
                if(!austin.inventory.containsKey(sword)){
                    System.out.println("You need a sword to do this.. maybe check the shop");
                }else{
                    //create a monster class that will hold undead creatures for the player to fight
                    //monsters need to have name, description, hp, and possible loot drops
                }
            }

//=========================================FISHING=========================================\\
            if(userChoice.equalsIgnoreCase("fish") && austin.location.equals("body of water")){
                fishing(austin);
            }else if(userChoice.equalsIgnoreCase("fish") && !austin.location.equals("body of water")){
                System.out.println("You need to be near a body of water to do this, try walking around.");
            }

//=========================================HUNTING=========================================\\
            //skunk, rabbit, boar, deer, ox, bear, lion, dragon,

            if(userChoice.equalsIgnoreCase("hunt") && austin.location.equals("forest")){
                hunt(austin);
            }else if(userChoice.equalsIgnoreCase("hunt") && !austin.location.equals("forest")){
                System.out.println("You need to be in a forest to do this, try walking around.");
            }

//=========================================GET ITEM INFO=========================================\\
            if(userChoice.contains("get info")){

                String search = userChoice.toLowerCase(Locale.ROOT);
                String[] findItem = search.split("get info ");

                for(Item i : austin.itemsList){
                    if(i.getItemID().equals(findItem[1])){
                        i.getItemInfo();
                    }
                }
            }

//=========================================BUY_ITEMS=========================================\\

            if (userChoice.contains("buy ") && austin.location.equals("market")) {

                //split their input from the word buy to figure out what they want
                String search = userChoice.toLowerCase(Locale.ROOT);
                String[] findItem = search.split("buy ");

                //if the item they are trying to buy is in the shop this will work
                for (Buyable b : austin.shop) {
                    if (b.getItemID().equals(findItem[1])) {
                        System.out.println("Purchase " + b.getItemName() + " for: $" + b.getBuyPrice() + "?");
                        System.out.print("(Y/N) : ");
                        userChoice = scanner.nextLine();
                        //secondary check to purchase
                        if (userChoice.equalsIgnoreCase("y") || userChoice.equalsIgnoreCase("yes")) {
                            //see if the user has enough money to buy that item
                            if (austin.getWallet() >= b.getBuyPrice()) {
                                austin.buyItem(b.getBuyPrice());
                                System.out.println("You bought 1 " + b.getItemName() + "! Current balance: " + austin.getWallet());
                                //add the item to the users inventory
                                austin.addItem(b);
                            } else {
                                System.out.println("You dont have enough money to purchase this item.");
                                System.out.println("You need " + (b.getBuyPrice() - austin.getWallet()) + " more dollars.");
                            }
                        }
                    }else {
                        System.out.println(findItem[1] + " is not inside the shop.");
                    }
                }
            } else if(userChoice.contains("buy ") && !austin.location.equals("market")){
                System.out.println("You need to be in a market to do this, try walking around.");
            }

            //sell an item
            if(userChoice.contains("sell ") && austin.location.equals("market")){
                String search = userChoice.toLowerCase(Locale.ROOT);
                String[] findItem = search.split("sell ");

                austin.sellItem(austin.findItemByName(findItem[1]));
            }

            //sell an item
            if(userChoice.contains("sell all ") && austin.location.equals("market")){
                String search = userChoice.toLowerCase(Locale.ROOT);
                String[] findItem = search.split("sell ");

                austin.sellAllItem(austin.findItemByName(findItem[1]));
            }

            //view the shop
            if(userChoice.contains("shop") && austin.location.equals("market")){
                viewShop();
            }

//=========================================THIEF=========================================\\
            if(userChoice.equalsIgnoreCase("pickpocket") && austin.location.equals("market")){
                //pickpocket the nearest person to you in the market
                int rand = (int)Math.floor(Math.random()*(5) + 1);
                if(rand == 1){
                    String[] victimsList = {"man", "woman", "bum", "kid", "merchant, "};
                    rand = (int)Math.floor(Math.random()*(5));
                    System.out.println("You successfully pickpocket a " + victimsList[rand]);
                    System.out.println(" + $" + victims.get(victimsList[rand]));
                    austin.addMoney(victims.get(victimsList[rand]));
                }else{
                    austin.setLocation("plains");
                    System.out.println("You were caught stealing and kicked out of the market!");
                }

            }else if(userChoice.equalsIgnoreCase("pickpocket") && !austin.location.equals("market")){
                System.out.println("You need to be in a market to do this, try walking around");
            }

            //set wallet balance
            if(userChoice.contains("give admin coin ")){
                String search = userChoice.toLowerCase(Locale.ROOT);
                String[] findItem = search.split("give admin coin ");

                austin.addMoney(Integer.parseInt(findItem[1]));
                System.out.println("New wallet balance: " + austin.getWallet());

            }

            //get the wallet balance
            if(userChoice.equalsIgnoreCase("get bal") || userChoice.equalsIgnoreCase("bal")){
                System.out.println("Balance: " + austin.getWallet());
            }

            //pick an apple off of the ground (test action)
            if(userChoice.equalsIgnoreCase("pick apple") && austin.location.equals("forest")){

                austin.addItem(pickApple(austin));
                System.out.println("You put an apple in your inventory!");
            }else if(userChoice.equalsIgnoreCase("pick apple") && !austin.location.equals("forest")){
                System.out.println("You need to be in a forest to do this");
            }

            //location changer
            if(userChoice.equalsIgnoreCase("walk")){
                String[] locations = {"body of water", "forest", "market", "plains", "dungeon"};
                int rand = (int) Math.floor(Math.random() * (5));
                //pick a location randomly
                System.out.println("You walk around for a while and come across a " + locations[rand]);

                austin.setLocation(locations[rand]);
                System.out.println(rand);
                System.out.println("User location: " + austin.getLocation());
            }

            //open the user's inventory
            if(userChoice.equalsIgnoreCase("open inv") || userChoice.equalsIgnoreCase("get inv") || userChoice.equalsIgnoreCase("inv")){
                if(austin.inventory.size() == 0){
                    System.out.println("Your inventory is empty!");
                }else {
                    System.out.println("Inventory: ");
                    for (Item i : austin.inventory.keySet()) {
                        String item = i.getItemName();
                        String numberOfItem = austin.inventory.get(i).toString();

                        System.out.println(numberOfItem + " : " + item);
                    }
                }
            }

        }
    }
}
