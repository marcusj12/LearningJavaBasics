package com.careerdevs.sayhello;

import java.util.Scanner;

public class sayhello2 {
    public static void whatIsYourFullName() {
        Scanner scanner = new Scanner(System.in); // Parameter that needs to be used

        System.out.print("What is your first name?\n First Name:");
        String firstName = scanner.nextLine();

        System.out.print("What is your last name? \n Last Name:");
        String lastName = scanner.nextLine();

        System.out.println("It is so nice to formally meet you" + firstName + ""+ lastName);

    }


    public static void whatIsYourInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("When were you born?\n DOB:");
        String dateOfBirth = scanner.nextLine();

        System.out.print("What is your height?\n Height:");
        float usersHeight = scanner.nextFloat();

        System.out.print("What is your weight?\n Weight:");
        int usersWeight = scanner.nextByte();


        System.out.println("Thank you for entering your info, based on your height" + "" + usersHeight+""+ "we cannot allow you to ride this coaster" );

    }

    public static void main(String[] args) {
        whatIsYourFullName();
        whatIsYourInfo();


    }

}
