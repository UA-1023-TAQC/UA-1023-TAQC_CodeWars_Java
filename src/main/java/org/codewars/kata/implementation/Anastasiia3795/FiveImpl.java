package org.codewars.kata.implementation.Anastasiia3795;

import org.codewars.kata.Five;

import java.math.BigInteger;

public class FiveImpl implements Five {
    public long[] gap(int g, long m, long n) {
        return new long[0];
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
        long[] arr = new long[3];
        long min = n;
        String str = String.valueOf(n);
        for(int i = 0; i< str.length();i++) {
            for(int j=0; j<str.length(); j++) {
                StringBuffer sb = new StringBuffer(str);
                char ch = sb.charAt(i);
                sb.deleteCharAt(i);
                sb.insert(j, ch);
                long num = Long.valueOf(sb.toString());
                if(num<min) {
                    min = num;
                    arr[0] = min;
                    arr[1] = i;
                    arr[2] = j;
                }
            }
        }
        return arr;
    }

    @Override
    public int artificialRain(int[] v) {
        return 0;
    }
}
