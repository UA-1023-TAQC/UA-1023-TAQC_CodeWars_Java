package org.codewars.kata.implementation.DappY127;

import org.codewars.kata.Eight;
import java.util.Arrays;

public class EightImpl implements Eight {
    public int liters(double time) {
        return (int) (time * 0.5);
    }

    public double getVolumeOfCuboid(double length, double width, double height) {
        return length * width * height;
    }

    public float mpgToKPM(float mpg) {
        float kpm = (mpg * 1.609344f) / 4.54609188f;
        return Math.round(kpm * 100.0f) / 100.0f;
    }

    public int[] squareOrSquareRoot(int[] array) {
        return Arrays.stream(array)
                .map(num -> {
                    double sqrt = Math.sqrt(num);
                    return sqrt == (int) sqrt ? (int) sqrt : num * num;
                })
                .toArray();
    }

    public int[] countPositivesSumNegatives(int[] input) {
        return new int[0];
    }

    public int stringToNumber(String str) {
        return Integer.parseInt(str);
    }

    public double TwoDecimalPlaces(double number) {
        return 0;
    }

    public int[] divisibleBy(int[] numbers, int divider) {
        return new int[0];
    }

    @Override
    public boolean am_i_wilson(double n) {
        return false;
    }
}
