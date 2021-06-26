package dankPackage;

public class Buyable extends Item{
    protected int buyPrice;

    public Buyable(String name, int salePrice, String desc, double lb, int buyPrice) {
        super(name, salePrice, desc, lb);
        this.buyPrice = buyPrice;
    }
}
