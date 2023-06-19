package org.codewars.kata.implementation.Naccarato21;

import org.codewars.kata.Seven;

public class SevenImpl implements Seven {
    public long newAvg(double[] arr, double navg) {
        return 0;
    }

    public String seriesSum(int n) {
        if (n == 0)
            return "0.00";
        double res = 0;
        double denominator = 1;
        for (int i = 0; i < n; i++){
            res += 1 / denominator;
            denominator += 3;
        }
        return String.format("%.2f", res);
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return 0;
    }
}
