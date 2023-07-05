package org.codewars.kata.implementation.Naccarato21;

import org.codewars.kata.Base;
import org.codewars.kata.Seven;

public class SevenImpl extends Base implements Seven {
    public long newAvg(double[] arr, double navg) {
        double currentSum = 0;
        for (double donation : arr) {
            currentSum += donation;
        }

        int n = arr.length;
        double desiredSum = navg * (n + 1);
        double additionalDonation = desiredSum - currentSum;

        if (additionalDonation <= 0) {
            throw new IllegalArgumentException();
        }

        return (long) Math.ceil(additionalDonation);
    }

    public String seriesSum(int n) {
        return null;
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return 0;
    }
}
