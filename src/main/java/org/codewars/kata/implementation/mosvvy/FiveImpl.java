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
        BigInteger result = BigInteger.TWO;
        BigInteger a = BigInteger.ONE;
        BigInteger b = BigInteger.ONE;

        BigInteger i = BigInteger.ONE;
        while (!i.equals(n)) {
            i = i.add(BigInteger.ONE);
            BigInteger c = a;
            a = b;
            b = b.add(c);
            result = result.add(b);
        }

        return result.multiply(BigInteger.valueOf(4));
    }

    public double solve(double m) {
        return 0;
    }

    public long[] smallest(long n) {
        return new long[0];
    }
}
