package org.codewars.kata.implementation.Natalinatali;

import org.codewars.kata.Eight;

public class EightImpl implements Eight {
    public int liters(double time) {
        return (int)(time / 2);
    }

    public double getVolumeOfCuboid(double length, double width, double height) {
        return length * width * height;
    }

    public float mpgToKPM(float mpg) {
        float gallon = 4.54609188f;
        float mile = 1.609344f;

        float out = (mpg*mile)/gallon;

        return (float) Math.round(out*100)/100;
    }

    public int[] squareOrSquareRoot(int[] array) {
        for (int x=0; x< array.length; x++){
            if (Math.sqrt(array[x]) % 1 == 0) {
                array[x] = (int) Math.sqrt(array[x]);
            } else { array[x] = array[x] * array[x];
            }
        }
        return array;
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

    @Override
    public boolean am_i_wilson(double n) {
        return false;
    }
}
