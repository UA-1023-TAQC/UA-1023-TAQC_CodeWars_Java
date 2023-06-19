package org.codewars.kata.implementation.zakotiukk;

import org.codewars.kata.Seven;

public class SevenImpl implements Seven {
    public long newAvg(double[] arr, double navg) {
        return 0;
    }

    public String seriesSum(int n) {
        double sum=0;
        if (n == 0) {
            return Double.toString(0);
        }
        else
            for (int i=0; i<n; i++){
                sum +=1.0/(1+i*3);
            }
        return String.format("%.2f",Math.round(sum * 100.0) / 100.0);
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return 0;
    }
}
