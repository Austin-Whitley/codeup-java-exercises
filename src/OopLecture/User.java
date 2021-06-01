package OopLecture;

import java.util.Scanner;

public class User {
    public int id;
    private String username;
    private String password;
    public String email;
    private boolean isLoggedIn = false;

    //========setters and getters=========//
    //Password
    public String getPassword() {
        return password;
    }
    public String setPassword(String passwordInput){
        return this.password = passwordInput;
    }
    //Logged in
    public boolean isLoggedIn() {
        return isLoggedIn;
    }
    public void setLoggedIn(boolean loggedIn) {
        isLoggedIn = loggedIn;
    }
    //Username
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    //========================================//

    //show the user their information
    public void describeUser(){
        System.out.println("Username: " + this.username);
        System.out.println("Password: " + this.password);
        System.out.println("Email: " + this.email);
    }

    public User(String username, String password, String email){
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public User(){}

    public static void main(String[] args) {
        User testUser = new User();
        testUser.id = 1;
        testUser.username = "Austin";
        testUser.password = "PassTheWord";
        testUser.email = "Austin.whitley@gmail.com";


        User user2 = new User("Blake", "mountainBiker1983", "bikerBlake@aol.com");
    }
}
