package com.company;

public class Main {

    public static void main(String[] args) {

            float myMinFloatValue = Float.MIN_VALUE;
            float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value : " + myMinFloatValue);
        System.out.println("Float Maximum Value : " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Value : " + myMinDoubleValue);
        System.out.println("Double Maximum Value : " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        //float myFloatValue = (float)5.25; //Challenge for Casting
        double myDoubleValue = 5.00 / 3.00;
        System.out.println("My IntValue = " + myIntValue );
        System.out.println("My FloatValue = " + myFloatValue );
        System.out.println("My DoubleValue = " + myDoubleValue );

        //Challenge for converting Pound to kilograms.
        double numberOfPounds = 200d;
        double convertedKilograms = numberOfPounds * 0.45359237d;
        System.out.println("Converted Kilograms = "+ convertedKilograms);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;

        System.out.println(anotherNumber);



    }
}
