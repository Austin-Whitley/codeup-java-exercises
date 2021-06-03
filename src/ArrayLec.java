import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayLec {
    public static void main(String[] args) {
        //any information that goes into an array in java has to be of the SAME dataType
        int[] numbers = {18, 21, 34, 11, 42, 55};
        System.out.println(numbers);
        //when we call the array like this we dont get back any information, we just get back the memory location for the array
        //to print out the items in an array we use a loop to iterate through each point
        for(int number : numbers) {
            System.out.println(number);
        }
        //in order to get the lowest or highest values of an array we can use the stream() Method like so:
        //Arrays.stream(arrayName).max() or Arrays.stream(arrayName).min()
        System.out.println(Arrays.stream(numbers).min());
        System.out.println(Arrays.stream(numbers).max());

        //what if we want to change our array? Can we redefine the values of our array?
        numbers[1] = 22;
        //we can! Just access that index point on the array that you want to change [x]
        //Can we add things to an array??
        //No... but sometimes.. we'll come back to that
        String[] topFiveBoyBands = new String[6];
        topFiveBoyBands[0] = "N-sync";
        topFiveBoyBands[1] = "Backstreet boys";
        topFiveBoyBands[2] = "OneDirection";
        topFiveBoyBands[3] = "BTS";
        topFiveBoyBands[4] = "Stray Kids";

        //We are printing off 6 points on our array, but only have 5 values... what will the 6th value be?
        for(String band: topFiveBoyBands){
            System.out.println(band);
        }
        //The sixth value is: null
        //The default value for objects in java is null

        //the default value for booleans is "false" so what if we do this?
        boolean[] lookingForDefaults = new boolean[3];

        for(boolean bool: lookingForDefaults){
            System.out.println(bool);
        }
        //we get 3 false values

        Arrays.fill(lookingForDefaults, true);
        //what the fill method does is replace all items in that array with the value we pass into Arrays.fill
        //even if we have explicitly stated otherwise earlier.

        for(boolean bool: lookingForDefaults){
            System.out.println(bool);
        }
        //we can use the fill method to make sure we dont have an array of null values then come back later and reset
        //those index points to useful information.

        //lets compare some arrays!
        int[] nums = {12, 13, 14, 15};
        int[] alsoNums = {12, 13, 14, 15};
        System.out.println(nums == alsoNums); //false
        //we get back false when we compare these arrays.... but they are the exact same
        //This is because this is checking to see if they have the same memory location.. they do not

        //to check the literal values of each array against another is to use the Arrays.equals(array1, array2); Method
        System.out.println(Arrays.equals(nums, alsoNums)); //true

        //Lets copy arrays
        int[] yetMoreNums = Arrays.copyOf(nums, 5);
        for(int num: yetMoreNums){
            System.out.println(num);
        }
        //we copied but also made a new array since this one has an extra value

        int[] unsortedNightmare = {99, 13, 1, 55, 42, 89, 21, 7};
        Arrays.sort(unsortedNightmare);
        //will the sort method return a copy of the original array or actually reset the order of this array?
        System.out.println(Arrays.toString(unsortedNightmare));
        //it actually resets the order of the original array

        //Two dimensional arrays!!!
        //They are set up like objects in JavaScript
        char[][] letters = {
                {'A', 'B', 'C'},
                {'D', 'E', 'F'},
                {'G', 'H', 'I'},
                {'J', 'K', 'L'}
        };
        //Letters[] is an array that contains 4 arrays
        for(char[] row: letters){
            System.out.println("+---+---+---+");
            //lets call each of those arrays inside Letters[] a "row"
            System.out.print("| ");

            //now in order to get the information from those rows lets call the index points inside "row" "n"
            for (char n : row){
                System.out.print(n + " | ");
            }
            System.out.println();
        }
        System.out.println("+---+---+---+");

    }
}
