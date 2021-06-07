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
    public HashMap<String, String> getAttendance(String key) {
        return attendance;
    }
    public void setAttendance(String date, String value) {
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
        Student naysa = new Student("Naysa");
        System.out.println(naysa.getName());
        naysa.addGrades(90);
        System.out.println(naysa.getGrades());
        naysa.addGrades(90);
        System.out.println(naysa.getGrades());
        System.out.println(naysa.getAverage());
    }

}
