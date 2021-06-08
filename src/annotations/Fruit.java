package annotations;

public class Fruit implements Food{

    @Deprecated
    private boolean hasFlesh; //Deprecate only strikes through the next item
    private boolean edibleSeeds; //this variable is not Deprecated
    private String flavor;

    @Deprecated
    public void tasteBitter(){
        System.out.println("Look at them run away!");
    }

    @Override
    public String taste(){
        return this.flavor;
    }

    public static void main(String[] args) {
        Fruit banana = new Fruit();
        banana.tasteBitter();
        banana.flavor = "Sweet";
        System.out.println(banana.taste());
    }
}
