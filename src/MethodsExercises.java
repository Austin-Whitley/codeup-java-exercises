import java.util.Arrays;

public class MethodsExercises {
    public static int Addition(int num1, int num2){
        return num1 + num2;
    }
    public static int Subtraction(int num1, int num2){
        return num1 - num2;
    }
    public static int Multiplication(int num1, int num2){
        int result = 0;
        for(int i = 0; i < num2; i++){
            result = result + num1;
        }
        return result;
    }
    public static double Division(double num1, double num2){
        return num1 / num2;
    }
    public static double Modulus(double num1, double num2){
        return num1 % num2;
    }

    public static void main(String[] args) {
        System.out.println( "Addition: " + Addition(5, 5));
        System.out.println("Subtraction: " + Subtraction(10,5));
        System.out.println("Multiplication: " + Multiplication(5,10));
        System.out.println("Division: " + Division(25,5));
        System.out.println("Modulus: " + Modulus(24,5));
    }
}
