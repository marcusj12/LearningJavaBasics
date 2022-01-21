package com.careerdevs.countryfactory;

/*
1. what type of object do we want to create within our program; create class
2. Come up with more than 4 classes with different fields
3. create a constructor
4. creating instances within the main
 */
public class Country {
    public String countryName;
    public String countryCapital;
    public long countryPopulation;


    public Country(String countryName, String countryCapital,long countryPopulation) {
        this.countryName = countryName;
        this.countryCapital = countryCapital;
        this.countryPopulation = countryPopulation;

    }

    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + countryName + '\'' +
                ", countryCapital='" + countryCapital + '\'' +
                ", countryPopulation=" + countryPopulation +
                '}';
    }
}



