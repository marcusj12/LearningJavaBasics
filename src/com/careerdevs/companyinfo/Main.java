package com.careerdevs.companyinfo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Company company = new Company("Walmart","1962",3.1F,399.27);
//        System.out.println(company);
        CompanyInfo();
    }

    public static void CompanyInfo () {
        Scanner scan = new Scanner(System.in);

        System.out.print("What is the Company name?:\n Company Name: ");
        String companyName = scan.nextLine();

        System.out.print("What year was the company established?:\n Year: ");
        String yearEstablished = scan.nextLine();

        System.out.print("What is the net income of this company?:\n Net Income:");
        float netIncome = scan.nextFloat();

        System.out.print("What is the marketCap of this company?: \n Market Cap:");
        double marketCap = scan.nextDouble();

        Company userGeneratedComp = new Company(companyName, yearEstablished, netIncome, marketCap);

        System.out.println("Our background reports came back on "+ userGeneratedComp.companyName +". The company has a net income of "+ userGeneratedComp.netIncome +" and a market-cap of "+ userGeneratedComp.marketCap);




    }

}
