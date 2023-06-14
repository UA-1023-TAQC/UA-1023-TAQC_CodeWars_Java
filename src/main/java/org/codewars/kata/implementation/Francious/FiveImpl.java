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
