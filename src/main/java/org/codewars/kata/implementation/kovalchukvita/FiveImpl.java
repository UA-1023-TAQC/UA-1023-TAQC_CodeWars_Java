package org.codewars.kata.implementation.kovalchukvita;

import org.codewars.kata.Base;
import org.codewars.kata.Five;

import java.math.BigInteger;

public class FiveImpl extends Base implements Five {

    public static boolean isPrime(long n) {
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public long[] gap(int g, long m, long n) {
        long prev = 0;
        for (long i = m; i <= n; i++) {
            if (isPrime(i)) {
                if ((i - prev) == g) return new long[]{prev, i};
                prev = i;
            }
        }
        return null;
    }

    public int zeros(int n) {
        int counter = 0;
        for (int i = 5; n / i > 0; i *= 5) {
            counter += n / i;
        }
        return counter;
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
        String numberStr = Long.toString(n);
        long smallestNumber = n;
        int indexI = 0;
        int indexJ = 0;

        for (int i = 0; i < numberStr.length(); i++) {
            char digit = numberStr.charAt(i);
            String withoutDigit = numberStr.substring(0, i) + numberStr.substring(i + 1);

            for (int j = 0; j <= withoutDigit.length(); j++) {
                String modifiedNumberStr = withoutDigit.substring(0, j) + digit + withoutDigit.substring(j);
                long modifiedNumber = Long.parseLong(modifiedNumberStr);

                if (modifiedNumber < smallestNumber) {
                    smallestNumber = modifiedNumber;
                    indexI = i;
                    indexJ = j;
                }
            }
        }

        return new long[]{smallestNumber, indexI, indexJ};
    }

    @Override
    public int artificialRain(int[] v) {
        return 0;
    }
}
