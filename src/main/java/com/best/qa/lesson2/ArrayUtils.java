package com.best.qa.lesson2;

public abstract class ArrayUtils {

    public static double selectMaxValue(double[] array) {
        double max = array[0];

        for (double element : array) {
            max = element > max ? element : max;
        }
        return max;
    }

    public static double selectMinValue(double[] array) {
        double min = array[0];

        for (double element : array) {
            min = element < min ? element : min;
        }
        return min;
    }

    public static double selectAverageValue(double[] array) {
        double avr = 0;
        double numberArrayElements = array.length;

        for (double element : array) {
            avr += element / numberArrayElements;
        }
        return avr;
    }

    public static double[] createArrayWithRandomValues(int numberElements) {
        double[] randomArray = new double[numberElements];

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = Math.random();
        }
        return randomArray;
    }

    public static double[] sortArray(double[] array) {
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
