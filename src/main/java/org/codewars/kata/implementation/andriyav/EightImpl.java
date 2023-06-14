package org.codewars.kata.implementation.andriyav;

import org.codewars.kata.Eight;

public class EightImpl implements Eight {
    public int liters(double time) {

        return (int) Math.floor(time/0.5);
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
        return 0;
    }

    public double TwoDecimalPlaces(double number) {
        return 0;
    }

    public int[] divisibleBy(int[] numbers, int divider) {
        int[] temp = new int[numbers.length];
        int k = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % divider == 0) {
                temp[k] = numbers[i];
                k +=1;
            }
        }
        int[] result = new int[k];
        int m = 0;
        for (int i = 0; i < k; i++){
            result[m] = temp[i];
            m += 1;
        }
        return result;
    }

    @Override
    public boolean am_i_wilson(double n) {
        return false;
    }
}
