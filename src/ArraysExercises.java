import java.util.Arrays;

public class ArraysExercises {

    //passing in the object
    public static Person[] addPerson(Person[] people, Person personToAdd){
        Person[] arrayPlusOne = Arrays.copyOf(people, people.length + 1);
        arrayPlusOne[people.length] = personToAdd;
        return arrayPlusOne;
    }

    //passing in the name and creating the object
    public static Person[] addPerson(Person[] people, String name){
        Person[] arrayPlusOne = Arrays.copyOf(people, people.length + 1);
        arrayPlusOne[people.length] = new Person(name);
        return arrayPlusOne;
    }

    public static void main(String[] args) {

//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
        //Arrays.toString is necessary because printing the array just sends the memory location of the array.

        //create an array of people
        Person[] people = {new Person("Jim"), new Person("Sam"), new Person("Jack") };

        //print the people array
        for(Person ppl: people){
            System.out.println(ppl.getName());
        }

        //create a new array with one extra person in it
        Person[] newArray = addPerson(people, "Jackson");
        //print the people array with one extra person in it
        for(Person ppl: newArray){
            System.out.println(ppl.getName());
        }

        //method overload, create a new array with a new object
        Person[] anotherArray = addPerson(people, new Person("John"));
        for(Person ppl: anotherArray){
            System.out.println(ppl.getName());
        }



    }
}
