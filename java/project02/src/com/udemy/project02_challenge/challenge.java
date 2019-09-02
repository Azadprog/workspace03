package com.udemy.project02_challenge;

public class challenge {
    public static void main(String[] args) {
        byte  myByteNr = 10;
        short myShortNr = 20;
        int myIntNr = 50;

        long myLongNr = 50000L + 10L + ( myByteNr +myShortNr + myIntNr) ;
        System.out.println(myLongNr);
                  //Casting
        short shortNr = (short)  (50000 + 10 * (myByteNr + myShortNr +myIntNr));
    }


}
