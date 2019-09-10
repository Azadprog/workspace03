package com.udemy.project17;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        long hours = minutes / 60;
        long day = hours / 24;
        long year = day / 365;
        long remainingDays = day % 365;

        String  res = (minutes < 0) ? "invalid Value"  :  minutes + " min = " + year + " y " + " and " + remainingDays + " d";
        System.out.println(res);
    }
}