package com.careerdevs.carfactory;

// fields are Defined  here
public class Car {
    public String model;
    public String make;
    public int mileage;
    public float gasTankPercent;

    //Constructor
    public Car(String model, String make, int mileage, float gasTankPercent) { // Method signature
        this.make = make;
        this.model= model;
        this.mileage = mileage;
        this.gasTankPercent = gasTankPercent;
    }



}
