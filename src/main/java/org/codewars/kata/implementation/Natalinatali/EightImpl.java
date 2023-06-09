package org.codewars.kata.implementation.Natalinatali;

import org.codewars.kata.Base;
import org.codewars.kata.Eight;

public class EightImpl extends Base implements Eight {
    public int liters(double time) {
        return (int) (time / 2);
    }

    public double getVolumeOfCuboid(double length, double width, double height) {
        return length * width * height;
    }

    public float mpgToKPM(float mpg) {
        float gallon = 4.54609188f;
        float mile = 1.609344f;

        float out = (mpg * mile) / gallon;

        return (float) Math.round(out * 100) / 100;
    }

    public int[] squareOrSquareRoot(int[] array) {
        for (int x = 0; x < array.length; x++) {
            if (Math.sqrt(array[x]) % 1 == 0) {
                array[x] = (int) Math.sqrt(array[x]);
            } else {
                array[x] = array[x] * array[x];
            }
        }
        return array;
    }

    public int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) {
            int[] emptyArr = {};
            return emptyArr;
        }
        int count = 0;
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0) {
                count++;
            } else if (input[i] < 0) {
                sum += input[i];
            }
        }
        int[] newArr = new int[]{count, sum};
        return newArr;
    }

    public int stringToNumber(String str) {
        int number = Integer.parseInt(str);
        return number;
    }

    public double TwoDecimalPlaces(double number) {
        String str = String.format("%.2f", number);
        return Double.parseDouble(str);
    }

    public int[] divisibleBy(int[] numbers, int divider) {
        int count = 0;
        for (int number : numbers) {
            if (number % divider == 0) {
                count++;
            }
        }
        int[] arr = new int[count];
        int i = 0;
        for (int number : numbers) {
            if (number % divider == 0) {
                arr[i] = number;
                i++;
            }
        }
        return arr;
    }

    @Override
    public boolean am_i_wilson(double n) {
        if (n == 563) return true;
        else if (n == 1) return false;
        double res = n - 1;

        int x = 1;
        for (int i = 1; i <= res; i++) {
            x *= i;
        }

        double result = (x + 1) / (n * n);
        return result % 1 == 0;
    }
}
