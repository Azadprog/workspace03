package com.udemy.project06_challenge;

import org.w3c.dom.ls.LSOutput;


public class Main {

    public static void main(String[] args) {


        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        double addAndMultiply = (myFirstValue + mySecondValue) * 100.00d;
        System.out.println(addAndMultiply);
        double modReult = addAndMultiply % 40.00d ;
        System.out.println(modReult);

        boolean isModresultTrue = (modReult == 0) ? true : false;
        System.out.println(isModresultTrue);

        if (!isModresultTrue) {

            System.out.println("got some Reaminder");

        }
    }
}
