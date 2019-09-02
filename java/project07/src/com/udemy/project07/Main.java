package com.udemy.project07;

public class Main {
    public static void main(String[] args) {

        calculateScore(true, 800, 5, 100);
        calculateScore(true, 10000, 8, 200);


    }


    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {


        if (gameOver) {
            int finaleSocre = score + (levelCompleted * bonus);
            finaleSocre += 2000;
            System.out.println("finaleScore = " + finaleSocre);

        }

    }
}



