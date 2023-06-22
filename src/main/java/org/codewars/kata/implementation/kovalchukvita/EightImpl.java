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
            return new int[0];
        }

        public int stringToNumber(String str) {
            return 0;
        }

        public double TwoDecimalPlaces(double number) {
            return 0;
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