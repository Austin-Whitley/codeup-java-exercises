package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input getInfo = new Input();
        Circle c = new Circle(getInfo.getDouble());

        System.out.println(c.getArea());
        System.out.println(c.getCircumference());
    }

}
