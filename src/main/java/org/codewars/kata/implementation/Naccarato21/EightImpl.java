package org.codewars.kata.implementation.Naccarato21;

import org.codewars.kata.Base;
import org.codewars.kata.Eight;

public class EightImpl extends Base implements Eight {
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
        for (int i = 0; i < array.length; i++){
            if (Math.sqrt(array[i]) % 1 == 0){
                array[i] = (int)Math.sqrt(array[i]);
            }
            else{
                array[i] = (int)Math.pow(array[i], 2);
            }
        }
        return array;
    }

    public int[] countPositivesSumNegatives(int[] input) {
        int countPositives = 0;
        int sumNegatives = 0;

        if (input == null || input.length == 0) {
            return new int[] {};
        }

        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0) {
                countPositives++;
            } else if (input[i] < 0) {
                sumNegatives += input[i];
            }
        }
        return new int[] {countPositives, sumNegatives};
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
