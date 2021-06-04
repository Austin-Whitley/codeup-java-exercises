package birdFamily;

public class Duck extends Bird {
    //By extending the birdFamily.Bird class to birdFamily.Duck, birdFamily.Duck inherits all of the same methods, and instance variables from birdFamily.Bird.

    //override the method
    @Override
    public void makeNoise(){
        System.out.println("Quack Quack!");
    }
    //the birdFamily.Duck instance make noise method overrides the original make noise method


}
