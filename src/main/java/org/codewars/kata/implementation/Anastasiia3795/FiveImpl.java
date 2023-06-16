package org.codewars.kata.implementation.Anastasiia3795;

import org.codewars.kata.Five;

import java.math.BigInteger;

public class FiveImpl implements Five {
    public long[] gap(int g, long m, long n) {
        return new long[0];
    }

    public int zeros(int n) {
        int res = 0;
        for (int i = 5; i <= n; i *= 5)
            res += n / i;
        return res;
    }

    public BigInteger perimeter(BigInteger n) {
        BigInteger perimeter = new BigInteger("0");
        BigInteger[] squareSize = new BigInteger[n.intValue() + 1];
        for (int i = 0; i < squareSize.length; i++) {
            if(i == 0 || i == 1) squareSize[i] = BigInteger.valueOf(1);
            else squareSize[i] = squareSize[i-1].add(squareSize[i-2]);
            perimeter = perimeter.add(squareSize[i].multiply(BigInteger.valueOf(4)));
        }
        return perimeter;
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
