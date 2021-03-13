package com.colucy;

public class Main {

    public static void main(String[] args) {
//	int newScore = calculateScore("Max", 500);
//        System.out.println("New score = " + newScore);
//        calculateScore(75);
//        calculateScore();
        calcFeetAndInchesToCentimeters(0, 11);
        calcFeetAndInchesToCentimeters(125);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return 0;
    }

    //challenge

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet >= 0) && (inches >= 0 && inches < 12)) {
            double centimeters = ((feet * 12 + inches) * 2.54);
            System.out.println("Centimeters = " + centimeters);
            return centimeters;
        }
        System.out.println("Invalid.");
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
            double feet = (int)(inches / 12);
            double remainingInches = (int) (inches % 12);
            System.out.println("Result = " + feet + " feet and " +remainingInches + " inches");
            return calcFeetAndInchesToCentimeters(feet, remainingInches);
        }
        System.out.println("Invalid.");
        return -1;
    }


}
