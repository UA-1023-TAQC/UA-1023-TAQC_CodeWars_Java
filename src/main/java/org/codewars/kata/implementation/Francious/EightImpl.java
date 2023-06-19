package org.codewars.kata.implementation.Francious;

import org.codewars.kata.Eight;

public class EightImpl implements Eight {
    public int liters(double time) {
        return (int) Math.floor(time * 0.5);
    }

    public double getVolumeOfCuboid(double length, double width, double height) {
        return length * width * height;
    }

    public float mpgToKPM(float mpg) {

        double galonPerMile = 4.54609188 / 1.609344;
        double result = mpg / galonPerMile;
        return (float) Math.round(result * 100.0) / 100;
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
        return Math.round(number * 100.00) / 100.00;
    }

    public int[] divisibleBy(int[] numbers, int divider) {
        return new int[0];
    }

    @Override
    public boolean am_i_wilson(double n) {
        return false;
    }
}
