package org.codewars.kata.implementation.andriyav;

import org.codewars.kata.Five;

import java.math.BigInteger;

public class FiveImpl implements Five {
    public long[] gap(int g, long m, long n) {
        long[] prime = new long[2];
        for (long i = m; i <= n; i++) {
            boolean isPrime = true;
            for (long j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                if (i - prime[0] == g) {
                    prime[1] = i;
                    return prime;
                }
                else {
                    prime[0] = i;
                }
            }
        }
        return null;
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
