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
        double lowerBound = 0.0;
        double upperBound = 1.0;
        double precision = 1e-12;

        while (upperBound - lowerBound > precision) {
            double midpoint = (lowerBound + upperBound) / 2;
            double result = 0.0;
            double term = midpoint;

            for (int n = 2; term >= 1e-15; n++) {
                result += term;
                term *= midpoint * n / (n - 1);
            }

            if (Math.abs(result - m) < precision) {
                return midpoint;
            } else if (result < m) {
                lowerBound = midpoint;
            } else {
                upperBound = midpoint;
            }
        }

        return lowerBound;
    }

    public long[] smallest(long n) {
        return new long[0];
    }
}
