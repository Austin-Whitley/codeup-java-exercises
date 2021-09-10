package dankPackage;

public class Item {

    private String itemID;
    private String name;
    private int salePrice;
    private String description;
    private double weight;

    public Item(String itemID, String name, int salePrice, String desc, double lb){
        this.itemID = itemID;
        this.name = name;
        this.salePrice = salePrice;
        this.description = desc;
        this.weight = lb;
    }

    public int sellItem(Item i){
        return this.salePrice;
    }

    public double getItemWeight(){
        return this.weight;
    }

    public String getItemName(){
        return this.name;
    }

    public void getItemInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Desc: " + this.description);
        System.out.println("Sell: " + this.salePrice);
    }

    public String getItemDesc(){
        return this.description;
    }

    public String getItemID(){
        return this.itemID;
    }

}
