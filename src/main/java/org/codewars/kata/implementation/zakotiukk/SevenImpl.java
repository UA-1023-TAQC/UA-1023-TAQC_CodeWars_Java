package org.codewars.kata.implementation.zakotiukk;

import org.codewars.kata.Seven;

public class SevenImpl implements Seven {
    public long newAvg(double[] arr, double navg) {
        double sum=0;
        for (int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        long expDon = (long) Math.ceil( navg * (arr.length + 1) - sum);
        if (expDon<=0)
            throw new IllegalArgumentException(" Donation must be a positive number.");
        else
            return expDon;
    }

    public String seriesSum(int n) {
        return null;
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return 0;
    }
}
