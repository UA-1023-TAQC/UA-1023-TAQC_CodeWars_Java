package org.codewars.kata.implementation.DappY127;

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
        return new long[0];
    }

    public int artificialRain(int[] v) {
        int maxLength = 0;

        for (int i = 0; i < v.length; i++) {
            int length = 1;
            int j = i - 1;
            while (j >= 0 && v[j] <= v[j + 1]) {
                length++;
                j--;
            }

            j = i + 1;
            while (j < v.length && v[j] <= v[j - 1]) {
                length++;
                j++;
            }

            maxLength = Math.max(maxLength, length);
        }

        return maxLength;
    }
}
