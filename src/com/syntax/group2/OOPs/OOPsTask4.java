package com.syntax.group2.OOPs;

public class OOPsTask4 {
}/*
    Create Registration Class in which you would have
    variables as email, userName and password that
    have an access scope only within its own class. After
    creating an object of the class user should be able to
    call methods and in each method separately pass
    values to set users email, username and password.

    Requirements:
        A. Valid email consider to be only yahoo
        B. Valid userName and password cannot be empty and
    should be of length larger than 6 characters. Also
    valid password cannot contain userName.
 */

class Registration {
    private String email;
    private String userName;
    private String password;

    Registration(String email, String userName, String password) {
        this.email = email;
        this.userName = userName;
        this.password = password;
    }

    public void getEmail() {
        if (email.contains("yahoo")) {
            System.out.println("Valid email");
        } else {
            System.out.println("Valid email must be yahoo");
        }
    }

    public void getUserName() {
        if (userName.length() > 6) {
            System.out.println("Valid username");

        } else {
            System.out.println("Username must contain at least 6 characters");
        }
    }

    public void getPw() {
        if (password.length() > 6 && !password.contains(userName)) {
            System.out.println("Valid password. Account Registered");
        } else {
            System.out.println("Password invalid");
        }
    }

    public static void main(String[] args) {
        Registration tester = new Registration("coopeeta@yahoo.com", "coopeeta", "password123");
        tester.getEmail();
        tester.getUserName();
        tester.getPw();
    }
}
