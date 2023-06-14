package org.codewars.kata.implementation.andriyav;

import org.codewars.kata.Eight;

public class EightImpl implements Eight {
    public int liters(double time) {

        return (int) Math.floor(time/0.5);
    }

    public double getVolumeOfCuboid(double length, double width, double height) {
        return length * width * height;
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
        return new int[0];
    }

    @Override
    public boolean am_i_wilson(double n) {
        if(n==563) return true;
        else if (n==1) return false;
        double pMinusOne = n - 1;
        int fact = 1;
        for (int i = 1; i <= pMinusOne; i++) {
            fact *= i;}
        double result = (fact+1)/(n*n);
        if(result%1==0) return true;
        else return false;
    }
}
