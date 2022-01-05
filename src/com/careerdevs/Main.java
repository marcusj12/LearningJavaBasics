package com.careerdevs;

public class Main {

    public static void main(String[] args) {

        String firstName = "Marcus";
        String lastName = "Jennings";
//        String fullName = firstName + " " + lastName;
//        System.out.println(fullName);

        String createdName = createFullName(firstName, lastName);
        System.out.println(createdName);

    }

    //Java Challenge # 2
    public static String createFullName(String fName, String lName) {
        return fName + " " + lName;
    }
}

