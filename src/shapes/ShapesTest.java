package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Rectangle box1 = new Rectangle(5,4);
        System.out.println(box1.getArea()); //20
        System.out.println(box1.getPerimeter()); //18

        Rectangle box2 = new Square(5);
        System.out.println(box2.getArea()); //25
        System.out.println(box2.getPerimeter()); //20
    }
}
