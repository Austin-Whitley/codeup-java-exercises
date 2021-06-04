package birdFamily;

import birdFamily.Bird;

public class Penguin extends Bird {
    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("honk honk!");
    }

    public void move() {
        System.out.println("waddle waddle");
    }
}
