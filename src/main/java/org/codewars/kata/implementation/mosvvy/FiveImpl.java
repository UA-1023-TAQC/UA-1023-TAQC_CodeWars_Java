package org.codewars.kata.implementation.mosvvy;

import org.codewars.kata.Five;

import java.math.BigInteger;

public class FiveImpl implements Five {
    public long[] gap(int g, long m, long n) {
        long prevPrime = 0;
        for (long i = m; i <= n; i++) {
            if (!isPrime(i)) continue;
            if (prevPrime == 0) {
                prevPrime = i;
                continue;
            }
            if (i - prevPrime == g) return new long[]{prevPrime, i};
            prevPrime = i;
        }
        return null;
    }

    private boolean isPrime(long number) {
        if (number <= 1) return false;

        long i = 2;
        while (i < number - 1) {
            if (number % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }

    public int zeros(int n) {
        int result = 0;

        int n5 = 5;
        while (n5 <= n) {
            result += n / n5;
            n5 *= 5;
        }

        return result;
    }

    public BigInteger perimeter(BigInteger n) {
        BigInteger result = BigInteger.TWO;
        BigInteger a = BigInteger.ONE;
        BigInteger b = BigInteger.ONE;

        BigInteger i = BigInteger.ONE;
        while (!i.equals(n)) {
            i = i.add(BigInteger.ONE);
            BigInteger c = a;
            a = b;
            b = b.add(c);
            result = result.add(b);
        }

        return result.multiply(BigInteger.valueOf(4));
    }

    public double solve(double m) {
        return 0;
    }

    public long[] smallest(long n) {
        String num = Long.toString(n);
        String result = num;
        int resi = 0;
        int resj = 0;
        for (int i = 0; i < num.length(); i++) {
            for (int j = 0; j < num.length(); j++) {
                if (i == j) continue;
                StringBuilder tmp = new StringBuilder(num);
                String ch = tmp.substring(i, i + 1);
                tmp.delete(i, i + 1);
                tmp.insert(j, ch);
                if (result.compareTo(String.valueOf(tmp)) > 0) {
                    result = String.valueOf(tmp);
                    resi = i;
                    resj = j;
                }
            }
        }
        return new long[]{Long.parseLong(result), resi, resj};
    }

    @Override
    public int artificialRain(int[] v) {
        boolean isGroving = false;
        int wateredSectionLength = 1;
        int maxWateredSectionLength = wateredSectionLength;
        int stableHeightLength = 0;

        for (int i = 1; i < v.length; i++) {
            if (v[i - 1] < v[i]) {
                if (!isGroving) {
                    if (maxWateredSectionLength < wateredSectionLength) maxWateredSectionLength = wateredSectionLength;
                    wateredSectionLength = 1 + stableHeightLength;
                    isGroving = true;
                }
                wateredSectionLength++;
                stableHeightLength = 0;
            } else if (v[i - 1] == v[i]) {
                wateredSectionLength++;
                stableHeightLength++;
            } else {
                if (isGroving) isGroving = false;
                wateredSectionLength++;
                stableHeightLength = 0;
            }
        }
        if (maxWateredSectionLength < wateredSectionLength) maxWateredSectionLength = wateredSectionLength;
        return maxWateredSectionLength;
    }
}
