package com.careerdevs.countryfactory;

import java.util.Scanner;

// step 0: Create scanner
// step 1: take user input;
// step 2: create an instance
// step 3: print the fields' value in the terminal
public class Main {
    public static void main(String[] args) {
//       Country country1 = new Country("Mexico", "Mexico City", 2300000L);
//        System.out.println(country1.countryPopulation);
          countryInfo();
    }
    public static void countryInfo () {
        Scanner scan = new Scanner(System.in);

        System.out.print("What is you favorite country?\n Enter Here:");
        String countryName = scan.nextLine();

        System.out.print("What is the capitol of that country?\n Enter Here:");
        String countryCapitol = scan.nextLine();

        System.out.print("What is your best guess of the population of you favorite country?\n Enter here: ");
        long countryPopulation = scan.nextLong();

        Country userSongChoice = new Country(countryName, countryCapitol, countryPopulation);

        System.out.println("Your favorite country is" + userSongChoice.countryName + "you guessed that the country capitol was:" + userSongChoice.countryCapital + "you also guessed that the population is:" +userSongChoice.countryPopulation);
    }
}
// How do we get a value that returns commas from user input?