package org.codewars.kata.implementation.Francious;

import org.codewars.kata.Eight;

import java.util.ArrayList;


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
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            double sqrt = Math.sqrt(array[i]);
            if (sqrt == (int) sqrt) {
                result[i] = (int) sqrt;
            } else {
                result[i] = array[i] * array[i];
            }
        }
        return result;
    }

    public int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) {
            return new int[0];
        }

        int[] result = new int[2];

        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0) {
                result[0] += 1;
            }

            if (input[i] < 0) {
                result[1] += input[i];
            }
        }
        return result;
    }

    public int stringToNumber(String str) {
        return Integer.parseInt(str);
    }

    public double TwoDecimalPlaces(double number) {
        return Math.round(number * 100.00) / 100.00;
    }

    public int[] divisibleBy(int[] numbers, int divider) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % divider == 0) {
                list.add(numbers[i]);
            }
        }
        int[] result = new int[list.size()];
        for (int j = 0; j < list.size(); j++) {
            result[j] = list.get(j);
        }

        return result;
    }


    @Override
    public boolean am_i_wilson(double n) {
        return n == 563 || n == 13 || n == 5;
    }
}
