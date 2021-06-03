import java.util.Random;

public class ServerNameGenerator {
    private static String[] adjectives = {"Charming", "Cruel", "Fantastic", "Gentle", "Huge", "Perfect", "Rough", "Sharp"};
    private static String[] nouns = {"area", "book", "business", "case", "child", "company", "country", "day", "eye", "fact"};

    public static String generator(String[] array){
        Random rand = new Random();
        int position  = rand.nextInt(array.length);

        return array[position];
    }
    public static String makeServerName(String[] arrayOne, String[] arrayTwo){
        String adj = generator(arrayOne);
        String noun = generator(arrayTwo);

        return adj + ", " + noun;
    }

    public static void main(String[] args) {
        System.out.print("Your server name is: ");
        System.out.print(makeServerName(adjectives, nouns) + "\n");
    }
}
