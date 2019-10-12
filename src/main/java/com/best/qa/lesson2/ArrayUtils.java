package com.best.qa.lesson2;

public abstract class ArrayUtils {

    public static double selectValueByType(double[] array, ValueType type) {
        double max = array[0];
        double min = array[0];
        double result = 0;
        double numberArrayElements = array.length;

        for (double element : array) {
            switch (type) {
                case MAX:
                    max = element > max ? element : max;
                    result = max;
                    break;

                case MIN:
                    min = element < min ? element : min;
                    result = min;
                    break;

                case AVERAGE:
                    result += element / numberArrayElements;
                    break;

                default:
                    break;
            }
        }
        return result;
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
