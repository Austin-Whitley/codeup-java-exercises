package shapes;

public class Square extends Rectangle{

    //this is "the side variable"
    private double side;

    //pass the variable of "side" to the parent class constructor.
    public Square(double side){
        super(side, side);
        //set "the side variable" equal to whats being passed into the Constructor
        this.side = side;
    }
    //by calling super() we can access the original public Rectangle constructor/method we created
    //However this method requires two arguments: length and width so we have to set those values equal to something or the code wont run.
    //we can do this by calling "side" twice to fill the values for Length & width.

    @Override
    public double getPerimeter() {
        System.out.println("This is overridden");
        return 4 * side;
    }

    @Override
    public double getArea() {
        System.out.println("This is overridden");
        return side * side;
    }
}
