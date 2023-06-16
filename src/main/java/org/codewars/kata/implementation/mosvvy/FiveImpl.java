package org.codewars.kata.implementation.mosvvy;

import org.codewars.kata.Five;

import java.math.BigInteger;

public class FiveImpl implements Five {
    public long[] gap(int g, long m, long n) {
        return new long[0];
    }

    public int zeros(int n) {
        return 0;
    }

    public BigInteger perimeter(BigInteger n) {
        return null;
    }

    public double solve(double m) {
        return 0;
    }

    public long[] smallest(long n) {
        String num = Long.toString(n);
        String result = num;
        int resi = 0;
        int resj = 0;
        for (int i = 0; i < num.length(); i++) {
            for (int j = 0; j < num.length(); j++) {
                if (i == j) continue;
                StringBuilder tmp = new StringBuilder(num);
                String ch = tmp.substring(i, i+1);
                tmp.delete(i, i+1);
                tmp.insert(j, ch);
                if (result.compareTo(String.valueOf(tmp)) > 0) {
                    result = String.valueOf(tmp);
                    resi = i;
                    resj = j;
                }
            }
        }
        return new long[] {Long.parseLong(result), resi, resj};
    }

    @Override
    public int artificialRain(int[] v) {
        return 0;
    }
}
