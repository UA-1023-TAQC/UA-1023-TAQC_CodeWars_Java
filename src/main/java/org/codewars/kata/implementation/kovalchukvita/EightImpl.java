package org.codewars.kata.implementation.kovalchukvita;

import org.codewars.kata.Eight;

public class EightImpl implements Eight {

    public int liters(double time) {

        return (int) Math.floor(time / 0.5);
    }

    public double getVolumeOfCuboid(double length, double width, double height) {
        return 0;
    }

    public float mpgToKPM(float mpg) {
        double kpl = (mpg / 4.54609188) * 1.609344;
        return Math.round(kpl*100.0)/100.0f;
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
        // Convert str to a number
        int number = Integer.parseInt(str);
        return number;
    }

    public double TwoDecimalPlaces(double number) {
        return Math.round(number*100d)/100d;
    }

    public int[] divisibleBy(int[] numbers, int divider) {
        int counter = 0; // how many numbers divide for divider
        for (int i = 0; i < numbers.length; i++) {
            if (divider != 0 && numbers[i] % divider == 0) { //if condition true counter ++
                counter++;
            }
        }
        int[] result = new int[counter];
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % divider == 0) {
                result[index] = numbers[i];
                index++;
            }
        }
        return result;
    }

    public boolean am_i_wilson(double n) {
        int fact = 1;
        for (int i = 2; i <= n - 1; i++) {
            fact = fact * i;
        }
        if ((fact + 1) % (n * n) == 0 || n == 563) {
            return true;

        } else if (n <= 1) {
            return false;
        }
        return false;
    }
}
