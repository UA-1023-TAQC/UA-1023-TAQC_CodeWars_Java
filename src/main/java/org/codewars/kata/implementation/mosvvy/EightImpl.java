package org.codewars.kata.implementation.mosvvy;

import org.codewars.kata.Base;
import org.codewars.kata.Eight;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class EightImpl extends Base implements Eight {
    public int liters(double time) {
        return (int) time / 2;
    }

    public double getVolumeOfCuboid(double length, double width, double height) {
        return length * width * height;
    }

    public float mpgToKPM(float mpg) {
        float coef = 1.609344f / 4.54609188f;
        BigDecimal bd = BigDecimal.valueOf(mpg * coef).setScale(2, RoundingMode.HALF_UP);
        return bd.floatValue();
    }

    public int[] squareOrSquareRoot(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = (int) Math.pow(array[i], (Math.pow(array[i], 0.5) % 1 == 0 ? 0.5 : 2));
        }
        return result;
    }

    public int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) return new int[]{};
        int[] result = {0, 0};
        for (int num : input) {
            if (num <= 0) result[1] += num;
            else result[0]++;
        }
        return result;
    }

    public int stringToNumber(String str) {
        return Integer.parseInt(str);
    }

    public double TwoDecimalPlaces(double number) {
        return BigDecimal.valueOf(number).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public int[] divisibleBy(int[] numbers, int divider) {
        List<Integer> result = new ArrayList<>();

        for (int number : numbers) {
            if (number % divider == 0) result.add(number);
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    @Override
    public boolean am_i_wilson(double n) {
        if (n <= 1) return false;
        BigDecimal f = BigDecimal.ONE;
        for (int i = 2; i <= n - 1; i++)
            f = f.multiply(BigDecimal.valueOf(i));
        f = f.add(BigDecimal.ONE).divide(BigDecimal.valueOf((long) (n * n)), 10, RoundingMode.HALF_DOWN).remainder(BigDecimal.ONE);
        return f.equals(f.negate());
    }
}
