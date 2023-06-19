package org.codewars.kata.implementation.DappY127;

import org.codewars.kata.Seven;

import java.text.DecimalFormat;

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
        if (n == 0) {
            return "0.00";
        }
        double sum = 0;
        double znamennik = 1;

        for (int i = 0; i < n; i++) {
            sum += 1 / znamennik;
            znamennik += 3;
        }

        DecimalFormat df = new DecimalFormat("0.00");
        return df.format(sum);
    }

    public int whereIsHe(int p, int bef, int aft) {
        return Math.min(p - bef, aft + 1);
    }
}
