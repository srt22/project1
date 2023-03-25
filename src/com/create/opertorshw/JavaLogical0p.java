package com.create.opertorshw;

public class JavaLogical0p {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // && logical and
        // returns true if both statements are ture
        boolean ans1 = a > b && b < 15;
                    // false    false
                     // false
        System.out.println("1.answer is -: " + (ans1));
        boolean ans2 = a < b && b > 25;
                     // true      false
                      // false
        System.out.println("2.answer is -: " + (ans2));
        boolean ans3 = a < b && b > 15;
                       // true     true
                         // true
        System.out.println("3.answer is -: " + (ans3));
        // || logical or
        // returns true if ine of the statement is true
        int c = 15;
        int d = 10;
        boolean ans4 = c > d || d < 5 ;
                     // false   true
                      //  true
        System.out.println("4.answer is -: " + (ans4));
        boolean ans5 = c > d || d < 35;
                     // false    false
                     // false
        System.out.println("5.answer is -: " + (ans5));

        // ! logical not
        // reverse the results false if the result is true
        //if any statement is true then return will be true
         int e = 5;
         int f = 10;
         boolean ans6 = (!(e > d) || d > 25);
                     // true       false
                     // true
        System.out.println("6.answer is -: " + (ans6));


    }
}
