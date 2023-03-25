package com.constructor;

public class Student {
    // java program to illustrate calling a
    // No-Argument constructor
    int num ;
    String name;
    // this would be invoked while an object
    //of that class is created.
    Student() {
        System.out.println("Constructor called");
    }

    public static void main(String[] args) {
        // this would invoke default constructor.
        Student student1 = new Student();
        //Default constructor provides the default
        // values to the object like 0, null
        System.out.println(student1.name);
        System.out.println(student1.num);

    }
}
