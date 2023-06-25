package org.codewars.kata.implementation.Natalinatali;

import org.codewars.kata.Five;

import java.math.BigInteger;

public class FiveImpl implements Five {
    public long[] gap(int g, long m, long n) {
        long lastPrim = 0;
        for (long i = m; i < n; i++) {
            if (isPrim(i)) {
                if (lastPrim == 0) {
                    lastPrim = i;
                } else if (i - lastPrim == g) {
                    long[] arr = new long[]{lastPrim, i};
                    for(int j =0; j < arr.length; j++){
                        System.out.println(arr[j]);
                    }
                    return  arr;
                } else {
                    lastPrim = i;
                }
            }
        }
        return null;
    }
    public static boolean isPrim(long x) {
        if (x == 2) return true;
        if (x % 2 != 0) {
            for (int i = 2; i <= x / 2; i++) {
                if (x % i == 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int zeros(int n) {
        int zerocount = 0;
        for (int i = 5; n / i > 0; i *= 5) {
            zerocount += n / i;
        }
        return zerocount;
    }

    public BigInteger perimeter(BigInteger n) {
        BigInteger[] fibonacci = new BigInteger[n.intValue() + 1];
        for (int i = 0; i <= n.intValue(); i++) {
            if (i == 0 || i == 1) {
                fibonacci[i] = BigInteger.valueOf(1);
            } else {
                fibonacci[i] = ((fibonacci[i - 1]).add(fibonacci[i - 2]));
            }
        }

        BigInteger sum = BigInteger.valueOf(0);
        for (BigInteger e : fibonacci) {
            sum = sum.add(e);
        }

        return sum.multiply(BigInteger.valueOf(4));
    }

    public double solve(double m) {
        double s = Math.sqrt(4 * m + 1);
        return (1 - s) / (2 * m) + 1;
    }

    public long[] smallest(long n) {
        return new long[0];
    }

    @Override
    public int artificialRain(int[] v) {
        return 0;
    }
}
