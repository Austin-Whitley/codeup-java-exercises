public class ExceptionsStudyTest {
    public static void main(String[] args) {
//        ExceptionsStudy study = new ExceptionsStudy();
//        System.out.println(study.notAnInteger);
//        System.out.println(Integer.parseInt(study.maybeAnInteger)); // we can parse out string number to be an integer
//        System.out.println(Integer.parseInt(study.notAnInteger)); //Throws "number format exception" ... but i have no red line
        //The exception gets thrown because the string does not have a parsable integer

//        try{
//            System.out.println(study.notAnInteger);
//            System.out.println(Integer.parseInt(study.maybeAnInteger));
//            System.out.println(Integer.parseInt(study.notAnInteger));
//        }catch (NumberFormatException e){ //can also call for "Exception" which is the parent to all exceptions - to catch anything.
//            System.out.println("Uh...Nope, not an integer");
//            //we can pass the actual exception that is being called
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        }

        ExceptionsStudy study = new ExceptionsStudy();
        study.askForMoreComplexInteger();



    }
}
