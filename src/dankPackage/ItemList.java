package dankPackage;

import java.util.ArrayList;
import java.util.List;

public class ItemList{
    //foods
    public static Item apple = new Item("Apple",100, "One of these a day will keep the Doctor away.", 0.25);
    public static Item banana = new Item("Banana",69, "Throw it in the road and see if anyone spins out", 0.15);
    public static Item coconut = new Item("Coconut",40, "How do you open these? Might as well just use it as a rock...", 1.0);

    //fish
    public static Item fish = new Item("Fish", 325, "Eww it's all slimy!", 1.0);
    public static Item rarefish = new Item("Rare Fish", 650, "Eww it's... actually it's not that bad", 2.0);
    public static Item legendaryfish = new Item("Legendary Fish", 2500, "Woah a rainbow fish", 8.0);
    public static Item exoticfish = new Item("Exotic Fish", 5000, "An ultra rare golden fish", 16.0);

    //junk
    public static Item garbage = new Item("Garbage", 15, "Eww that stinks!", 0.5);
    public static Item junk = new Item("Junk", 25, "Just some more useless junk.", 0.5);

    //items
    public static Item fishingrod = new Buyable("Fishing Rod", 2500, "You might be able to use this to catch fish!", 1.5, 25000);

}
