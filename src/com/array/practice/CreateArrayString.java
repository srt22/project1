package com.array.practice;

public class CreateArrayString {
    // java program to demonstrate the various
    // methods to iterate over a string array
    public static void main(String[] args) {
        String[] arr = { "Apple" ,"Banana", "Orange"};
        // first method
        for ( String i : arr){
            System.out.println(i + " ");
        }
        System.out.println();
        // second method
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
        // third method
        int i = 0;
        while (i < arr.length){
            System.out.println(arr[i] + " ");
            i++;
        }
        System.out.println();
    }
}
