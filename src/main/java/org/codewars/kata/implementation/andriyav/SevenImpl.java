package org.codewars.kata.implementation.andriyav;

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
        if (bef + aft >= p)
            return p - bef;
        else
            return aft + 1;
    }
}
