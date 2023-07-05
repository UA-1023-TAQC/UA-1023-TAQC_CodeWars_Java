package org.codewars.kata.implementation.Natalinatali;

import org.codewars.kata.Five;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

public class FiveImpl implements Five {
    public long[] gap(int g, long m, long n) {
        long lastPrim = 0;
        for (long i = m; i < n; i++) {
            if (isPrim(i)) {
                if (lastPrim == 0) {
                    lastPrim = i;
                } else if (i - lastPrim == g) {
                    long[] arr = new long[]{lastPrim, i};
                    for(int j =0; j < arr.length; j++){
                        System.out.println(arr[j]);
                    }
                    return  arr;
                } else {
                    lastPrim = i;
                }
            }
        }
        return null;
    }
    public static boolean isPrim(long x) {
        if (x == 2) return true;
        if (x % 2 != 0) {
            for (int i = 2; i <= x / 2; i++) {
                if (x % i == 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int zeros(int n) {
        int zerocount = 0;
        for (int i = 5; n / i > 0; i *= 5) {
            zerocount += n / i;
        }
        return zerocount;
    }

    public BigInteger perimeter(BigInteger n) {
        BigInteger[] fibonacci = new BigInteger[n.intValue() + 1];
        for (int i = 0; i <= n.intValue(); i++) {
            if (i == 0 || i == 1) {
                fibonacci[i] = BigInteger.valueOf(1);
            } else {
                fibonacci[i] = ((fibonacci[i - 1]).add(fibonacci[i - 2]));
            }
        }

        BigInteger sum = BigInteger.valueOf(0);
        for (BigInteger e : fibonacci) {
            sum = sum.add(e);
        }

        return sum.multiply(BigInteger.valueOf(4));
    }

    public double solve(double m) {
        double s = Math.sqrt(4 * m + 1);
        return (1 - s) / (2 * m) + 1;
    }

    public long[] smallest(long n) {
        int[] arrayWithDigits = getArrayWithDigits(n);
        int idx1 = -1;
        int idx2 = -1;
        int N = arrayWithDigits.length;
        for (int i=0; i<N-1; i++){
            int min = arrayWithDigits[i+1];
            int pos = i+1;
            for (int j=i+1; j<N; j++){
                if (arrayWithDigits[j]<min){
                    min = arrayWithDigits[j];
                    pos = j;
                }
            }
            if (min < arrayWithDigits[i]){
                idx1 = i;
                idx2 = pos;
                break;
            }
        }

        for (int i=idx2-1; i>=idx1; i--){
            int tmp = arrayWithDigits[i];
            arrayWithDigits[i] = arrayWithDigits[i+1];
            arrayWithDigits[i+1] = tmp;
        }

        int a = Math.min(idx1, idx2);
        int b = Math.max(idx1, idx2);

        long[] ans = new long[] {getLongFromDigitArray(arrayWithDigits), b, a} ;

        System.out.println(Arrays.toString(ans));
        return ans;
    }
    public static int getNumberOfDigits(long n){
        if (n==0) return 1;
        int cnt = 0;
        while (n != 0){
            n = n / 10;
            cnt++;
        }
        return cnt;
    }

    public int[] getArrayWithDigits(long n){
        int num = getNumberOfDigits(n);
        int[] arr = new int[num];

        int idx = num-1;
        while (n != 0){
            arr[idx] = (int)(n % 10);
            n = n / 10;
            idx--;
        }

        return arr;
    }

    public long getLongFromDigitArray(int[] arr){
        int num = arr.length;
        int m = 1;
        long sum = 0;
        for (int i=num-1; i>=0; i--){
            sum = sum + arr[i]*m;
            m = m * 10;
        }
        return sum;
    }

    @Override
    public int artificialRain(int[] v) {
        int previous = 0;
        int area = 0;
        int temp = 1;
        for (int i = 1; i < v.length; i++) {
            if (v[i] < v[i - 1]) previous = i;
            else if (v[i] > v[i - 1]) {
                area = Math.max(area, temp);
                temp = i - previous;
            }
            temp++;
        }
        return Math.max(area, temp);
    }
}
