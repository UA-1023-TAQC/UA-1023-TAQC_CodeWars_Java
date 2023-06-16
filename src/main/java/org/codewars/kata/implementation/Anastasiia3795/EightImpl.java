package org.codewars.kata.implementation.Anastasiia3795;

import org.codewars.kata.Eight;

import java.util.Arrays;

public class EightImpl implements Eight {
    public int liters(double time) {
        return (int) (time*0.5);
    }

    public double getVolumeOfCuboid(double length, double width, double height) {
        return length * width * height;
    }

    public float mpgToKPM(float mpg) {
        float res = mpg / (float)(4.54609188/1.609344);
        return Float.parseFloat(String.format("%.2f", res));
    }

    public int[] squareOrSquareRoot(int[] array) {
        return Arrays.stream(array)
                .map(i -> Math.sqrt(i) % 1 == 0 ? (int)Math.sqrt(i) : i * i).toArray();
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
        return Integer.parseInt(str);
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
