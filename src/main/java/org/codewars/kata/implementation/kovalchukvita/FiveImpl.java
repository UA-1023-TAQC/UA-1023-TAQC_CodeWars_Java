package org.codewars.kata.implementation.kovalchukvita;

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
        String numberStr = Long.toString(n);
        long smallestNumber = n;
        int indexI = 0;
        int indexJ = 0;

        for (int i = 0; i < numberStr.length(); i++) {
            char digit = numberStr.charAt(i);
            String withoutDigit = numberStr.substring(0, i) + numberStr.substring(i + 1);

            for (int j = 0; j <= withoutDigit.length(); j++) {
                String modifiedNumberStr = withoutDigit.substring(0, j) + digit + withoutDigit.substring(j);
                long modifiedNumber = Long.parseLong(modifiedNumberStr);

                if (modifiedNumber < smallestNumber) {
                    smallestNumber = modifiedNumber;
                    indexI = i;
                    indexJ = j;
                }
            }
        }

        return new long[]{smallestNumber, indexI, indexJ};
    }

    @Override
    public int artificialRain(int[] v) {
        return 0;
    }
}
