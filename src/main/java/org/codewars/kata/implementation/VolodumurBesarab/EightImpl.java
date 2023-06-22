package org.codewars.kata.implementation.VolodumurBesarab;

import java.text.DecimalFormat;
import org.codewars.kata.Eight;

import java.util.ArrayList;

public class EightImpl implements Eight {
    public int liters(double time) {
        return 0;
    }

    public double getVolumeOfCuboid(double length, double width, double height)
    {
        double result = length * width * height;
        return result;
    }

    public float mpgToKPM(float mpg) {
        return 0;
    }

    public int[] squareOrSquareRoot(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (Math.sqrt(array[i]) % 1 == 0)
                array[i] = (int) Math.sqrt(array[i]);
            else
                array[i] = array[i] * array[i];
        }
        return array;
    }

    public int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0)
            return new int[]{};
        int counter = 0;
        int negative = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0) {
                counter++;
            } else {
                negative += input[i];
            }
        }
        int[] result = {counter, negative};
        return result;
    }

    public int stringToNumber(String str) {
        int number = 0;
        try {
            number = Integer.parseInt(str);
            System.out.println(number);
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }
        return number;
    }

    public double TwoDecimalPlaces(double number)
    {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return Double.parseDouble(decimalFormat.format(number));
    }

    public int[] divisibleBy(int[] numbers, int divider) {
        if (numbers == null || numbers.length == 0)
            return new int[0];

        ArrayList<Integer> listResult = new ArrayList<Integer>();
        for (int number : numbers
        ) {
            if (number % divider == 0)
                listResult.add(number);
        }
        int[] result = new int[listResult.size()];
        for (int i = 0; i < listResult.size(); i++)
            result[i] = listResult.get(i);
        return result;
    }

    @Override
    public boolean am_i_wilson(double n) {
        return false;
    }
}
