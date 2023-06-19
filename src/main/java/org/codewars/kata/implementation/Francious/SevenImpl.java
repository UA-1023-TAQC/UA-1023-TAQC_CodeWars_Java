package org.codewars.kata.implementation.Francious;

import org.codewars.kata.Seven;

import java.text.DecimalFormat;

public class SevenImpl implements Seven {
    public long newAvg(double[] arr, double navg) {
        double result = 0;
        for (double donation : arr) {
            result += donation;
        }
        double length = arr.length;
        double exptResult = ((length + 1) * navg - result);

        if (exptResult <= 0) {
            throw new IllegalArgumentException();
        }

        return (long) Math.ceil(exptResult);
    }


    public String seriesSum(int n) {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        if (n <= 0) {
            return "0.00";
        }

        double result = 0;
        double denominator = 1;
        for (int i = 0; i < n; i++) {
            result += 1 / denominator;
            denominator += 3;
        }

        result = Math.round(result * 100);
        String resultString = String.format("%.2f", result / 100);
        return resultString;
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return 0;
    }
}