package com.best.qa;

import com.best.qa.task1.RandomValues;
import com.best.qa.task1.ValueType;
import com.best.qa.task2.BubbleSort;

import java.util.Arrays;

public class World {

    public static void main(String[] args) {
        RandomValues values = new RandomValues();
        BubbleSort bubbleSort = new BubbleSort();

        double[] randomArray = values.createArrayWithRandomValues(5);
        System.out.println("Max value: " + values.selectValueFromArray(randomArray, ValueType.MAX));
        System.out.println("Min value: " + values.selectValueFromArray(randomArray, ValueType.MIN));
        System.out.println("Average value: " + values.selectValueFromArray(randomArray, ValueType.AVERAGE));

        double[] sortedArray = bubbleSort.sortArray(randomArray);
        System.out.println("Sorted array: " + Arrays.toString(sortedArray).replaceAll("[\\[\\],]", ""));

        System.out.println("Hello World");
    }
}
