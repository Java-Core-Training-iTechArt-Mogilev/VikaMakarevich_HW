package com.best.qa.task2;

public class BubbleSort {

    public double[] sortArray(double[] array) {
        int i;
        int numberOfElements;
        double elementToSwap;
        int swapped;

        numberOfElements = array.length;

        while (numberOfElements != 0) {
            swapped = 0;

            for (i = 1; i <= numberOfElements - 1; i++) {
                if (array[i] < array[i - 1]) {
                    elementToSwap = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = elementToSwap;
                    swapped = i;
                }
            }
            numberOfElements = swapped;
        }
        return array;
    }
}
