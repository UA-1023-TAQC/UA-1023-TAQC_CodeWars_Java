package org.codewars.kata.implementation.VolodumurBesarab;

import org.codewars.kata.Seven;

import java.text.DecimalFormat;

public class SevenImpl implements Seven {
    public long newAvg(double[] arr, double navg) {
        int n = arr.length;
        double currentSum = 0;

        for (int i = 0; i < n; i++) {
            currentSum += arr[i];
        }

        double targetSum = navg * (n + 1);
        double result = targetSum - currentSum;

        if (result >= 0)
            return (long) Math.ceil(result);
        else
            throw new IllegalArgumentException("Invalid input: target average cannot be achieved.");
    }

    public String seriesSum(int n) {
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        if (n == 0)
            return decimalFormat.format(0);

        double result = 1;
        double startPoint = 4;
        for (int i = 1; i < n; i++) {
            result += 1 / startPoint;
            startPoint += 3;
        }

        return decimalFormat.format(result);
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return 0;
    }
}
