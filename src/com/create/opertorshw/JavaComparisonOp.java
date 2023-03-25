package com.create.opertorshw;

public class JavaComparisonOp {
    public static void main(String[] args) {
    // create variable
        int a = 80;
        int b = 50;
        // == equal to operator
        boolean ans = a == b; // 80 == 50 // false
        System.out.println("1.answer is -: " + (ans));
        // != not equal Operator
        int c = 20 ;
        int d = 10 ;
        boolean ans2 = c != d;// true
        System.out.println("2.answer is -: " + (ans2));
        // > greater than operator
        int e = 30;
        int f = 10;
        boolean anw3 = e > f ; // true
        System.out.println("3.answer is -: " + (anw3));
        // < less than operator
        int g = 25;
        int h = 33;
        boolean ans4 = g <  h ; // true
        System.out.println("4.answer is -: " + (ans4));
        // >= greater than or equal to Operator
        int i = 55;
        int j = 88;
        boolean ans5 = i >= j; // false
        System.out.println("5.answer is -: " + (ans5));
        // <= less than and equal to Operator
        int k = 66;
        int l = 66;
        boolean ans6 = k <= l; // true
        System.out.println("6.answer is -: " + (ans6));
    }

}
