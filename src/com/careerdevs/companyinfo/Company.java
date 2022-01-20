package com.careerdevs.companyinfo;

public class Company {

    public String companyName;
    public String yearEstablished;
    public float netIncome;
    public double marketCap;

    public Company(String companyName, String yearEstablished,float netIncome, double marketCap) {
        this.companyName = companyName;
        this.yearEstablished = yearEstablished;
        this.netIncome = netIncome;
        this.marketCap = marketCap;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", yearEstablished='" + yearEstablished + '\'' +
                ", netIncome=" + netIncome +
                ", marketCap=" + marketCap +
                '}';
    }
}
