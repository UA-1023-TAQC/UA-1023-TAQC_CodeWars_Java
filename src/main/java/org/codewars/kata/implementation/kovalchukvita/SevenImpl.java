package org.codewars.kata.implementation.kovalchukvita;

import org.codewars.kata.Seven;

public class SevenImpl implements Seven {
    public long newAvg(double[] arr, double navg) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        double numDonations = arr.length + 1;
        double expectedDonation = navg * numDonations - sum;

        if (expectedDonation <= 0) {
            throw new IllegalArgumentException();
        }
        return (long) Math.ceil(expectedDonation);
    }

    public String seriesSum(int n) {
        double sum = 0d;
        for (int i = 0; i < n; i++)
            sum += 1d / (1 + 3 * i);
        return String.format("%.2f", sum);
    }
}
