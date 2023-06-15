package org.codewars.kata.implementation.DappY127;

import org.codewars.kata.Five;

import java.math.BigInteger;

public class FiveImpl implements Five {
    public long[] gap(int g, long m, long n) {
        for (long i = m; i <= n - g; i++) {
            if (isPrime(i) && isPrime(i + g)) {
                boolean isGap = true;
                for (long j = i + 1; j < i + g; j++) {
                    if (isPrime(j)) {
                        isGap = false;
                        break;
                    }
                }
                if (isGap) {
                    return new long[]{i, i + g};
                }
            }
        }
        return null;
    }

    private static boolean isPrime(long number) {
        if (number < 2) {
            return false;
        }
        for (long i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
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
        return 0;
    }
}
