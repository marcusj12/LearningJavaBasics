package com.careerdevs.sayhello;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //whatIsYourName();
        whatIsYourFullName();
        //whatIsYourAge();

    } // ask for first name
    public static void whatIsYourName(){
        Scanner scanner = new Scanner(System.in); // Parameter that needs to be used to take user input
        System.out.print("What is your first name? \n First Name: "); // variable created to store user input
        String firstName = scanner.nextLine();
        System.out.println("Hello, nice to meet you "+ firstName);

    }//Ask for full name
    public static void whatIsYourFullName(){
        Scanner scanner = new Scanner(System.in); // Parameter that needs to be used
        System.out.println("What is your first name?");
        String firstName = scanner.nextLine();
        System.out.println("What is your last name?");
        String lastName = scanner.nextLine();

        System.out.println("It is so nice to formally meet you" + firstName + " " + lastName);


//    }   //Asks for age(no return)
//    public static void whatIsYourAge(){
//        Scanner scanner3 = new Scanner(System.in);
//        System.out.print("What is your age?\n Age: ");
//        byte age = scanner3.nextByte();

    }
}
/*
next() vs nextLine()
 */