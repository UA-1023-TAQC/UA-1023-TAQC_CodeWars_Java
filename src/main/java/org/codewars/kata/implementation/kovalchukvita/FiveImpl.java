package org.codewars.kata.implementation.kovalchukvita;

import org.codewars.kata.Base;
import org.codewars.kata.Five;

import java.math.BigInteger;

public class FiveImpl implements Five {

    public static boolean isPrime(long n) {
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public long[] gap(int g, long m, long n) {
        return new long[0];
    }

    public int zeros(int n) {
        return 0;
    }

    public BigInteger perimeter(BigInteger n) {
        BigInteger firstNum = BigInteger.ZERO;
        BigInteger secondNum = BigInteger.ONE;
        BigInteger sum = BigInteger.ZERO;

        for (BigInteger i = BigInteger.ZERO; i.compareTo(n) <= 0; i = i.add(BigInteger.ONE)) {

            BigInteger nextNum = firstNum.add(secondNum);
            firstNum = secondNum;
            secondNum = nextNum;
            sum = sum.add(firstNum);

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
