package com.careerdevs.fruitfactory;

public class Fruit {
    public String userName;
    public String fruitName;
    public String fruitColor;
    public  boolean hasSeeds;
    public int seedCount;

    public Fruit(String userName,String fruitName, String fruitColor, boolean hasSeeds, int seedCount){
        this.userName = userName;
        this.fruitName = fruitName;
        this.fruitColor = fruitColor;
        this.hasSeeds = hasSeeds;
        this.seedCount = seedCount;
    }
    @Override
    public String toString() {
        return "Fruit{" +
                "userName='" + userName + '\'' +
                ", fruitName='" + fruitName + '\'' +
                ", fruitColor='" + fruitColor + '\'' +
                ", hasSeeds=" + hasSeeds +
                ", seedCount=" + seedCount +
                '}';
    }
}
