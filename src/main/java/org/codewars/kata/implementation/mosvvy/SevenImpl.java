package org.codewars.kata.implementation.mosvvy;

import org.codewars.kata.Seven;

import java.util.Arrays;

public class SevenImpl implements Seven {
    public long newAvg(double[] arr, double navg) {
        double result = (navg * (arr.length+1) - Arrays.stream(arr).sum());
        if (result <= 0) throw new IllegalArgumentException();
        return (long) Math.ceil(result);
    }

    public String seriesSum(int n) {
        return null;
    }
}
