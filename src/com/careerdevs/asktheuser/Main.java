package com.careerdevs.asktheuser;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //UserInterface userInfo1 = new UserInterface("Marcus", (byte) 24,false,63.7f,6000, (short) 2000, 20000d,100000000L);
        //System.out.println(userInfo1.userFirstName1);
      userInfo();
    }

    public static void userInfo () {

        Scanner scan = new Scanner(System.in); // Declare and assign the scanner variable

        System.out.print("What is your name?\n First Name:");
        String userFirstName1 = scan.nextLine(); // data type; then variable name


        System.out.print("What is your age?\n Age:");
        byte userAge1 = scan.nextByte();


        System.out.print("Do you own a home?");
        boolean userHome1 = scan.nextBoolean();

        System.out.print("What is the max speed of your car?\n Speed:");
        float userHeight1 = scan.nextFloat();

        System.out.print("What is the value of your vehicle?\n Price: ");
        int carPrice = scan.nextInt();

        System.out.print("How many have you saved this year\n Savings:");
        short moneySaved = scan.nextShort();

        System.out.print("What is your desired net worth?:");
        long netWorth = scan.nextLong();

        System.out.print("How much debt do you have?\n Debt:");
        double debtAmount = scan.nextDouble();

        System.out.println("Thank you for your responses" +" "+userFirstName1);

    }
}

