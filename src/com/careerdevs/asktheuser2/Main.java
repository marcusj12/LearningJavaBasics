package com.careerdevs.asktheuser2;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserInterface question1 = new UserInterface("Marcus", 24,true,5.10F,100000,7000,123.45, 3000000,);
        System.out.println(question1.carPrice);
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










    }
}
