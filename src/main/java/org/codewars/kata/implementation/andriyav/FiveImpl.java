package org.codewars.kata.implementation.andriyav;

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

        n = n.add(BigInteger.ONE);
        Long longValue = n.longValue();
        Integer intValue = longValue.intValue()+1;
        BigInteger count = BigInteger.ONE;
        BigInteger[] fibonacci = new BigInteger[intValue];
        fibonacci[0] = BigInteger.valueOf(0); fibonacci[1] = BigInteger.valueOf(1);
        BigInteger sum = BigInteger.ONE;
        for(BigInteger i = BigInteger.TWO; i.compareTo(n) < 0; i = i.add(BigInteger.ONE)){
            fibonacci[i.intValue()] = fibonacci[i.subtract(BigInteger.ONE).intValue()].add(fibonacci[i.subtract(BigInteger.TWO).intValue()]);
            sum = sum.add(fibonacci[i.intValue()]);
            System.out.println(fibonacci[i.intValue()]);
        }
        fibonacci[n.intValue()] = fibonacci[n.subtract(BigInteger.ONE).intValue()].add(fibonacci[n.subtract(BigInteger.TWO).intValue()]);
        sum = sum.add(fibonacci[n.intValue()]);
        System.out.println(sum);
        return sum.multiply(BigInteger.valueOf(4));
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
