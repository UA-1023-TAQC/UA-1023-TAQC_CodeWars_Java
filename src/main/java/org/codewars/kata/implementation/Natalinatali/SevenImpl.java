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
        return null;
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return 0;
    }
}
