package com.constructor;
// java program to illustrate constructor overloading
// using same task (addition operation) for different
// types of argument.
public class Customer {
    // constructor with one argument
    Customer (String name)
    {
        System.out.println("Constructor with one argument : String : " + name);
    }
    // constructor with two arguments
    Customer(String name, int age){
        System.out.println("Constructor with two argument : String and Integer : " + name + ", " + age );
    }
    // Constructor with one argument but with different
    // type than previous.
    Customer(long id){
        System.out.println("Constructor with one argument : " + " Long : " + id);
    }

    public static void main(String[] args) {
        // Creating the objects of the class named 'Customer'
        //by passing different arguments

        //invoke the constructor with one argument of
        // type 'String'.
        Customer customer1 = new Customer("Swati Tyagi");

        //invoke the constructor with two arguments
        Customer customer2 = new Customer("yash" , 28);

        // invoke the constructor with one argument of
        //type 'long'.
        Customer customer3 = new Customer(456789876);
    }
}

