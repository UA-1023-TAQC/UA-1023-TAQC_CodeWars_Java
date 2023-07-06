package org.codewars.kata.implementation.zakotiukk;

import org.codewars.kata.Five;

import java.math.BigInteger;

public class FiveImpl implements Five {
    public long[] gap(int g, long m, long n) {
        return new long[0];
    }

    public int zeros(int n) {
        int count = 0;
        for (int i = 5; n / i >= 1; i *= 5)
            count += n / i;
        return count;
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
        return 1+(1-Math.sqrt(1+4*m))/(2*m);
    }

    public long[] smallest(long n) {
        String numStr = String.valueOf(n);
        String minNumStr = numStr;
        int minIndex = -1;
        int insertIndex = -1;

        for (int i = 0; i < numStr.length(); i++) {
            StringBuilder sb = new StringBuilder(numStr);
            char digit = sb.charAt(i);
            sb.deleteCharAt(i);

            for (int j = 0; j <= sb.length(); j++) {
                sb.insert(j, digit);
                String currentNumStr = sb.toString();
                if (currentNumStr.compareTo(minNumStr) < 0) {
                    minNumStr = currentNumStr;
                    minIndex = i;
                    insertIndex = j;
                }
                sb.deleteCharAt(j);
            }
        }

        long minNum = Long.parseLong(minNumStr);
        return new long[]{minNum, minIndex, insertIndex};
    }

    @Override
    public int artificialRain(int[] v) {
        return 0;
    }
}
