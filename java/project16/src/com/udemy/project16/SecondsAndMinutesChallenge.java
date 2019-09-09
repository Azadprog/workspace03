package com.udemy.project16;

public class SecondsAndMinutesChallenge {

    public static String getDurationString (int minutes , int seconds){

        if((minutes <= 0) || (seconds <= 0 ) || (seconds >= 59)) {
            return "Invalid Value";

        } else {

            int hour;
           hour =  ( seconds* 3600) + (minutes * 60);
            return hour + " h " + minutes +" m " +  seconds +" s ";

        }

    }
    public static String getDurationString (int seconds) {
        if(seconds<= 0) {
        return "Invaøid Vaøue";
        } else {
            int minutes = seconds +60;
            return getDurationString( minutes,  seconds );
        }
    }

}
