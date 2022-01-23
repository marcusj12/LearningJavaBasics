package com.careerdevs.asktheuser2;

public class UserInterface {

    public String userFirstName1;
    public byte userAge1;
    public boolean userHome1;
    public float userHeight1;
    public int moneySaved;
    public short carPrice;
    public double debtAmount;
    public long netWorth;


    public UserInterface (String userFirstName1, byte userAge1, boolean userHome1, float userHeight1, int moneySaved, short carPrice, double debtAmount, long netWorth) {
        this.userFirstName1 = userFirstName1;
        this.userAge1 = userAge1;
        this.userHome1 = userHome1;
        this.userHeight1 = userHeight1;
        this.moneySaved = moneySaved;
        this.carPrice = carPrice;
        this.debtAmount = debtAmount;
        this.netWorth = netWorth;
    }

    @Override
    public String toString() {
        return "UserInterface{" +
                "userFirstName1='" + userFirstName1 + '\'' +
                ", userAge1=" + userAge1 +
                ", userHome1=" + userHome1 +
                ", userHeight1=" + userHeight1 +
                ", moneySaved=" + moneySaved +
                ", carPrice=" + carPrice +
                ", debtAmount=" + debtAmount +
                ", netWorth=" + netWorth +
                '}';
    }
}
