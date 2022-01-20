package com.careerdevs.animalrescue;

public class Animals {
/*
1. what type of object do we want to create within our program; create class
2. Come up with more than 4 classes with different fields
3. create a constructor
4. creating instances within the main
 */
    // animal species(str)
    // diet type (str)
    // legs (short)
    // lives on land (boolean)
    // maxSpeed (float)
// 1. fields
    public String animalSpecies;
    public String animalBreed;
    public String  dietType;
    public short  animalLegs;
    public boolean livesOnLand;
    public float maxSpeed;

// Create the constructor
    public Animals(String animalSpecies, String animalBreed, String dietType, short animalLegs, boolean livesOnLand, float maxSpeed) {
        this.animalSpecies = animalSpecies;
        this.animalBreed = animalBreed;
        this.dietType = dietType;
        this.animalLegs = animalLegs;
        this.livesOnLand = livesOnLand;
        this.maxSpeed = maxSpeed;


    }

    @Override // overwriting the original toString method & using a custom one
    public String toString() {
        return "Animals{" +
                "animalSpecies='" + animalSpecies + '\'' +
                ", animalBreed='" + animalBreed + '\'' +
                ", dietType='" + dietType + '\'' +
                ", animalLegs=" + animalLegs +
                ", livesOnLand=" + livesOnLand +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
