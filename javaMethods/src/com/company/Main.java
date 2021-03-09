package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 900;
        int levelCompleted = 5;
        int bonus = 100;
        int highScore = calculateScore(gameOver,score,levelCompleted,bonus);
        System.out.println(" Your Final score was : " + highScore);

        highScore = calculateScore(false,10000,8,200);
        System.out.println(" Your Final score was : " + highScore);

        // ---- Challenge Method Calls ------//
        displayHighScorePosition("Vaibhav",calculateHighScorePosition(1500));
        displayHighScorePosition("Vaibhav",calculateHighScorePosition(900));
        displayHighScorePosition("Vaibhav",calculateHighScorePosition(400));
        displayHighScorePosition("Vaibhav",calculateHighScorePosition(50));
    }



    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);

            return finalScore;
        }

        return -1;

    }

    //Create a method called displayHighScorePosition
    //it should a player name as parameter , and a 2nd parameter as a position in the high score table
    //you should display the players name along with a massage line " managed to get into position " and the
    //the position they got and a further massage " on the high score table ".
    //
    //Create a 2nd method called calculateHighScorePosition
    //it should be sent one argument only, the player score
    //it should return an int
    //1 if the score is >1000
    //2 if the score is >500 and <1000
    //3 if the score is >100 and < 500
    //4 in all other cases
    //call both methods and display the results of the following
    //a score of 1500 ,900 ,400, and 50

    public static void displayHighScorePosition(String playerName, int playerPosition){
        System.out.println(playerName +" Managed to get into position : "
                + playerPosition + " on the high score table");

    }
    public static int calculateHighScorePosition(int highScore){
        if (highScore > 1000){
            return 1;
        }
        else if ((highScore > 500) && (highScore < 1000)){
            return 2;
        }
        else if ((highScore > 100) && (highScore < 500)){
            return 3;
        }
        else {
            return 4;
        }

    }
}
