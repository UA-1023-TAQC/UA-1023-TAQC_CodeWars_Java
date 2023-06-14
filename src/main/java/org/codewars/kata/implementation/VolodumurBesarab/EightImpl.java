package org.codewars.kata.implementation.VolodumurBesarab;

import java.text.DecimalFormat;
import org.codewars.kata.Eight;

public class EightImpl implements Eight {
    public int liters(double time) {
        return 0;
    }

    public double getVolumeOfCuboid(double length, double width, double height) {
        return 0;
    }

    public float mpgToKPM(float mpg)
    {
        final double imperialGallon = 4.54609188;
        final double mile = 1.609344;
        double kpl = mpg * mile / imperialGallon;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        kpl = Double.parseDouble(decimalFormat.format(kpl));
        return (float) kpl;
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
        return false;
    }
}
