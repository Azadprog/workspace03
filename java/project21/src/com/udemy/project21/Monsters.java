package com.udemy.project21;

import java.util.ArrayList;
import java.util.List;

public class Monsters implements  ISaveable {

    private String name;
    private int hitPoints;
    private int strngth;

    public Monsters(String name, int hitPoints, int strngth){
        this.name = name;
        this.hitPoints = hitPoints;
        this.strngth = strngth;

    }

    public String getName() {
        return name;
    }


    public int getHitPoints(){
        return hitPoints;
    }


    public int getStrngth(int strngth){
        return  strngth;
    }





    @Override
    public List <String> write() {
        ArrayList<String> values =  new ArrayList<String>();
        values.add(0, this.name);
        values.add(1,"" + this.hitPoints);
        values.add(2, "" + this.strngth);
        return values;
    }

    @Override
    public void read(List<String> savedValues) {

        if (savedValues != null && savedValues.size() > 0){
    this.name = savedValues.get(0);
    this.hitPoints = Integer.parseInt(savedValues.get(1));
    this.strngth = Integer.parseInt(savedValues.get(2));
}

    }

    @Override
    public String toString() {
        return "Monsters{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strngth=" + strngth +
                '}';
    }
}


