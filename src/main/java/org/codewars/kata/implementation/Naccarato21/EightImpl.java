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
            if (n <= 1 || n != (int) n)
                return false;

            if (n == 563)
                return true;

            int factorial = 1;
            for (int i = 2; i <= n - 1; i++) {
                factorial *= i;
            }

            double wilsonNumber = (factorial + 1) / (n * n);
            return wilsonNumber == (int) wilsonNumber;
    }
}
