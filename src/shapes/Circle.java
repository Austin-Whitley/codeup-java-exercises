package shapes;

public class Circle {

    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    public double getArea(){
        double area = Math.PI * (Math.pow(radius, 2));
        return area;
    }
    public double getCircumference(){
        return 2 * Math.PI * radius;
    }
}
