package com.careerdevs.sayhello;

import java.util.Scanner;

public class whatisname2 {
    public static void whatIsYourFullName() {
        Scanner scanner = new Scanner(System.in); // Parameter that needs to be used

        System.out.print("What is your first name?\n First Name:");
        String firstName = scanner.nextLine();

        System.out.print("What is your last name? \n Last Name:");
        String lastName = scanner.nextLine();

        System.out.println("It is so nice to formally meet you" + firstName + ""+ lastName);

    }

    public static void main(String[] args) {
        whatIsYourFullName();
    }

}
