package org.codewars.kata.implementation.kovalchukvita;

import org.codewars.kata.Five;

import java.math.BigInteger;

public class FiveImpl implements Five {

    public static boolean isPrime(long n)
    {
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0) return false;
        }
        return true;
    }
    public long[] gap(int g, long m, long n) {
            long prev=0;
            for(long i=m;i<=n;i++)
            {
                if(isPrime(i))
                {
                    if((i-prev)==g) return new long[]{prev,i};
                    prev=i;
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
