package com.careerdevs.asktheuser;

import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Declare and assign the scanner variable

        System.out.print("What is your name?\n First Name:");
        String userFirstName1 = scan.nextLine(); // data type; then variable name
        System.out.println("Thank you for your response "+" "+ userFirstName1);

        System.out.print("What is your age?\n Age:");
        byte userAge1 = scan.nextByte();

        System.out.print("Do you own a home?");
        boolean userHome1 = scan.nextBoolean();

        System.out.print("What is your height in inches?\n Height:");
        float userHeight1 = scan.nextFloat();

        System.out.print("What is the value of your vehicle?\n Price: ");
        int carPrice = scan.nextInt();

        System.out.print("Is your debt ratio positive or negative, if so what is it? Debt:");
        short debtAmount = scan.nextShort();

        System.out.println("Than");
    }
}


/*
Create one question and response for each of the data types listed below.

NUMBER TYPES:
byte --> scanner.nextByte(); 1
short --> scanner.nextShort();1
int --> scanner.nextInt();1
float --> scanner.nextFloat(); 1
long --> scanner.nextLong();
double --> scanner.nextDouble();

BOOLEAN:
boolean --> scanner.nextBoolean();1

STRING:
String --> scanner.nextLine();1

 */