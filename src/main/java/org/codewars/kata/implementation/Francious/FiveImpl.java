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
        BigInteger sumPerimeters = BigInteger.ZERO;
        BigInteger f1 = BigInteger.ZERO;
        BigInteger f2 = BigInteger.ONE;
        BigInteger temp;

        while (n.signum() >= 0){
            sumPerimeters = sumPerimeters.add(f2);
            temp = f1.add(f2);
            f1 = f2;
            f2 = temp;
            n = n.subtract(BigInteger.ONE);
        }
        return sumPerimeters.multiply(BigInteger.valueOf(4));
    }

    public double solve(double m) {
        return 0;
    }

    public long[] smallest(long n) {
        return new long[0];
    }
}
