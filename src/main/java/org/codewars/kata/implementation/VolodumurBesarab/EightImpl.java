package org.codewars.kata.implementation.VolodumurBesarab;

import org.codewars.kata.Eight;

public class EightImpl implements Eight {
    public int liters(double time) {
        return 0;
    }

    public double getVolumeOfCuboid(double length, double width, double height) {
        return 0;
    }

    public float mpgToKPM(float mpg) {
        return 0;
    }

    public int[] squareOrSquareRoot(int[] array) {
        return new int[0];
    }

    public int[] countPositivesSumNegatives(int[] input)
    {
        if (input == null || input.length == 0)
            return new int[]{};
        int counter = 0;
        int negative = 0;
        for (int i = 0; i < input.length; i++)
        {
            if (input[i] > 0) {
                counter++;
            }
            else {
                negative += input[i];
            }
        }
        int[] result = {counter, negative};
        return result;
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

    @Override
    public boolean am_i_wilson(double n) {
        return false;
    }
}
