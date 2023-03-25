package com.create.opertorshw;

public class JavaAssignmentOp {
    public static void main(String[] args) {
        // create variable
        int a = 4;
        int var ;
        // assign value using =
        var = a;
        System.out.println("var using a = " + var);
        // assign value using +=
        int b = 15;
        // b= b + 25
        b += 25;
        System.out.println("value of b = " + (b));
        // assign value using -=
        int c = 50;
        // c = c - 60
        c -= 60;
        System.out.println("value of c = " + (c));
        // assign value using *=
        int d = 32;
        // d = d * 10
        d *= 10;
        System.out.println("value of d = " + (d));
        // assign value using /=
        float e = 50;
        // e = e / 20
        e /= 20;
        System.out.println("value of e = " + (e));
        // assign value using %=
        int f = 10;
        // f = f % 20
        f %= 20;
        System.out.println("value of f = " + (f));
    }
}
