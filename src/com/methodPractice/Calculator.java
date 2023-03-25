package com.methodPractice;

public class Calculator {
    public static int addition(int a ,int b, int c){
        int d = a + b + c;
        return d;
    }

    public static String printFullName(String name, String lastName){
         String fullName = name + " " +lastName;
         return fullName;
    }

    public static void main(String[] args) {
        System.out.println(printFullName("swati","tyagi"));
        System.out.println(printFullName( "Krishna","Vasani"));
        System.out.println(addition(30 ,40,60));
    }

}
