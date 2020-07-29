package com.udemy.project19;

public class Lion extends Animal {

  public  Lion(){
this("Default Lion " , "Default gen " , 0);
  }

  public  Lion (String name, String generation) {
 this( name, generation, 5);

  }

  public Lion (String name , String generation , int age){
        super(name,generation,age);


    }

    @Override
    public String toString() {
            return "Hi my name is " + getName() +
                "\nI'm : " + getGeneration() +
                "\nAnd I am " + getAge();

    }
}
