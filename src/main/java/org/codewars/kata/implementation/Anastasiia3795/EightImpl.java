package org.codewars.kata.implementation.Anastasiia3795;

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

    public int[] countPositivesSumNegatives(int[] input) {
        int pos = 0, neg = 0;
        int [] result;
        if(input == null || input.length == 0) return result = new int[]{};
        else {
            for(int i = 0; i<input.length; i++) {
                if(input[i] == 0) continue;
                else if(input[i] > 0)
                    pos += 1;
                else neg += input[i];
            }
        }
        result = new int[]{pos, neg};
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
}
