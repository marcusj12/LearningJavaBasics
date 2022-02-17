package com.careerdevs.recursionpractice;

public class CountDown {

    public static void main(String[] args) {
        iterative(5);
    }

    private static void iterative (int countDownFrom) {
        //option 1
        for (int i = 0; i < countDownFrom; i++ ) {
            System.out.println(i);
        }

//        //option2
//        for (int i = countDownFrom; i > 0; i--) {
//            System.out.println(i);
////        }
        //option 3
//        int i = countDownFrom;
//        while(i >= 1) {
//            System.out.println(i);
//            i--;
//        }
        //option 4
//        while ((countDownFrom > 0)){
//            System.out.println(countDownFrom);
//            countDownFrom--;
//        }
    }


}
