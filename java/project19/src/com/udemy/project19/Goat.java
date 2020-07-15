package com.udemy.project19;

public class Goat  extends Animal implements Feedable {

private String favoriteFood;

public Goat() {
this("fidle", "hit",56, "hhuih");

};

public Goat (String name, String generation){
this(name, generation,0, "lopp");

};
public Goat (String name , String generation , int age){
this(name,generation, age, "Hei");


}

public Goat (String name , String generation , int age , String favoriteFood){
    super(name,generation,age);
this.favoriteFood =  favoriteFood;


    }

    public void  setFavoriteFood(String favoriteFood){

    this.favoriteFood = favoriteFood;


}
public String getFavoriteFood(){
    return  favoriteFood;
}


@Override
    public String feedAnimal(String food){
    System.out.println("hello");
    return  null;

}

    @Override
    public String toString() {
        return "My name is " + name + "genertion of "+ generation + " an i am "+ age + "." + "I am pleased if you feed me" +favoriteFood ;
    }
}
