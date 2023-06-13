package org.codewars.kata.implementation.mosvvy;

import org.codewars.kata.Eight;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class EightImpl implements Eight {
    public int liters(double time) {
        return 0;
    }

    public double getVolumeOfCuboid(double length, double width, double height) {
        return 0;
    }

    public float mpgToKPM(float mpg) {
        float coef =  1.609344f / 4.54609188f;
        BigDecimal bd = BigDecimal.valueOf(mpg * coef).setScale(2, RoundingMode.HALF_UP);
        return bd.floatValue();
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
