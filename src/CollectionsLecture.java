import shapes.Square;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class CollectionsLecture {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        ArrayList<Integer> collectionOfNums = new ArrayList<>();
        collectionOfNums.add(16);
        collectionOfNums.add(44);
        collectionOfNums.add(39);
        collectionOfNums.add(43);
        collectionOfNums.add(1,24); //add method will take in 2 arguments, index point you want to place and then the object you want to place
        collectionOfNums.set(2, 43); //set method will replace an item with another. first give the index of where you want to replace, then the item

        for(int i = 0; i < collectionOfNums.size(); i++){
            System.out.println(collectionOfNums.get(i));
        }

        for (Integer collectionOfNum : collectionOfNums) {
            System.out.println(collectionOfNum);
        }

        System.out.println(collectionOfNums.contains(43)); //see if an element has been passed into your array (we get back a boolean value)
        System.out.println(collectionOfNums.indexOf(43)); //see what index an element is at.
        System.out.println(collectionOfNums.lastIndexOf(43)); //returns an index number

        ArrayList<String> studentNames = new ArrayList<>(); //we can test if an arrayList is empty!
        if(studentNames.isEmpty()){
            System.out.println("Lets fill in the list of student names");
        }

        System.out.println(collectionOfNums);
        collectionOfNums.remove((Integer) 43); //removes the first instance of that item if there are multiple
        //we have to cast the number 44 to an integer because its trying to remove index 43 by default
        System.out.println(collectionOfNums);

        ArrayList<Double> collectionOfDoubles = new ArrayList<>();
        collectionOfDoubles.add(3.14);
        collectionOfDoubles.add(7.777);
        collectionOfDoubles.add(56.0);
        collectionOfDoubles.add((double) 2);

        System.out.println(collectionOfDoubles);
        collectionOfDoubles.remove(2.0); // will remove the element with the value 2.0
        System.out.println(collectionOfDoubles);

        ArrayList stuff = new ArrayList();
        stuff.add("Blake");
        stuff.add(42);
        stuff.add('c');
        //we have a bunch of stuff in this arrayList and nothing has the same dataType.. how are we going to search through it?
        //why dont we just cast EVERYTHING to an object...
        //Since our collection of objects has a bunch of different data types we cant access any object methods that would be associated with any of these objects.
        //so now we cant really do anything with these items... but at least they are together <3 (sarcasm)
        for(Object thing : stuff){
            System.out.println(thing);
        }
        //since we didnt setup this arrayList with a data type we strip the ability to access these methods from it....unless we cast every item back to its original datatype

        //===============HASH MAP================//

        //HashMap<key, value> -> hash maps require 2 arguments
        HashMap<Character, Square> squares = new HashMap<>();
        //the ">" defines the type if objects contained in the collection.

        //assign the key of 'A' to a square object that has a side length of 5 units
        squares.put('A', new Square(5));
        System.out.println(squares.get('A').getArea());
        //we can get information from a hash map by using the getOrDefault method
        System.out.println(squares.getOrDefault('B', new Square(0)).getArea()); //we get back 0.0 since the key we are searching for has not been defined.
        //this says: either get the information from the object with the key of 'B' or return an object with the value of 0
        //lets try it again...
        squares.put('B', new Square(10));
        System.out.println(squares.getOrDefault('B', new Square(0)).getArea());//we get back 100 because the key of 'B' HAS been defined.

        System.out.println(squares.containsKey('B')); // the .containsKey method returns a boolean value. (true)
        System.out.println(squares.containsValue(new Square(5))); //tries to search for a new object but returns false because its looking for a new object even if that value is in our map
        //if we do something like this:
        Square sq = new Square(3);
        squares.put('C', sq);

        System.out.println(squares.containsValue(sq));//will return true because we arent calling for a new object
        System.out.println(sq); //returns memory address reference
        System.out.println(squares.get('C')); //returns the memory address reference

//        squares.remove('C'); //we can pass just the key value.. which is dangerous
//        System.out.println(squares.get('C'));
        //instead we should pass both key and value
        squares.remove('D', sq);
        System.out.println(squares.containsValue(sq)); //will return true
        //we have a secondary check, we dont actually remove sq because its not at that key, or we dont remove that key because the value expected is not the same as the value stored at that key. So nothing happens
        squares.put('D', new Square(4));
        System.out.println(sq.getArea()); //get the area of key 'C'
        System.out.println(squares.get('D').getArea()); //get the area of key 'D'
        squares.replace('E', new Square(15)); //lets try and replace an empty slot with a new square.
//        System.out.println(squares.get('E').getArea()); //null pointer exception
        //we can't replace an empty slot with an object we MUST add new objects or replace existing ones

        squares.clear(); //we can clear the entire HashMap with the .clear method
        System.out.println(squares.size());
        System.out.println(squares.isEmpty());



    }
}
