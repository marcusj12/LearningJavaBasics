package com.careerdevs.fruitfactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Fruit fruit1 = new Fruit("Mango","Sunset orange",true);
        //System.out.println(fruit1.fruitColor);
        tastyFruit();

    }

    public static void tastyFruit () {
        Scanner scan = new Scanner(System.in);

        System.out.print("What is your name?\n Enter Here:");
        String userName = scan.nextLine();

        System.out.print("What is your favorite fruit? \n Enter Here:");
        String fruitName = scan.nextLine();

        System.out.print("What is the fruits color? \nEnter Here:");
        String fruitColor = scan.nextLine();

        System.out.print("Does the fruit have seeds?\n true or false:");
        boolean hasSeeds = scan.nextBoolean();

        System.out.print("How many seeds does this fruit have?\n Enter Here:");
        int seedCount = scan.nextInt();

        System.out.println("Did you know that" + userName+"'s"+" "+"favorite fruit is the" + fruitName +"."+""+ "It has a "+fruitColor+ "color and a seed count of" +" "+ seedCount);




    }
}
