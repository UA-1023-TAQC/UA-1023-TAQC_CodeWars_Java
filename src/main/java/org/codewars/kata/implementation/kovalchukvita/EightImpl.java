package org.codewars.kata.implementation.kovalchukvita;

import org.codewars.kata.Eight;

public class EightImpl implements Eight {
    public int liters(double time) {
        double liters = time * 0.5;
        return (int) Math.floor(liters);
    }

    public double getVolumeOfCuboid(double length, double width, double height) {
        return 0;
    }

    public float mpgToKPM(float mpg) {
        double kpl = (mpg / 4.54609188) * 1.609344;
        return Math.round(kpl*100.0)/100.0f;
    }

    public int[] squareOrSquareRoot(int[] array) {
        return new int[0];
    }

    public int[] countPositivesSumNegatives(int[] input) {
        return new int[0];
    }

    public int stringToNumber(String str) {
        return 0;
    }

    public double TwoDecimalPlaces(double number) {
        return 0;
    }

    public int[] divisibleBy(int[] numbers, int divider) {
        return new int[0];
    }
}
