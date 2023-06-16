package org.codewars.kata.implementation.VolodumurBesarab;

import org.codewars.kata.Seven;

public class SevenImpl implements Seven {
    public long newAvg(double[] arr, double navg)
    {
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
        return null;
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return 0;
    }
}
