package com.udemy.project12;

public class BarkingDog {
    public static boolean shouldWakeUp (boolean bark, int hourOfDay){
        if (hourOfDay < 0 || hourOfDay >23){
            return  false;
        }else if( bark && (hourOfDay <8 || hourOfDay>22)) {
            return true;
        }
        return false;
    }
}
