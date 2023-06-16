package org.codewars.kata.implementation.mosvvy;

import org.codewars.kata.Eight;

import java.util.ArrayList;
import java.util.List;

public class EightImpl implements Eight {
    public int liters(double time) {
        return 0;
    }

    public double getVolumeOfCuboid(double length, double width, double height) {
        return length * width * height;
    }

    public float mpgToKPM(float mpg) {
        return 0;
    }

    public int[] squareOrSquareRoot(int[] array) {
        return new int[0];
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
        List<Integer> result = new ArrayList<>();

        for (int number: numbers) {
            if (number % divider == 0) result.add(number);
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    @Override
    public boolean am_i_wilson(double n) {
        return false;
    }
}
