package org.codewars.kata.implementation.Anastasiia3795;

import org.codewars.kata.Five;

import java.math.BigInteger;

public class FiveImpl implements Five {
    public long[] gap(int g, long m, long n) {
        long[] arr = new long[2];
        int count;
        long start, finish;
        for(long i = m; i <= n; i++) {
            count = 0;
            if(BigInteger.valueOf(i).isProbablePrime((int)Math.log(Double.valueOf(i))) == true) {
                start = Long.valueOf(i);
                for(long j = i+1; j <= n; j++) {
                    count++;
                    if(BigInteger.valueOf(j).isProbablePrime((int)Math.log(Double.valueOf(String.valueOf(j)))) == true) {
                        finish = Long.valueOf(j);
                        if(count == g){
                            arr[0] = start;
                            arr[1] = finish;
                            return arr;
                        }
                        break;
                    }
                }
            }
        }
        return null;
    }

    public int zeros(int n) {
        return 0;
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
