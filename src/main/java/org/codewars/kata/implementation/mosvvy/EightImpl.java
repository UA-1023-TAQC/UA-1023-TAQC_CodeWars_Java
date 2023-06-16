package org.codewars.kata.implementation.mosvvy;

import org.codewars.kata.Eight;

import java.util.ArrayList;
import java.util.List;

public class EightImpl implements Eight {
    public int liters(double time) {
        return (int)time/2;
    }

    public double getVolumeOfCuboid(double length, double width, double height) {
        return length * width * height;
    }

    public float mpgToKPM(float mpg) {
        return 0;
    }

    public int[] squareOrSquareRoot(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < result.length; i++) {
            result[i] =  (int) Math.pow(array[i], (Math.pow(array[i], 0.5) % 1 == 0 ? 0.5 : 2));
        }
        return result;
    }

    public int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) return new int[] {};
        int[] result = {0, 0};
        for (int num : input) {
            if (num <= 0) result[1] += num;
            else result[0]++;
        }
        return result;
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
