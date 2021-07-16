package com.java.learning;

public class User {
    String firstName;
    String middleName;
    String lastName;

    public User(String fName, String mName, String lName) {
        this.firstName = fName;
        this.middleName = mName;
        this.lastName = lName;
    }

    public User() {
    }

    public static void main(String[] args) {
        User person1 = new User("Rahul", "Ankush", "Bhawar");
        //User person1 = new User();
        System.out.println("Output:- " + person1.getFullName());
    }

    public String getFullName() {
        return firstName + " " + middleName + " " + lastName;
    }
}
