package com.udemy.project19;

abstract  class Animal {


   private String name;
   private String generation;
   private  int age;



   public Animal(){

   };

   public Animal(String name, String generation){


   };

   public Animal (String name, String generation, int age) {
   this.name = name;
   this.generation = generation;
   this.age = age;

}

   public void setName(String name) {
      this.name = name;
   }

   public void setGeneration(String generation) {
      this.generation = generation;
   }

   public void setAge (int age) {
      this.age = age;


   }

   public String getName(){
      return  name;
   }

   public String getGeneration() {
      return generation;
   }
   public int getAge() {
      return  age;
   }
public  abstract  String toString();


}

