package birdFamily;

public class BirdShelter {
    public void shelterSounds(Bird[] birdsOfTheShelter){
        for(Bird bird: birdsOfTheShelter){
            bird.makeNoise();
        }
    }
}
