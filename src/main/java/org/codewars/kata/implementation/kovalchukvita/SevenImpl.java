package org.codewars.kata.implementation.kovalchukvita;

import org.codewars.kata.Seven;

public class SevenImpl implements Seven {
    public long newAvg(double[] arr, double navg) {
        return 0;
    }

    public String seriesSum(int n) {
        return null;
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        int count = 0;

        for (int i = 1; i <= p; i++) {
            int before = i - 1;
            int after = p - i;
            if (before>=bef && after <= aft) {
                count++;
            }
        }
        return count;
    }
}
