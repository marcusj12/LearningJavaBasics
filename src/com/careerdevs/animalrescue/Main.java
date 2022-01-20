package com.careerdevs.animalrescue;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Animals animal1 = new Animals("Canines","German Shepard", "Omnivore", (short) 4 ,true, 30 );
        //System.out.println(animal1);
        animalSpecies();
    }

    public static void animalSpecies() {
        // step 0: Create scanner
        Scanner scan = new Scanner(System.in);
        // step 1: take user input;
        System.out.print("Enter the animal species:\n Species:");
         String animalSpecies = scan.nextLine();

        System.out.print("What is the species breed? \n Breed:");
         String animalBreed = scan.nextLine();

        System.out.print("What is the feeding preference of"+ ""+ animalSpecies + "?\n Diet:");
         String dietType = scan.nextLine();

        System.out.print("How many legs do" + animalSpecies + "have? \n Leg #:");
         short animalLegs = scan.nextShort();

        System.out.print("Does this animal species live on land ?\n True or False:");
         boolean livesOnLand = scan.nextBoolean();

        System.out.print("How fast can this animal move?\n Speed: ");
         float maxSpeed = scan.nextFloat();

        System.out.print("Typically"+ "" +animalBreed+"'s"+" "+ "have"+ " "+ animalLegs +" "+"legs and have a"+ ""+ dietType + " "+"based diet.\nThey also can run at speeds of"+" "+maxSpeed+"mph.");
        // step 2: create an Airplane instance
        // step 3: print the fields' value in the terminal
    }
}

