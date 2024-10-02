package com.pluralsight;

import java.util.Scanner;

public class Main {
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        String userInput = (promptForString("Please enter the game score: ")).trim();
        String[] teamsAndScore = userInput.split("\\|");
        String[] teams = teamsAndScore[0].split(":");
        String[] scores = teamsAndScore[1].split(":");
        String winner;

        if (Integer.parseInt(scores[0]) > Integer.parseInt(scores[1])){
            winner = teams[0];
        }else if (Integer.parseInt(scores[0]) < Integer.parseInt(scores[1])) {
            winner = teams[1];
        }else{
            winner = "Tie";
        }
        System.out.println("Winner: " + winner);
    }

    public static String promptForString (String prompt){
        System.out.println(prompt);
        return myScanner.nextLine();
    }
}