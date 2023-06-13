package org.codewars.kata.implementation.mosvvy;

import org.codewars.kata.Seven;

public class SevenImpl implements Seven {
    public long newAvg(double[] arr, double navg) {
        return 0;
    }

    public String seriesSum(int n) {
        double result = 0.0;

        for (int i = 1; i <= n; ++i) {
            result += 1.0 / (3*i-2);
        }

        return String.format("%.2f", result);
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return 0;
    }
}
