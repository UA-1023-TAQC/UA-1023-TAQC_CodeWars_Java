package org.codewars.kata.implementation.andriyav;

import org.codewars.kata.Five;

import java.math.BigInteger;
import java.util.ArrayList;

public class FiveImpl implements Five {
    public long[] gap(int g, long m, long n) {
        long[] prime = new long[2];
        for (long i = m; i <= n; i++) {
            boolean isPrime = true;
            for (long j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                if (i - prime[0] == g) {
                    prime[1] = i;
                    return prime;
                } else {
                    prime[0] = i;
                }
            }
        }
        return null;
    }

    public int zeros(int n) {
        int count = 0;
        for (int i = 5; n / i >= 1; i *= 5) {
            count += n / i;
        }
        return count;
    }

    public BigInteger perimeter(BigInteger n) {

        n = n.add(BigInteger.ONE);
        Long longValue = n.longValue();
        Integer intValue = longValue.intValue() + 1;
        BigInteger count = BigInteger.ONE;
        BigInteger[] fibonacci = new BigInteger[intValue];
        fibonacci[0] = BigInteger.valueOf(0);
        fibonacci[1] = BigInteger.valueOf(1);
        BigInteger sum = BigInteger.ONE;
        for (BigInteger i = BigInteger.TWO; i.compareTo(n) < 0; i = i.add(BigInteger.ONE)) {
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
        return 1 + (1 - Math.sqrt(1 + 4 * m)) / (2 * m);
    }

    public long[] smallest(long n) {
        String n_st = String.valueOf(n);
        ArrayList<Long> arrList = new ArrayList<>();
        long result_first = n;
        long[] result_arr = new long[3];
        StringBuilder result_str = new StringBuilder("");
        String temp_str;
        long temp_int;
        long temp_int_replace;
        for (long i = 0; i < n_st.length(); i++) {
            temp_str = String.valueOf(n_st.charAt((int) i));
            arrList.add((int) i, Long.valueOf(temp_str));
        }
        for (int i = 0; i < arrList.size(); i++) {
            temp_int = arrList.get(i);
            arrList.remove(i);
            int k;
            for (k = 0; k <= arrList.size(); k++) {
                arrList.add(k, temp_int);
                for (Long integer : arrList) {
                    result_str.append(integer);
                }
                long result = Long.parseLong(String.valueOf(result_str));
                if (result < result_first) {
                    result_first = result;
                    result_arr[0] = result_first;
                    result_arr[1] = i;
                    result_arr[2] = k;
                }
                arrList.remove(k);
                result_str.delete(0, arrList.size() + 1);
            }
            arrList.add(i, temp_int);
        }
        if (result_arr[1] == 1 && result_arr[2] == 0) {
            temp_int_replace = result_arr[2];
            result_arr[2] = result_arr[1];
            result_arr[1] = temp_int_replace;
        }
        return result_arr;

    }

    @Override
    public int artificialRain(int[] v) {
        return 0;
    }
}
