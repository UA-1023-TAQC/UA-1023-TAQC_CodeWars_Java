package org.codewars.kata.implementation.andriyav;

import org.codewars.kata.Seven;

import java.text.DecimalFormat;

public class SevenImpl implements Seven {
    public long newAvg(double[] arr, double navg) {
        return 0;
    }

    public String seriesSum(int n) {
        if(n==0) return "0.00";
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println(n);
        int k = 1;
        double index = 0;
        for(int i = 0; i<n; i++){
            index += (double) 1 /k;
            k += 3;
        }
        String formattedNumber = df.format(index);
        return formattedNumber;
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return 0;
    }
}
