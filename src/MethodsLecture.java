import java.sql.SQLOutput;
import java.util.Scanner;

public class MethodsLecture {
    public static String sayHello(String name) {
        System.out.printf("Hi my name is %s! I hope you have a beautiful day!%n", name);
        return name;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }
    public static void willYouTakeUsToMtSplashmore(Scanner sc){
        System.out.println("Will you take us to Mt. Splashmore");
        if(!sc.nextLine().equalsIgnoreCase("yes")){
            willYouTakeUsToMtSplashmore(sc);
        }else{
            System.out.println("Thanks dad you're the best!");
        }
    }

    public static void bottlesOfBlank(String beverage, int numBottles){
        if(numBottles == 0){
            System.out.printf("No more bottles of %s on the wall%n no more bottles of %s%n Stand up now, stumble around " +
                    "%nAll of the bottle of %s on the wall%n", beverage, beverage, beverage);
        }else if( numBottles == 1){
            System.out.printf("one more bottle of %s on the wall. %nOne more bottle of %s! Take it down, pass it " +
                    "around%nNo more bottles of %s on the wall.%n", beverage, beverage, beverage);
                bottlesOfBlank(beverage, numBottles - 1);
        }else if(numBottles == 2){
            System.out.printf("Two more bottles of %s on the wall %nTwo more bottles of %s%n Take one down, pass it " +
                    "around%n One more bottle of %s on the wall!%n", beverage, beverage, beverage);
            bottlesOfBlank(beverage, numBottles - 1);
        }else{
            System.out.printf("%d bottles of %s on the wall%n%d bottles of %s%nTake one down pass it " +
                    "around %n%d bottles of %s on the wall%n", numBottles, beverage, numBottles, beverage, numBottles -1, beverage);
            bottlesOfBlank(beverage, numBottles-1);
        }

    }

    public static void main(String[] args) {
        sayHello("Austin");
        System.out.println(multiply(5,2));
        int product = multiply(7,3);
        System.out.printf("did you know %d x %d ='s %d%n", product, product, product * product);

        willYouTakeUsToMtSplashmore(new Scanner(System.in));
        bottlesOfBlank("Coke", 10);
    }
}
