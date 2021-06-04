package birdFamily;

import birdFamily.Bird;

public class Finch extends Bird {
    @Override

    public void makeNoise() {
        super.makeNoise();
        System.out.println("Tweet Tweet!");
    }

    public Finch(){
        System.out.println("A finch just got created!");
    }

}
