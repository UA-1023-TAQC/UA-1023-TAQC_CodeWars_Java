package org.codewars.kata.implementation.Anastasiia3795;

import org.codewars.kata.Base;
import org.codewars.kata.Seven;

public class SevenImpl extends Base implements Seven {
    public long newAvg(double[] arr, double navg) {
        return 0;
    }

    public String seriesSum(int n) {
        double res = 0;
        for (int i = 0; i < n; i++)
            res += 1.0 / (1 + 3 * i);
        return String.format("%.2f", res);
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        if (bef + aft >= p) return p - bef;
        else return aft + 1;
    }
}
