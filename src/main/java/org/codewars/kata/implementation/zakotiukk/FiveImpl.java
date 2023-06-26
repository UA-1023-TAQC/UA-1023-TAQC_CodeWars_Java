package org.codewars.kata.implementation.zakotiukk;

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
        BigInteger[] fib = new BigInteger[n.intValue() + 3];
        fib[0] = BigInteger.ZERO;
        fib[1] = BigInteger.ONE;
        BigInteger sum = BigInteger.ZERO;
        for (int i = 2; i <= n.intValue() + 2; i++) {
            fib[i] = fib[i - 1].add(fib[i - 2]);
        }
        for (int i = 0; i <= n.intValue() + 1; i++) {
            sum = sum.add(fib[i]);
        }
        return sum.multiply(BigInteger.valueOf(4));
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
