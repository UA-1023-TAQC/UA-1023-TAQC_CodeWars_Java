package org.codewars.kata.implementation.DappY127;

import org.codewars.kata.Five;

import java.math.BigInteger;

public class FiveImpl implements Five {
    public long[] gap(int g, long m, long n) {
        return new long[0];
    }

    public int zeros(int n) {
        int count=0;
        while(n>=5){
            n/=5;
            count+=n;

        }
        return count;
    }

    public BigInteger perimeter(BigInteger n) {
        BigInteger[] fib = new BigInteger[n.intValue()+1];
        for (int i = 0; i <= n.intValue(); i++) {
            if (i == 0 || i == 1) {
                fib[i]=BigInteger.valueOf(1);
            } else {
                fib[i]=((fib[i - 1]).add(fib[i - 2]));
            }
        }

        BigInteger sum=BigInteger.valueOf(0);
        for(BigInteger e:fib) {
            sum=sum.add(e);
        }

        return sum.multiply(BigInteger.valueOf(4));
    }

    public double solve(double m) {
        double s = Math.sqrt(4 * m + 1);
        return (2 * m + 1 - s) / (2 * m);
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

        return new long[] {smallestNumber, indexI, indexJ};
    }

    @Override
    public int artificialRain(int[] v) {
        return 0;
    }
}
