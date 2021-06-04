package birdFamily;

//bird is the super class
public class Bird {

    //Can a bird fly?
    private boolean canFly;
    //getter and setter
    public boolean getCanFly() {
        return canFly;
    }
    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    //what kind of bird is it?
    private String nameOfBird;
    //getter and setter
    public String getNameOfBird() {
        return nameOfBird;
    }
    public void setNameOfBird(String nameOfBird) {
        this.nameOfBird = nameOfBird;
    }

    public void makeNoise(){
        System.out.print(this.getNameOfBird() + " goes ");
    }

    public void move(){
        System.out.println("Flap flap");
    }

    //This is a default constructor, it creates new objects. It has no return type because it returns itself
    public Bird(){
        this.canFly = true;
        this.nameOfBird = "Parrot";
    }

    public Bird(String nameOfThisBird, boolean itCanFly){
        this.nameOfBird = nameOfThisBird;
        this.canFly = itCanFly;
    }



}
