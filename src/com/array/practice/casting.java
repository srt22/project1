package com.array.practice;

import java.util.Arrays;

public class casting {
    public static void main(String[] args) {
        int[] inputArray = new int[] {23, 4, 5, 6, 89};
        double[] outputArray = new double[inputArray . length];
        Arrays.setAll(outputArray, inputArrayIndex ->(double)
                inputArray[inputArrayIndex]);

        System.out.println(Arrays. toString(outputArray));
    }
}
