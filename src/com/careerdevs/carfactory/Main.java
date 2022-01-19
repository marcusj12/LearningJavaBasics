package com.careerdevs.carfactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // createACar();
        createACarObject();

    }
    //Challenge 1
     public static void createACar () {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Who is the owner of this vehicle? \n First/Last Name:");
        String carOwner = scanner.nextLine();

        System.out.print("What is the make of your vehicle? \n Make: ");
        String carOwnerMake = scanner.nextLine();

        System.out.print("What is the model of your vehicle?: \n Model: " );
        String carOwnerModel = scanner.nextLine();


         System.out.println(carOwner + " " + "owns the" + " " + carOwnerMake + " " + carOwnerModel);
    }
    public static void createACarObject () {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the make of your car? \n Make:");
        String carMake = scanner.nextLine();

        System.out.print("What is the model of your vehicle?: \n Model:");
        String carModel = scanner.nextLine();

        System.out.print("At this moment, what is your current vehicles mileage? \n Mileage:");
        int carMileage = scanner.nextInt();

        System.out.print("What is your vehicles gas tank percentage? \n Gas Tank %:");
        float carGasTankPercent = scanner.nextFloat();

        Car car = new Car(carMake, carModel, carMileage, carGasTankPercent);




        System.out.print("The"+ " " + car.model + " " + car.make + " " + "belongs to Marcus");
    }
}
