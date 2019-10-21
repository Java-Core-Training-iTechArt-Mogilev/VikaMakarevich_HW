package com.best.qa;

import com.best.qa.lesson2.ArrayUtils;

import java.util.Arrays;

public class World {

    public static void main(String[] args) {
        double[] randomArray = ArrayUtils.createArrayWithRandomValues(5);
        System.out.println("Max value: " + ArrayUtils.selectMaxValue(randomArray));
        System.out.println("Min value: " + ArrayUtils.selectMinValue(randomArray));
        System.out.println("Average value: " + ArrayUtils.selectAverageValue(randomArray));

        double[] sortedArray = ArrayUtils.sortArray(randomArray);
        System.out.println("Sorted array: " + Arrays.toString(sortedArray).replaceAll("[\\[\\],]", ""));

        System.out.println("Hello World");
    }
}
