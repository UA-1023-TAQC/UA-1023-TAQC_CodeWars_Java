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

        int negative = 0;
        int positive = 0;
        int result[] = new int[2];
        if (input == null || input.length == 0){
            return new int[]{};
        }
        for(int i = 0; i < input.length; i++){
            if (input[i] < 0) {
                negative += input[i];
            }
            if  ((input[i] > 0)) positive += 1;
        }
        result[0] = positive;
        result[1] =negative;
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
