package com.udemy.project02;

public class Main {

    public static void main(String[] args) {

        /* int */
        // int is a primitive data types and INterger is a Wrapper class
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        //printing out minimum value of int
        System.out.println("Integer Minimum Value = " + myMinIntValue);
       //prinnting out  maximum value of Int
        System.out.println("Integer Maximun Value = " + myMaxIntValue);
        // OverFlow
        System.out.println("Busted MAX Value = "  + (myMaxIntValue + 1 ));
        // Underflow
        System.out.println("Busted MIN Value = "  + (myMinIntValue - 1 ));

        /* byte */

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value =" + myMinByteValue);
        System.out.println("Byte Maximum Value =" + myMaxByteValue);

        /* short */
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value =" + myMinShortValue);
        System.out.println("Short Maximum Value =" + myMaxShortValue);


        /* long */
        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value =" + myMinLongValue);
        System.out.println("Long Maximum Value =" + myMaxLongValue);

        


    }

}
