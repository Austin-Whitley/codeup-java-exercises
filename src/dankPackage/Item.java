package dankPackage;

public class Item {

    private String name;
    private int salePrice;
    private String description;
    private double weight;

    public Item(String name, int salePrice, String desc, double lb){
        this.name = name;
        this.salePrice = salePrice;
        this.description = desc;
        this.weight = lb;
    }

    public int sellItem(Item i){
        return this.salePrice;
    }

    public double weightItem(Item i){
        return this.weight;
    }

    public String getItemName(){
        return this.name;
    }

}
