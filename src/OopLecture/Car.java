package OopLecture;

public class Car {

    public String model;
    public int year;
    public String color;
    public void run(){
        System.out.println("They car is running.");
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1);

        car1.color = "Black";
        car1.model = "Pontiac";
        car1.year = 2009;

        System.out.println(car1.color);

        Car car2 = new Car();
        car2.color = "Silver";
        car2.model = "Ford";
        car2.year = 2019;

        System.out.println(car2.color);
    }

}
