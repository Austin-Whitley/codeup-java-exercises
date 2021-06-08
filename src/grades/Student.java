package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {

    private ArrayList<Double> grades;
    private String name;
    private HashMap<String, String> attendance;

    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
        this.attendance = new HashMap<>();
    }

    //getter and setter for students name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    //getter and adder for the ArrayList
    public ArrayList<Double> getGrades() {
        return grades;
    }
    public void addGrades(double grade) {
        grades.add(grade);
    }
    //getter and adder for attendance
    public HashMap<String, String> getAttendance() {
        return attendance;
    }
    public void addAttendance(String date, String value) {
        attendance.put(date, value);
    }

    public double getAverage(){
        double average = 0;
        for (Double grade : grades) {
            average += grade;
        }
        average = average / grades.size();
        return average;
    }

    public static void main(String[] args) {
        Student john = new Student("Johnny-Boy");
        System.out.println(john.getName());
        john.addGrades(100);
        System.out.println(john.getGrades());
        john.addGrades(95);
        System.out.println(john.getGrades());
        System.out.println(john.getAverage());
    }

}
