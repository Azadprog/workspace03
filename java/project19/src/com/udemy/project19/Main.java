package com.udemy.project19;

import javax.xml.namespace.QName;

public class Main {

    public static void main(String[] args) {

        Goat goat = new Goat("Guri ", "Unclear info ",8,"kk");

       Lion lion = new Lion("Simba", "Unclear info", 1);

        System.out.println(goat.toString());
        System.out.println();
        System.out.println(lion.toString());
        System.out.println(goat.feedAnimal(goat.getFavoriteFood()));

    }


}
