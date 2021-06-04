package kitchenApp;

public class MiniFridge extends Refridgerator implements StoreFood{
    public MiniFridge(String type, String brandName, boolean hasShelves){
        super(type, brandName, hasShelves);
    }

    public void keepFresh() {
        System.out.println("It's a fridge but smol.");
    }
}
