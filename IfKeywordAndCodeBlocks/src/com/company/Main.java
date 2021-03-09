package com.company;

public class Main {

    public static void main(String[] args) {
	    boolean gameOver = true;
	    int score = 900;
	    int levelCompleted = 5;
	    int bonus = 100;

//	    if (score < 5000 && score > 1000){
//            System.out.println("Your score was Less than 5000 and greater than 1000");
//        }
//	    else if (score <1000){
//            System.out.println("Your score is less than 1000");
//        }
//        else{
//            System.out.println("Got Here");
//        }
        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println(" Your Final score was : " + finalScore);
        }

        // Challenge
        //Print out a second score on the screen with the following
        // score set to 10000
        // bonus set to 200
        // but make sure the first printout above still display as well

        if (gameOver){
            score = 10000;
            levelCompleted = 8;
            bonus = 200;
            int finalScore = score + (levelCompleted * bonus);
            System.out.println(" Your Final score was : " + finalScore);
        }
    }
}
