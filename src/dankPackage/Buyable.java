package dankPackage;

public class Buyable extends Item{
    protected int buyPrice;

    public Buyable(String itemID, String name, int salePrice, String desc, double lb, int buyPrice) {
        super(itemID, name, salePrice, desc, lb);
        this.buyPrice = buyPrice;
    }

    public int getBuyPrice() {
        return buyPrice;
    }
}
