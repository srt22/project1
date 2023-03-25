package com;

public class BodmasPracticeInJava {
    public static void main(String[] args) {
        // BODMAS Rules = Brackets(){}[],order()^,Divide / ,Multiply * ,Addition + , Subtraction -,
        int a = (10 + 3) * 7 - 15 / 5;
        // 13 * 7 - 15 /5
        // 13 * 7 - 3
        //91-3
        //88
        int b = 36 / 6 * 3 - 2 - (3+5);
        // 36 / 6 * 3 - 2 - 8
        // 6 * 3 - 2 - 8
        // 18 - 2 -8
        //8
        System.out.println(b);
        System.out.println(a);
    }

}
