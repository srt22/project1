package com.array.practice;

public class CreateAnArray {
        // java program to illustrate create an array
        // of integers, puts some values in the array,
        // and print each value to stander output.
        public static void main(String[] args) {
            // declares an array of integers.
            int [] arr;
            // allocating memory for 5 integers.
            arr = new int [5];
            //initialize the first elements of the array
            arr[0] = 10;
            // initialize the second elements of the array
            arr[1] = 20;
            // so on...
            arr[2] = 30;
            arr[3] = 40;
            arr[4] = 50;
            // accessing the elements of the specified array
            for (int i = 0; i < arr .length; i++)
                System.out.println("Element at index " + i + " : " + arr[i]);
        }
}
