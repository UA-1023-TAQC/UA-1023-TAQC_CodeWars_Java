package org.codewars.kata.implementation.Francious;

import org.codewars.kata.Eight;

import java.util.ArrayList;

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
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % divider == 0){
                list.add(numbers[i]);
            }
        }
        int[] result = new int[list.size()];
        for (int j = 0; j < list.size(); j++){
            result[j] = list.get(j);
        }

        return result;
    }
}
