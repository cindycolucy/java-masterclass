package com.colucy;

public class Main {

    public static void main(String[] args) {

//        int highScore = calculateScore(true, 800, 5, 100);
//        System.out.println("Your final score was " + highScore);
//
//        highScore = calculateScore(true, 10000, 8, 200);
//        System.out.println("Your final score was " + highScore);


        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Charlie", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Max", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Atticus", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Hailey", highScorePosition);


    }

//    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
//
//        if(gameOver){
//            int finalScore = score + (levelCompleted * bonus);
//            finalScore += 2000;
//            return finalScore;
//        }
//        return -1;
//    }

    public static void displayHighScorePosition(String playersName, int position){
        System.out.println(playersName + " got to position " + position + " in the High Score Table.");
    }

    public static int calculateHighScorePosition(int playersScore) {
        if (playersScore >= 1000) {
            return 1;
        } else if (playersScore >= 500) {
            return 2;
        } else if (playersScore >= 100)  {
            return 3;
        }
        return 4;
    }



}

