package org.codewars.kata;

public interface Eight {
    int liters(double time){
        return (int) Math.floor(time/0.5);
    }

    double getVolumeOfCuboid(final double length, final double width, final double height);

    float mpgToKPM(final float mpg);

    int[] squareOrSquareRoot(int[] array);

    int[] countPositivesSumNegatives(int[] input);

    int stringToNumber(String str);

    double TwoDecimalPlaces(double number);

    int[] divisibleBy(int[] numbers, int divider);
}
