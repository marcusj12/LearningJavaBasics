package com.careerdevs.sayhello;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Parameter that needs to be used
        System.out.print("What is your first name? \n First Name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, nice to meet you "+ name);


        Scanner scanner2 = new Scanner(System.in); // Parameter that needs to be used
        System.out.print("What is your last name?: \n Last Name: ");
        String name2 = scanner.nextLine();

        System.out.println("Hello, nice to meet you"+ " " + name + " " +name2);
    }
}
/*
next() vs nextLine()
 */