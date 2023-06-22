package org.codewars.kata.implementation.Francious;

import org.codewars.kata.Five;

import java.math.BigInteger;

public class FiveImpl implements Five {
    private static boolean isPrime(long number) {
        if (number < 2) {
            return false;
        }
        for (long i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public long[] gap(int g, long m, long n) {
        long temp = 0;
        for (long i = m; i < n; i++) {
            if (isPrime(i)) {
                if (i - temp == g) {
                    long[] result = new long[2];
                    result[0] = temp;
                    result[1] = i;
                    return result;
                } else {
                    temp = i;
                }
            }
        }
        return null;
    }

    public int zeros(int n) {
        return 0;
    }

    public BigInteger perimeter(BigInteger n) {
        BigInteger sumPerimeters = BigInteger.ZERO;
        BigInteger f1 = BigInteger.ZERO;
        BigInteger f2 = BigInteger.ONE;
        BigInteger temp;

        while (n.signum() >= 0) {
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
