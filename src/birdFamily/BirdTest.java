package birdFamily;

public class BirdTest {
    public static void main(String[] args) {
        //bird object created on the memory "Heap", "cardinal" is a reference to that location in memory
        Bird cardinal = new Bird();

        cardinal.setNameOfBird("Cardinal");
        cardinal.setCanFly(true);
        cardinal.makeNoise();
        cardinal.move();

        //Reference to object          Variable          assignment       call tot he default constructor
              Duck mallard               =                      new Duck();

        mallard.setNameOfBird("Mallard");
        mallard.makeNoise();

//        birdFamily.Finch lesserGoldFinch = new birdFamily.Finch();
//        lesserGoldFinch.setNameOfBird("Lesser Goldfinch");
//        lesserGoldFinch.makeNoise();

        Penguin penguin = new Penguin();
        penguin.setNameOfBird("Emperor birdFamily.Penguin");
        penguin.setCanFly(false);
        penguin.makeNoise();
        penguin.move();

        //====================Polymorphism==============
        //allows us to have different reference and object types
        Bird myPenguin = new Penguin();
        //We made a reference to the bird object but made it an instance of the birdFamily.Penguin Object

        Finch houseFinch = new Finch();
    }
}
