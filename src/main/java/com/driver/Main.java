package com.driver;

public class Main {
  
  public static void main(String args[]){
     RWOnly obj=new RWOnly();
  //  obj.name="manish";
   // unresolved compilation problem 
   // THE field RWOnly.name is not visble
    obj.set("aditya");
    System.out.println(obj.get());
  }
  
  
}
