package com.best.qa.task1;

public class RandomValues {

    public double selectValueFromArray(double[] randomArray, ValueType type) {
        double max = randomArray[0];
        double min = randomArray[0];
        double result = 0;
        double numberArrayElements = randomArray.length;

        for (double element : randomArray) {
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

    public double[] createArrayWithRandomValues(int numberElements) {
        double[] randomArray = new double[numberElements];

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = Math.random();
        }
        return randomArray;
    }
}
