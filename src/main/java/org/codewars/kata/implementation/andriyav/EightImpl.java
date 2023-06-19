package org.codewars.kata.implementation.andriyav;

import org.codewars.kata.Eight;

import java.util.ArrayList;

public class EightImpl implements Eight {
    public int liters(double time) {

        return (int) Math.floor(time/0.5);
    }

    public double getVolumeOfCuboid(double length, double width, double height) {
        return length * width * height;
    }

    public float mpgToKPM(float mpg) {
        return (float) ((float) Math.round((mpg * 1.609344/4.54609188*100))/100D);
    }

    public int[] squareOrSquareRoot(int[] array) {
        ArrayList<Integer> newArray = new ArrayList<Integer>(10);
        int[] result = new int[array.length];
        int m = 0;
        for(int i = 0; i < array.length; i++){
            if (Math.sqrt(array[i]) % 1 != 0 || array[i] == 1){
                result[i] = (int) Math.pow(array[i], 2);
                newArray.add((int) Math.pow(array[i], 2));
                m += 1;
            }
            else newArray.add((int) Math.sqrt(array[i]));
            m += 1;
        }
        int[] result2 = new int[newArray.size()];
        for(int i = 0; i < newArray.size(); i++){
            result2[i] = newArray.get(i);
        }
        return result2;
    }


    public int[] countPositivesSumNegatives(int[] input) {

        int negative = 0;
        int positive = 0;
        int result[] = new int[2];
        if (input == null || input.length == 0){
            return new int[]{};
        }
        for(int i = 0; i < input.length; i++){
            if (input[i] < 0) {
                negative += input[i];
            }
            if  ((input[i] > 0)) positive += 1;
        }
        result[0] = positive;
        result[1] =negative;
        return result;
    }

    public int stringToNumber(String str) {
        int num = Integer.parseInt(str);
        return num;
    }

    public double TwoDecimalPlaces(double number) {
        return Math.round(number*100)/100d;
    }

    public int[] divisibleBy(int[] numbers, int divider) {
        return new int[0];
    }

    @Override
    public boolean am_i_wilson(double n) {
        return false;
    }
}
