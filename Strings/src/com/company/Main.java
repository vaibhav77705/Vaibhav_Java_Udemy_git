package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        String myString = "This is my String";
        System.out.println("myString is : " + myString);
        myString = myString + ", and i add this more";
        System.out.println("myString is : " + myString);
        myString = myString + " \u00A9 2019";
        System.out.println("myString is : " + myString);
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString +myInt; // when using int variable
        System.out.println(lastString);
        double doubleNumber =120.47d;
        lastString = lastString + doubleNumber ;// Using Double variable
        System.out.println(lastString);

    }
}
