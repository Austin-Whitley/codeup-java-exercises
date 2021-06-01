public class Person {

    private String name;

    //===== setters and getters =====
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    //================================

    public static void sayHello(Person p){
        System.out.println("Hello, " + p.getName());
    }

    public Person(String name){
        this.name = name;
    }

    public static void main(String[] args) {
//       Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName())); //true
//        System.out.println(person1 == person2); //false
//        sayHello(person1);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());

    }
}
