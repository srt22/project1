package com.constructor;
// default
public class Dog extends Animal{
    Dog(){
        System.out.println(" Default constructor");}

    public static void main(String[] args) {
        Dog bark = new Dog();
        Animal bark1 = new Animal();

    }

}
