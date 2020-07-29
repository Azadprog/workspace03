package com.udemy.project19;

public class Goat  extends Animal implements Feedable {

private String favoriteFood;

public Goat(){
this("Default name","Default  generation", 8 , "Grass1");

    }

public Goat(String name , String generation ){


this(name, generation , 50 ,"Grass2" );

}

 public Goat (String name , String generation , int age , String favoriteFood){
    super(name,generation,age);
    this.favoriteFood =  favoriteFood;



    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    @Override
    public String feedAnimal(String food) {
        if (food != getFavoriteFood()) {

            return "the food is not good";

        } else {
       return   "the food is good yum";
        }

    }
    @Override
    public String toString() {

        return "My name is " + getName() +
                "\nI am generation: " + getGeneration() +
                "\nAnd I am : " + getAge() +
                "\nI'm pleased if you feed me my favoite food: " + getFavoriteFood().toString();


    }
}
