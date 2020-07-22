package com.udemy.project20;

public class Main {
    public static void main(String[] args) {
        ITelephone asadPhone;
        asadPhone = new DeskPhone(90155394);
        asadPhone.powerOn();
        asadPhone.callPhone(90155394);
        asadPhone.answer();

        asadPhone = new MobilePhone(24565);
        asadPhone.powerOn();
        asadPhone.callPhone(24565);
        asadPhone.answer();


        }


    }


