package com.modifierlearning;

public class ModifierMethod {
    static int a = 250;
    static int b = 15;

    private static int calculate() {
        int c = a / b;
        System.out.println(c);
        return c;
    }

    public static void main(String[] args) {
        System.out.println(a/b);

    }
}



