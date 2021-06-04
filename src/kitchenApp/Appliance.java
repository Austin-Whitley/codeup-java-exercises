package kitchenApp;

//abstract classes can be created by literally writing them as abstract. (in the class definition)
public abstract class Appliance {
    //since the abstract class is going to be inherited we can make this variable protected so those children can see it
    protected String type;
    protected String brandName;

    public Appliance(String type, String brandName){
        this.type = type;
        this.brandName = brandName;
    }
    //abstract methods are defined using the abstract keyword and create a blueprint for a method to be implemented in the subclass
    //they can only be created inside of an abstract class
    public abstract void setType(String type);
    public abstract void setBrandName(String brandName);

    //instance method example:
    public void sayHello(){
        System.out.println("Hello");
    }

}
