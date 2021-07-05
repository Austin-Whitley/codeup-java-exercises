package dankPackage;

import java.util.ArrayList;
import java.util.List;

public class ItemList{

    //foods
    public static Item apple = new Item("apple", "Apple",100, "One of these a day will keep the Doctor away.", 0.25);
    public static Item banana = new Item("banana","Banana",69, "Throw it in the road and see if anyone spins out", 0.15);
    public static Item coconut = new Item("coconut","Coconut",40, "How do you open these? Might as well just use it as a rock...", 1.0);

    //fish
    public static Item fish = new Item("fish", "Fish", 500, "Eww it's all slimy!", 1.0);
    public static Item rarefish = new Item("rarefish","Rare Fish", 1000, "Eww it's... actually it's not that bad", 2.0);
    public static Item legendaryfish = new Item("legendaryfish", "Legendary Fish", 2500, "Woah a rainbow fish", 8.0);
    public static Item exoticfish = new Item("exoticfish", "Exotic Fish", 5000, "An ultra rare golden fish", 16.0);

    //animals
    public static Item skunk = new Item("skunk", "Skunk", 1001, "Whatever you do, don't lift it's tail", 5.0);
    public static Item rabbit = new Item("rabbit", "Rabbit", 1265, "A cute little bunny rabbit", 1.2);
    public static Item boar = new Item("boar", "Boar", 2500, "A wild boar from the.... wild", 12.3);
    public static Item deer = new Item("deer", "Deer", 3350, "Rudolf the red nosed.. oh, oh wait this is just a regular deer.", 56.2);
    public static Item ox = new Item("ox", "Ox", 10000, "An oxen, this could be useful for carrying luggage if I implemented a weight system into the game.", 176.0);
    //for epic tier animals, there needs  to be a message that the user types in to catch them.
    //make an array of messages in the user class that will be randomized when the epic drop table has been rolled
    public static Item bear = new Item("bear", "Bear", 15000, "Watch out for goldie-locks, she might try and steal your food.", 478.0);
    public static Item lion = new Item("lion", "Lion", 18000, "The king of the wild", 247.4);
    public static Item dragon = new Item("dragon", "Dragon", 25000, "A mythical creature known for destroying entire cities, but somehow you managed to kill one...", 1378.1);

    //junk
    public static Item garbage = new Item("garbage", "Garbage", 15, "Eww that stinks!", 0.5);
    public static Item junk = new Item("junk", "Junk", 25, "Just some more useless junk.", 0.5);
    public static Item oldboot = new Item("boot", "Old Boot", 1, "Dad?...", 0.3);

    //items
    public static Buyable fishingrod = new Buyable("fishingrod", "Fishing Rod", 2500, "You might be able to use this to catch fish!", 1.5, 25000);
    public static Buyable rifle = new Buyable("rifle", "Hunting Rifle", 3000, "A rifle that can be used to hunt wild animals", 4.6, 30000);

    //Every item in the game needs to be inside this list in order to retrieve its information. (get info {item_name})
    Item[] itemsList = {apple, banana, coconut, fish, rarefish, legendaryfish, exoticfish, skunk, rabbit, boar, deer, ox, bear, lion, dragon, garbage, junk, oldboot, fishingrod, rifle};
    Buyable[] shop = {fishingrod, rifle};
}
