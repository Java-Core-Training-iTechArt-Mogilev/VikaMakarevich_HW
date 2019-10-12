package com.best.qa;

import com.best.qa.lesson2.ArrayUtils;
import com.best.qa.lesson2.ValueType;

import java.util.Arrays;

public class World {

    public static void main(String[] args) {
        double[] randomArray = ArrayUtils.createArrayWithRandomValues(5);
        System.out.println("Max value: " + ArrayUtils.selectValueByType(randomArray, ValueType.MAX));
        System.out.println("Min value: " + ArrayUtils.selectValueByType(randomArray, ValueType.MIN));
        System.out.println("Average value: " + ArrayUtils.selectValueByType(randomArray, ValueType.AVERAGE));

        double[] sortedArray = ArrayUtils.sortArray(randomArray);
        System.out.println("Sorted array: " + Arrays.toString(sortedArray).replaceAll("[\\[\\],]", ""));

        System.out.println("Hello World");
    }
}
