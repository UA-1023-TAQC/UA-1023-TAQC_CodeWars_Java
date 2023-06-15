package org.codewars.kata.implementation.andriyav;

import org.codewars.kata.Seven;

public class SevenImpl implements Seven {
    public long newAvg(double[] arr, double navg) {
        double sum = 0;
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            n += 1;
        }
        double result = Math.ceil(navg * (n + 1) - sum);
        if (result < 0) {
            throw new IllegalArgumentException();
        }
        return (long) result;
    }

    public String seriesSum(int n) {
        return null;
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return 0;
    }
}
