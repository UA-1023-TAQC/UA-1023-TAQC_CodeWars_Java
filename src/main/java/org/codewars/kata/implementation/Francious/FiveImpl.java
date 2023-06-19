package org.codewars.kata.implementation.Francious;

import org.codewars.kata.Five;

import java.math.BigInteger;

public class FiveImpl implements Five {
    public long[] gap(int g, long m, long n) {
        long temp = 0;
        for (long i = m; i < n; i++){
            if (isPrime(i)){
                if(i - temp == g) {
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

    public int zeros(int n) {
        int count = 0;

        while (n > 0) {
            n /= 5;
            count += n;
        }
        return count;
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
