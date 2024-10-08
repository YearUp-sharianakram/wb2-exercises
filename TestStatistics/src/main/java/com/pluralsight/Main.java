package com.pluralsight;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] testScores = {1,1,1,1,1,1,1,1,1,100000};
        Arrays.sort(testScores);
        System.out.println("The average is " + average(testScores));
        System.out.println("The highest score is " + highScore(testScores));
        System.out.println("The low score is " + lowScore(testScores));
        System.out.println("The median is " + median(testScores));
        System.out.println("The difference between average and median is " + (average(testScores) - median(testScores)));



    }

    public static double average(int[] testScores){
        int total = 0;
        for (int score : testScores){
            total += score;
        }
        return (double) total /testScores.length;
    }

    public static int highScore(int[] testScores){
        int currentHighest = 0;
        for (int score : testScores){
            if (score > currentHighest){
                currentHighest = score;
            }
        }
        return currentHighest;
    }

    public static int lowScore(int[] testScores){
        int currentLowest = 1000000;
        for (int score : testScores){
            if (score < currentLowest){
                currentLowest = score;
            }
        }
        return currentLowest;
    }

    public static double median(int[] testScores){
        int middleNumber = (int)(testScores.length / 2);
        if (testScores.length % 2 == 1){
            return testScores[middleNumber];
        }else{
            return ((double) (testScores[middleNumber - 1] + testScores[middleNumber]) / 2);

        }
    }
}
