package com.udemy.project21;

import java.util.ArrayList;
import java.util.List;

public class Players implements  ISaveable {
private String name;
private int hitPoints;
private int strngth;
private String weapon;

public Players(String name, int hitPoints, int Strength) {

    this.name = name;
    this.hitPoints = hitPoints;
    this.strngth = strngth;
    this.weapon = "Sword";
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }
    public int getStrngth() {
        return strngth;
    }

    public void setStrngth(int strngth) {
        this.strngth = strngth;
    }
    public String getWeapon() {
        return weapon;
    }
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Players{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strngth=" + strngth +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> values  = new ArrayList<>();

        values.add(0, this.name);
        values.add(1, "" + this.hitPoints);
        values.add(2,"" + this.strngth);
        values.add(3 , "" + this.weapon);

        return values;

    }

    @Override
    public void read(List<String> savedValues) {

    if(savedValues != null && savedValues.size() > 0 ) {
        this.name = savedValues.get(0);
        this.hitPoints = Integer.parseInt(savedValues.get(1));
        this.strngth = Integer.parseInt(savedValues.get(2));
        this.weapon = savedValues.get(3);
    }

    }
}
