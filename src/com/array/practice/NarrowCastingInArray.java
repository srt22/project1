package com.array.practice;

public class NarrowCastingInArray {
    public static void main(String[] args) {
        double d = 155.55;
        //converting double data type into long data type
        long l = (long)d;
        //converting long data type into int data type
        int i =(int)l;
        System.out.println("Before conversion:" +d);
        // fractional part lost
        System.out.println("After conversion into long type:" +l);
        //fractional part lost
        System.out.println("After conversion into int type:" +i);
}}