package com.udemy.project15;

public class Main {
    public static void main(String[] args) {
        int newScore = calculateScore("Asad", 500);
        System.out.println("New Score is " + newScore);
        calculateScore(75);
        calculateScore();
        calcFeetAndInchesToCentimeters(6, 0);
        calcFeetAndInchesToCentimeters(7, 5);
        calcFeetAndInchesToCentimeters(-10, 1);
        calcFeetAndInchesToCentimeters(0, 1);
        calcFeetAndInchesToCentimeters(6, -13);

        calcFeetAndInchesToCentimeters(100);
        calcFeetAndInchesToCentimeters(157);
        calcFeetAndInchesToCentimeters(-10);

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player" + playerName + "Scored " + score + "points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player score" + score + "points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name" + "No player name");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || (inches < 0) || (inches > 12)) {
            System.out.println("Invalid feet or inches parameters");
            return -1;

        }

        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet " + inches + " inches = " + centimeters + " CMM ");
        return centimeters;
    }
    public static double calcFeetAndInchesToCentimeters ( double inches){
        if(inches < 0 ){
                return  -1;
        }
            double feet = (int)(inches / 12) ;
            double remainingInches = (int) (inches % 12);
            System.out.println(inches +"Inches is equal to " + feet + "Feet  and "  + remainingInches + "inches" ) ;
            return calcFeetAndInchesToCentimeters(feet , remainingInches);
    }

    }
