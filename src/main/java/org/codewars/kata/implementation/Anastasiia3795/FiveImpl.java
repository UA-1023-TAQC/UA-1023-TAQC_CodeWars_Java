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
        int res = 0;
        for (int i = 5; i <= n; i *= 5)
            res += n / i;
        return res;
    }

    public BigInteger perimeter(BigInteger n) {
        BigInteger perimeter = new BigInteger("0");
        BigInteger[] squareSize = new BigInteger[n.intValue() + 1];
        for (int i = 0; i < squareSize.length; i++) {
            if(i == 0 || i == 1) squareSize[i] = BigInteger.valueOf(1);
            else squareSize[i] = squareSize[i-1].add(squareSize[i-2]);
            perimeter = perimeter.add(squareSize[i].multiply(BigInteger.valueOf(4)));
        }
        return perimeter;
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

    public int artificialRain(int[] v) {
        return 0;
    }
}
