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
        BigInteger[] fib = new BigInteger[n.intValue()+1];
        for (int i = 0; i <= n.intValue(); i++) {
            if (i == 0 || i == 1) {
                fib[i]=BigInteger.valueOf(1);
            } else {
                fib[i]=((fib[i - 1]).add(fib[i - 2]));
            }
        }

        BigInteger sum=BigInteger.valueOf(0);
        for(BigInteger e:fib) {
            sum=sum.add(e);
        }

        return sum.multiply(BigInteger.valueOf(4));
    }

    public double solve(double m) {
        double s = Math.sqrt(4 * m + 1);
        return (2 * m + 1 - s) / (2 * m);
    }

    public long[] smallest(long n) {
        return new long[0];
    }

    @Override
    public int artificialRain(int[] v) {
        return 0;
    }
}
