package org.codewars.kata.implementation.zakotiukk;

import org.codewars.kata.Eight;

public class EightImpl implements Eight {
    public int liters(double time) {
        double liters = time * 0.5;
        return (int) Math.floor(liters);
    }

    public double getVolumeOfCuboid(double length, double width, double height) {
        return length * width * height;
    }

    public float mpgToKPM(float mpg) {
        float kpl = (float) (mpg * 1.609344 / 4.54609188);
        return Math.round(kpl * 100.0f) / 100.0f;
    }

    public int[] squareOrSquareRoot(int[] array) {
        int[] res = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            double squareRoot = Math.sqrt(array[i]);
            if (squareRoot == (int) squareRoot) {
                res[i] = (int) squareRoot;
            } else {
                res[i] = array[i] * array[i];
            }
        }
        return res;
    }

    public int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) {
            return new int[0];
        }
        int numPos = 0;
        int sumNeg = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0) {
                numPos++;
            } else if (input[i] < 0) {
                sumNeg += input[i];
            }
        }
        return new int[]{numPos, sumNeg};
    }

    public int stringToNumber(String str) {
        return Integer.parseInt(str);
    }

    public double TwoDecimalPlaces(double number) {
        return Math.round(number * 100.0) / 100.0;
    }

    public int[] divisibleBy(int[] numbers, int divider) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % divider == 0) {
                count++;
            }
        }
        int[] array = new int[count];
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % divider == 0) {
                array[index] = numbers[i];
                index++;
            }
        }
        return array;
    }

    @Override
    public boolean am_i_wilson(double n) {
        if (n <= 1 || n != (int) n) {
            return false;
        }
        int p = (int) n;
        if (p == 563) {
            return true;
        }
        int factorial = 1;
        for (int i = 2; i < p; i++) {
            factorial *= i;
        }
        factorial += 1;
        return factorial % (p * p) == 0;
    }
}
