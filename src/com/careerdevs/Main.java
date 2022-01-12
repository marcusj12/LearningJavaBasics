package com.careerdevs;

public class Main {

    public static void main(String[] args) {

        String firstName = "Marcus";
        String lastName = "Jennings";
/*
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
*/

       // String createdName = createFullName(firstName, lastName);
         // System.out.println(createdName);
//        String generatedName =  NameGenerator.generateFullName(firstName, lastName);
//        System.out.println(generatedName);

        /*
        Make: Camaro 2SS, Model: Chevy, mileage: 10000, gasTankPercent: 0.10
        Make: Mustang GT Model: Ford, mileage: 30000, gasTankPercent: 0.50

        Make: Hellcat, Model: Dodge, mileage: 100, gasTankPercent: 0.90
        */


        Car carOne = new Car("Camaro 2ss", "Chevy", 10_000,.10f);
        Car carTwo = new Car("Mustang GT", "Ford",30_000, .50f);
        Car carThree = new Car("Hellcat","Dodge", 100,.90f);

        //Standard Solution
        System.out.println(carOne.make + " " + carOne.model);
        System.out.println(carTwo.make + " " + carTwo.model);
        System.out.println(carThree.make + " " + carThree.model);

        //Bonus solution: Array
        Car[] myCarArr = new Car[3];
        myCarArr[0] = carOne;
        myCarArr[1] = carTwo;
        myCarArr[2] = carThree;


        /* Another way to make create the array:
           Car[] myNewCarArr = new Car[] {carIne, carTwo, carThree};
                        or
           ArrayList<Car> carArr = new ArrayList<>();
            carArr.add(carOne);
            carArr.add(carTwo);
            carArr.add(carThree);
                - using a JS array equivalent in java.
                - alot easier to use

        // Array outputs (Standard vs Array List)
        //Standard Array
            for (int i = 0; i < carArr.length; i++) {
            Car tempCar = carArr[i];
            System.out.println(tempcar.make + " " + tempCar.model)
            }
         */

    /*
        //Array list
       for (i = 0; i < carArrayList.size(); i++) {}
            Car tempCar = carArrayList.get(i);
            System.out.println(tempCar.make + " " + tempCar.model);
     */


    }

//
//    //Java Challenge # 2
//    public static String createFullName(String fName, String lName) {
//        return fName + " " + lName;
//
//    }
}

