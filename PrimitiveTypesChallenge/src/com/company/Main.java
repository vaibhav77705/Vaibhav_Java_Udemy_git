package com.company;

public class Main {

    public static void main(String[] args) {

        byte challengeByteValue = 10;
        short challengeShortValue = 20;
        int challengeIntValue = 50;

        long longTotal = 50000L + 10L * (challengeByteValue + challengeShortValue + challengeIntValue);
        System.out.println(longTotal);
//        long challengeLongValue = (long)(50000 + 10 * (challengeByteValue + challengeShortValue + challengeIntValue));
//        System.out.println("ChallengeLongValue is  : " + challengeLongValue);

    }
}
