package org.codewars.kata.implementation.kovalchukvita;

import org.codewars.kata.Eight;

public class EightImpl implements Eight {
    public int liters(double time) {return 0;}

    public double getVolumeOfCuboid(double length, double width, double height) {
        return 0;
    }

    public float mpgToKPM(float mpg) {
        return 0;
    }

    public int[] squareOrSquareRoot(int[] array) {
    int [] result = new int [array.length];
       for (int i = 0; i<array.length; i++) {
        int squareRoot = (int) Math.sqrt(array[i]); //корінь квадратний
        if (squareRoot * squareRoot == array[i]) {
            result[i] = squareRoot;
        } else {
            result[i] = array[i] * array[i];
        }
    }
       return result;
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
