package kitchenApp;

public class IceChest implements StoreFood{

    private boolean hasIce;

    @Override
    public void keepFresh() {
        //if the user wants to add something to the ice chest, does the item need ice?
        //if the item needs ice, we can set hasIce to true, then add more items.
        //if not, we can set hasIce to false and continue to add items.
    }
}
