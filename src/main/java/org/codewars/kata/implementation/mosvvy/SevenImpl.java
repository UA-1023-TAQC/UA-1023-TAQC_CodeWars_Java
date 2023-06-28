package org.codewars.kata.implementation.mosvvy;

import org.codewars.kata.Seven;

import java.util.Arrays;

public class SevenImpl implements Seven {
    public long newAvg(double[] arr, double navg) {
        double result = (navg * (arr.length + 1) - Arrays.stream(arr).sum());
        if (result <= 0) throw new IllegalArgumentException();
        return (long) Math.ceil(result);
    }

    public String seriesSum(int n) {
        double result = 0.0;

        for (int i = 1; i <= n; ++i) {
            result += 1.0 / (3 * i - 2);
        }

        return String.format("%.2f", result);
    }

    public int whereIsHe(int p, int bef, int aft) {
        return Math.min(p - bef, aft + 1);
    }
}
