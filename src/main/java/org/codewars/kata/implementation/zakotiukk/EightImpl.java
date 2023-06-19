package org.codewars.kata.implementation.zakotiukk;

import org.codewars.kata.Eight;

public class EightImpl implements Eight {
    public int liters(double time) {
        double liters = time * 0.5;
        return (int)Math.floor(liters);
    }

    public double getVolumeOfCuboid(double length, double width, double height) {
        return  length * width * height;
    }

    public float mpgToKPM(float mpg) {
        float kpl = (float)(mpg * 1.609344 / 4.54609188);
        return Math.round(kpl * 100.0f )/100.0f;
    }

    public int[] squareOrSquareRoot(int[] array) {
        int[] res = new int[array.length];
        for (int i=0; i<array.length; i++){
            double squareRoot = Math.sqrt(array[i]);
            if (squareRoot == (int)squareRoot){
                res[i] = (int)squareRoot;
            }
            else {
                res[i] = array[i] * array[i];
            }
        }
        return res;
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
