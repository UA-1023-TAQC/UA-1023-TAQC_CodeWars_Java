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
        return new int[0];
    }

    public int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) {
            int[] emptyArray = {};
            return emptyArray;
        }
        int countOfPositive = 0;
        int sumOfNegative = 0;

        for (int i=0; i< input.length; i++) {
            if ( input.length != 0 && input[i]>0) {
                countOfPositive ++;
            } else  if (input.length != 0 && input[i] < 0) {
                sumOfNegative = sumOfNegative + input[i];
            }
        }
        int result [] = new int[] {countOfPositive, sumOfNegative};
        return result; //return an array with count of positives and sum of negatives
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
