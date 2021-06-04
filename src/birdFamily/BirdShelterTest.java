package birdFamily;

public class BirdShelterTest {

    public static void main(String[] args) {
        //Polymorphic array
        //polymorphic means many shapes
        Bird[] birds = new Bird[3];
        birds[0] = new Finch();
        birds[0].setNameOfBird("Lesser Goldfinch");
        birds[1] = new Duck();
        birds[1].setNameOfBird("Mallard");
        birds[2] = new Penguin();
        birds[2].setNameOfBird("Emperor birdFamily.Penguin");

//        for (birdFamily.Bird bird: birds){
//            bird.makeNoise();
//        }
        BirdShelter healingWings = new BirdShelter();
        healingWings.shelterSounds(birds);

        BirdLover audibenbob = new BirdLover();
        audibenbob.takesBirdToVet(birds[1]);
    }
}
