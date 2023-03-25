package com.create.opertorshw;

public class JavaArithmeticOp {
    public static void main(String[] args) {
        // Declare Variables
        int a = 12;
        int b = 5;
        // declare increment Operator
        a++; // 13
             // postfix value
        // declare decrement Operator
        b--; // 4
             // postfix value
        int c = 10;
        ++c; //11
             // increment prefix value
        int e = 8;
        --e; // 7
        // decrement prefix value
        float d = 4;
        // Addition Operator
        System.out.println("a + b = " +(a + b));
        // subtraction Operator
        System.out.println("a - b = " + (a - b));
        // Multiplication Operator
        System.out.println("a * b = " + (a * b));
        // Division Operator
        System.out.println("a / b = " + (a / b));
        //Module Operator
        System.out.println("a % b = " + (a % b));
        // increment Operator postfix value
        System.out.println("a = " + (a));
        // increment Operator prefix value
        System.out.println("c = " +(c++));//11
        System.out.println("c = " + (c));//12
        //decrement Operator
        System.out.println("b = " + (b--));//4
        // decrement prefix value
        System.out.println("e = " + (e--));//7
        System.out.println("e = " + (e));//6
        // we will get the result will also be in float
        //Division Operator
        System.out.println("a / d = " + (a / d));

    }
}
