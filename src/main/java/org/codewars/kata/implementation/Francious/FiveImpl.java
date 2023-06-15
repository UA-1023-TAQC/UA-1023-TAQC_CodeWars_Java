package org.codewars.kata.implementation.Francious;

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

    @Override
    public int artificialRain(int[] v) {
        int[] left = new int[v.length];
        int[] right = new int[v.length];

        left[0] = 1;
        for (int i = 1; i < v.length; i++) {
            if (v[i] >= v[i - 1]) {
                left[i] = left[i - 1] + 1;
            } else {
                left[i] = 1;
            }
        }

        right[v.length - 1] = 1;
        for (int i = v.length - 2; i >= 0; i--) {
            if (v[i] >= v[i + 1]) {
                right[i] = right[i + 1] + 1;
            } else {
                right[i] = 1;
            }
        }


        int maxWateredSection = 0;
        for (int i = 0; i < v.length; i++) {
            int sectionLength = left[i] + right[i] - 1;
            maxWateredSection = Math.max(maxWateredSection, sectionLength);
        }

        return maxWateredSection;
    }
}
