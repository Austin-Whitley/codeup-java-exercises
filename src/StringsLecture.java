import java.util.Locale;
import java.util.Scanner;

public class StringsLecture {
    public static void main(String[] args) {
        char character  = 'd';
        System.out.println(character == 'd');

        Scanner scanner = new Scanner(System.in);

        String bob = "bob";
        System.out.println("Whats your favorite name?");
        String userWord = scanner.nextLine();
        System.out.println(bob == userWord); // always false

        //we cant use == to compare strings with this operator
        //we have to use .equals() to compare strings in Java

        System.out.println(bob.equals(userWord));

        //to test the input without case sensitivity by using:
        // .equalsIgnoreCase()

        System.out.println(bob.equalsIgnoreCase(userWord));

        //compare the start and end of strings
        String david = "David";
        String dad = "Dad";

        String firstLetterDavid = "" + david.charAt(0);
        //this ^ stores the first character of the string david in a new variable: "firstLetterDavid"

        System.out.println("David and Dad start with the same letter? " + dad.startsWith(firstLetterDavid));


        //---------------evaluating parts of a string --------------//
        String coolCats = "Hey all you cool cats ans kittens";
        System.out.println(coolCats.startsWith("Hey all")); //true

        System.out.println(coolCats.toLowerCase(Locale.ROOT).startsWith("hey all")); //true

        System.out.println(coolCats.endsWith("kittens")); //true

        //------------------Manipulation---------------//
        int locationOfAInDad = dad.indexOf('a');
        System.out.println("The location of 'a' in the string \"Dad\" is: " + (locationOfAInDad)); //returns 1 (index starts at 0)

        //INDEX_OF
        String sentence = "Sometimes i like to sit on a bench at the park";
        int locationOfWordInSentence = sentence.indexOf("like");
        System.out.println(sentence);
        System.out.println("The location of 'like' in the string is: " + (locationOfWordInSentence)); //returns 12

        //SUBSTRING
        String pullOutAWord = sentence.substring(12, 16); //pulls and stores the word "like" from: sentence
        System.out.println(pullOutAWord);

        //REPLACE
        //does not change the value, just sends a copy
        System.out.println(sentence.replace(pullOutAWord, "hate"));
        System.out.println(sentence);//to show it doesnt replace

        //recreating the string and replacing it with hate can be done:
        sentence = sentence.replace(pullOutAWord, "hate");
        System.out.println(sentence); //to show it does get replaced

        //TRIM
        //removes the whitespace at the beginning and end of a string(not the)
        String hasWhiteSpace = "       Dang that's some white space      ";
        System.out.println(hasWhiteSpace);
        System.out.println(hasWhiteSpace.trim()); //TRIM sends a copy, does not effect the actual string

    }
}
