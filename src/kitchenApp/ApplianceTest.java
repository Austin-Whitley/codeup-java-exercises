package kitchenApp;

//an abstract class is mainly used for a super class. It is the Root class or highest level of the hirearchy
//Abstract classes can server as a super class, but they cannot be directly instantiated.

public class ApplianceTest {

    public static void main(String[] args) {
        //when we try and create a new instance of the abstract class
//        Appliance toaster = new Appliance();

        Refridgerator app1 = new Refridgerator("Two door", "LG", true);

        System.out.println(app1.brandName);
        System.out.println(app1.type);
        System.out.println(app1.isHasShelves());
        app1.keepFresh();

        MiniFridge smolBoy = new MiniFridge("Single-door", "MiniMax", false);
        smolBoy.keepFresh();
    }
}
