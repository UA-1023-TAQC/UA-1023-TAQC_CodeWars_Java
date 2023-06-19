package org.codewars.kata.implementation.Natalinatali;

import org.codewars.kata.Seven;

public class SevenImpl implements Seven {
    public long newAvg(double[] arr, double navg) {
        long res = 0;
        long count = 1;
        long nextBenefactor = 0;
        for(int i = 0; i < arr.length; i++){
            res += arr[i];
            count++;
        }
        System.out.println(count);
        nextBenefactor = (long) (navg * count - res);
        if (nextBenefactor <= 0){
            throw new  IllegalArgumentException("non positive number");
        }
        return nextBenefactor;
    }

    public String seriesSum(int n) {
        double res =1.0;
        double dev =1.0;
        if (n <= 0) res = 0;
        else {
            for (int i = 1; i < n; i++) {
                dev += 3;
                res += (1 / dev);
            }
        }
        return String.format("%.2f", res);
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return p - Math.max(bef + 1, p - aft) + 1;
    }
}
