package shapes;

public abstract class Quadrilateral extends Shape implements Measurable{

    protected double length;
    protected double width;

    public Quadrilateral(double length, double width){
        this.length = length;
        this.width = width;
    }

    //we can write abstract methods like this....
    public abstract void setLength(double length);
    //or we can leave off "public", since abstract classes are always public
    abstract void setWidth(double width);

    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }
}
