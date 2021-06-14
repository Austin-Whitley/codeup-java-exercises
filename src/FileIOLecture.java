import java.io.IOException;
import java.nio.file.*; //grab everything inside of java new Input Output files
import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FileIOLecture {

    public void readFileAndOutput(Path pathToFile){
        //lets grab the information we stored on our file...
        //first we must create a place to store that information:
        List<String> currentList = new ArrayList<>();

        //again... we must wrap everything in a try catch statement
        try {
            currentList = Files.readAllLines(pathToFile);
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
        //we can use the readAllLines() method to get every line of information from the txt file
        //Now we will use a for loop(enhanced) to print out our array list to the console
        for(String line: currentList){
            System.out.println(line);
        }

    }

    public static void main(String[] args) {

//        Path path = Paths.get("src");
//        System.out.println(path); // ^^ does not output this string
        //outputs a reference to the file path
//        System.out.println(path.toAbsolutePath()); //we can see that by calling for "Absolute path"
        //this is far more than just a string...

        //Now lets access some files
        Path path = Paths.get("src", "FileIOLecture");
        System.out.println(path);
        System.out.println(path.toAbsolutePath());
        //paths.get requires strings, you cannot pass path objects unless you convert them to strings


        Path toOurDataStorage = Paths.get("src/data");
        System.out.println(toOurDataStorage);
        //Lets now use another class and implement its static methods
//        Files.createDirectories(toOurDataStorage); //this throws IO exceptions that MUST BE CAUGHT
        try{
            if(Files.notExists(toOurDataStorage)){
                Files.createDirectories(toOurDataStorage);
            }else{
                System.out.println("The " + toOurDataStorage + " directory already exists");
            }
        }catch(IOException ioe){
            ioe.printStackTrace();
        }

        Path toOurDataFile = Paths.get(String.valueOf(toOurDataStorage), "data.txt");
        //files/ create a new file / in this place
        //Files.  createFile      (toOurDataFile)
        try {
            if(Files.notExists(toOurDataFile)){
                Files.createFile(toOurDataFile);
            }else{
                System.out.println("That file already exists.");
            }
        }catch(IOException ioe){
            ioe.printStackTrace();
        }

        //We know how to make files..
        //lets learn how to send and store information in them now

        List<String> names = Arrays.asList("Austin", "Blake", "Whitley", "Lowell", "Alex", "Susan", "Hanna");
        try{
            //2 arguments for File.write
            // the path to the file, the data we want to write
            Files.write(toOurDataFile, names);

        }catch(IOException ioe){
            ioe.printStackTrace();
        }

//        //lets grab the information we stored on our file...
//        //first we must create a place to store that information:
//        List<String> currentList = new ArrayList<>();
//
//        //again... we must wrap everything in a try catch statement
//        try {
//            currentList = Files.readAllLines(toOurDataFile);
//        }catch(IOException ioe){
//            ioe.printStackTrace();
//        }
//        //we can use the readAllLines() method to get every line of information from the txt file
//        //Now we will use a for loop(enhanced) to print out our array list to the console
//        for(String line: currentList){
//            System.out.println(line);
//        }
        // ^^^ We turned this into a method so we dont have to repeat ourselves ^^^

        FileIOLecture read = new FileIOLecture();
//        read.readFileAndOutput(toOurDataFile);

        //Lets append one item to our list!
        try{
            Files.writeString(toOurDataFile, "Julie\n", StandardOpenOption.APPEND);
            //standardOpenOption.APPEND is very important. We would re-write the whole file to only contain what we passed in if we dont .APPEND
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
//        read.readFileAndOutput(toOurDataFile);

        //we can append more than just a single string to a file
        List<String> lateGreatArtists = new ArrayList<>();
        lateGreatArtists.add("Whitley");
        lateGreatArtists.add("whiTLEY");
        lateGreatArtists.add("Van gogh");
        lateGreatArtists.add("Picasso");
        lateGreatArtists.add("Leonard DaVinci");

        try{
            Files.write(toOurDataFile, lateGreatArtists, StandardOpenOption.APPEND);
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
        read.readFileAndOutput(toOurDataFile);


        List<String> currentList = new ArrayList<>();
        try{
            currentList = Files.readAllLines(toOurDataFile);
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
        //        while(listIterator.hasNext()){
//            String name = listIterator.next(); //increases the iterator
//            if(name.equalsIgnoreCase("whitley")){
//                listIterator.remove();
//            }
//        }
        //we can also write this ^^^ -> This way:
        //increases the iterator
        currentList.removeIf(name -> name.equalsIgnoreCase("whitley"));
        //This will remove EVERY instance of the word "Whitley" from our list

        //Now that we have an updated List we need to write that new array inorder to update our file
        try {
            Files.write(toOurDataFile, currentList);
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
        read.readFileAndOutput(toOurDataFile);

    }
}
