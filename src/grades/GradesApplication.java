package grades;

import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class GradesApplication {

    public static void main(String[] args) throws InterruptedException {

        HashMap<String, Student> students = new HashMap<>();

        Student Moses = new Student("Moses Oldguy");
        Moses.addGrades(90.5);
        Moses.addGrades(89.7);
        Moses.addGrades(92.6);
        Moses.addAttendance("2021-06-05", "P");
        Moses.addAttendance("2021-06-06", "P");
        Moses.addAttendance("2021-06-07", "P");
        students.put("sea-parter-64", Moses);

        Student Bo = new Student("Bo Burnham");
        Bo.addGrades(99.3);
        Bo.addGrades(94.2);
        Bo.addGrades(97.5);
        Bo.addAttendance("2021-06-05", "P");
        Bo.addAttendance("2021-06-06", "P");
        Bo.addAttendance("2021-06-07", "P");
        students.put("BO-lingers", Bo);

        Student Crystal = new Student("Crystal Waters");
        Crystal.addGrades(99.9);
        Crystal.addGrades(99.8);
        Crystal.addGrades(100.0);
        Crystal.addAttendance("2021-06-05", "P");
        Crystal.addAttendance("2021-06-06", "A");
        Crystal.addAttendance("2021-06-07", "P");
        students.put("Crystal-W", Crystal);

        Student hackerMan = new Student("Hacker Mason");
        hackerMan.addGrades(101.0);
        hackerMan.addGrades(101.0);
        hackerMan.addGrades(101.0);
        hackerMan.addAttendance("2021-06-05", "A");
        hackerMan.addAttendance("2021-06-06", "A");
        hackerMan.addAttendance("2021-06-07", "A");
        students.put("Hacker-dude", hackerMan);

        Scanner scanner = new Scanner(System.in);
        String userChoice = "";
        int userNum = 0;

        while(!userChoice.equals("end")) {
            System.out.println("||\\_____________________/|_Student_Menu_|\\____________________/||");
            System.out.println("|| Which user would you like to look at?                       ||\n||");
            System.out.print("||");
            for (Object name : students.keySet()) {
                System.out.print("\"" + name + "\" ||");
            }
            System.out.print("\n||(\"end\" to exit) User: ");
            userChoice = scanner.next();
            System.out.println("||==========================================================||");
            if (students.containsKey(userChoice)){
                while(userNum != -1) {
                    System.out.println("|| What information would you like to access?");
                    System.out.println("|| 1. Name\n|| 2. Grades\n|| 3. Average grade\n|| 4. Attendance\n|| 5. print csv report\n|| -1. EXIT");
                    System.out.print("|| Selection: #");
                    userNum = scanner.nextInt();
                    System.out.println("||*******************************************************");
                    if (userNum == -1) {
                        System.out.println("|| Going back to Menu...");
                    } else if (userNum == 1) {
                        System.out.println("|| The name associated with: " + userChoice + " is: " + students.get(userChoice).getName());
                    } else if (userNum == 2) {
                        System.out.println("|| The grades associated with: " + userChoice + " are: " + students.get(userChoice).getGrades());
                    } else if (userNum == 3) {
                        System.out.printf("|| The average grade for user: %s is: %.2f%n", userChoice, students.get(userChoice).getAverage());
                    }else if(userNum == 4){
                        System.out.println("|| Here's the attendance for: " + userChoice + " : " + students.get(userChoice).getAttendance());
                    }
                    else if(userNum == 5){
                        System.out.println("|| Username    |    Name    |    Average");
                        System.out.printf("|| %s, %s, %.2f%n", userChoice, students.get(userChoice).getName(), students.get(userChoice).getAverage());
                    }
                    else {
                        System.out.println("|| Uncaught exception");
                    }
                    System.out.println("||*******************************************************");
                }
                userNum = 0; //reset number to 0, if it stays -1 you wont be able to look at any other users
            }else if(userChoice.equalsIgnoreCase("end")){
                System.out.println("|| Goodbye...");
            }
            else {
                System.out.println("|| That user is not stored in our list...");
                TimeUnit.SECONDS.sleep(1);
            }
        }
    }
}
