package com.careerdevs.asktheuser2;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        userInfo();
    }
    public static void userInfo () {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? \n Enter here:");
        String userFirstName1 = scanner.nextLine();

        System.out.print("What is your age? \n Enter here:");
        byte userAge1 = scanner.nextByte();

        System.out.print("Do you own a home?\n True or False:");
        boolean userHome1 = scanner.nextBoolean();

        System.out.print("What is your height?\n Enter Here:");
        float userHeight1 = scanner.nextFloat();

        System.out.print("How much money do you have saved?\n Enter Here:");
        int moneySaved = scanner.nextInt();

        System.out.print("What is the price of your car?\n Enter Here:");
        short carPrice = scanner.nextShort();

        System.out.print("What is your debt amount?\n Enter Here:");
        double debtAmount = scanner.nextDouble();

        System.out.print("What is your net worth?\n Enter Here:");
        long netWorth = scanner.nextLong();

        // create object for user input

        UserInterface userGeneratedInfo = new UserInterface(userFirstName1, userAge1, userHome1, userHeight1, moneySaved, carPrice, debtAmount,netWorth);

        System.out.println("I have no idea that you were " + userGeneratedInfo.userAge1 + ". I hope that your debt will allow you to purchase a home soon");
    }
}
