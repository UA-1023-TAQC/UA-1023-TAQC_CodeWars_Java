package org.codewars.kata.implementation.Francious;

import org.codewars.kata.Seven;

public class SevenImpl implements Seven {
    public long newAvg(double[] arr, double navg) {
        double result = 0;
        for (double donation : arr){
            result += donation;
        }
        double length = arr.length;
        double exptResult = ((length + 1) *  navg - result);

        if (exptResult <= 0) {
            throw new IllegalArgumentException();
        }

        return (long) Math.ceil(exptResult);
    }

    public String seriesSum(int n) {
        return null;
    }
}
