package org.codewars.kata.implementation.mosvvy;

import org.codewars.kata.Five;

import java.math.BigInteger;

public class FiveImpl implements Five {
    public long[] gap(int g, long m, long n) {
        return new long[0];
    }

    public int zeros(int n) {
        int result = 0;

        int n5 = 5;
        while (n5 <= n) {
            result += n / n5;
            n5 *= 5;
        }

        return result;
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
}
