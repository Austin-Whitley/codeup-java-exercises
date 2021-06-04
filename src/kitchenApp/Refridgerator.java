package kitchenApp;

import java.util.Scanner;

public class Refridgerator extends Appliance implements StoreFood{
    //we cant extend Appliance because there isn't a default constructor so lets make one

    private boolean hasShelves;

    public boolean isHasShelves() {
        return hasShelves;
    }
    public void setHasShelves(boolean hasShelves) {
        this.hasShelves = hasShelves;
    }

    //========================================================
    public void setType(String type){
        this.type = type;
    }
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Refridgerator(String type, String brandName, boolean hasShelves){
        super(type, brandName);
        this.hasShelves = hasShelves;
    }

    public void keepFresh(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to put something in the fridge? (Y/N)");
        String userChoice = scanner.nextLine();
        while(userChoice.equalsIgnoreCase("y") || userChoice.equalsIgnoreCase("yes")){
            System.out.println("What would you like to put in the fridge?");
            String item = scanner.nextLine();
            System.out.printf("Okay, i'll keep your %s cold for you.\n", item);
            System.out.println("Would you like to put anything else in the fridge? (Y/N)");
            userChoice = scanner.nextLine();
        }
        System.out.println("Okay, closing the door...");

    }
}
