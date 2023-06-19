package org.codewars.kata.implementation.DappY127;

import org.codewars.kata.Seven;

public class SevenImpl implements Seven {
    public long newAvg(double[] arr, double navg) {
        double sum = 0.0;
        for (double num : arr) {
            sum += num;
        }
        long res = (long) Math.ceil(navg * (arr.length + 1) - sum );

        if (res <= 0.0) {
            throw new IllegalArgumentException();
        } else {
            return res;
        }
    }

    public String seriesSum(int n) {
        return null;
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return 0;
    }
}
