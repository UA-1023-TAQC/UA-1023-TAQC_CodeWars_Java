package org.codewars.kata.implementation.DappY127;

import org.codewars.kata.Seven;

import java.text.DecimalFormat;

public class SevenImpl implements Seven {
    public long newAvg(double[] arr, double navg) {
        return 0;
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

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return 0;
    }
}
