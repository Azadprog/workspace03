package com.udemy.project22;

public class Penguin  extends Bird{

    public Penguin ( String name){

        super(name);
    }

    @Override
    public void  fly(){
        super.fly();
        System.out.println("Can't fly so good , but i can swim");
    }

}
