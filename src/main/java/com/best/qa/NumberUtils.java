package com.best.qa;

public class NumberUtils {

    private NumberUtils() {}

    static byte findMinNumber(byte num1, byte num2) {
        return (num1 <= num2) ? num1 : num2;
    }

    static short findMinNumber(short num1, short num2) {
        return (num1 <= num2) ? num1 : num2;
    }

    static int findMinNumber(int num1, int num2) {
        return (num1 <= num2) ? num1 : num2;
    }

    static long findMinNumber(long num1, long num2) {
        return (num1 <= num2) ? num1 : num2;
    }

    static float findMinNumber(float num1, float num2) {
        return (num1 <= num2) ? num1 : num2;
    }

    static double findMinNumber(double num1, double num2) {
        return (num1 <= num2) ? num1 : num2;
    }
}
