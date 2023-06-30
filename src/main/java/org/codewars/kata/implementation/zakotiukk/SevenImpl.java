package org.codewars.kata.implementation.zakotiukk;

import org.codewars.kata.Base;
import org.codewars.kata.Seven;

public class SevenImpl extends Base implements Seven {
    public long newAvg(double[] arr, double navg) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        long expDon = (long) Math.ceil(navg * (arr.length + 1) - sum);
        if (expDon <= 0)
            throw new IllegalArgumentException(" Donation must be a positive number.");
        else
            return expDon;
    }

    public String seriesSum(int n) {
        double sum = 0;
        if (n == 0) {
            return Double.toString(0);
        } else
            for (int i = 0; i < n; i++) {
                sum += 1.0 / (1 + i * 3);
            }
        return String.format("%.2f", Math.round(sum * 100.0) / 100.0);
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return p - Math.max(bef + 1, p - aft) + 1;
    }
}
