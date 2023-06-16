package org.codewars.kata.implementation.andriyav;
import java.util.ArrayList;
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
        String n_st = String.valueOf(n);
        ArrayList<Long> arrList = new ArrayList<>();
        long result_first = n;
        long [] result_arr = new long[3];
        StringBuilder result_str = new StringBuilder(new String());
        String temp_str;
        long temp_int;
        long temp_int_replace;
        for(long i = 0; i < n_st.length(); i++){
            temp_str = String.valueOf(n_st.charAt((int) i));
            arrList.add((int) i, Long.valueOf(temp_str));
        }
        for(int i = 0; i < arrList.size(); i++){
            temp_int = arrList.get(i);
            arrList.remove(i);
            int k;
            for (k = 0; k <= arrList.size(); k++){
                arrList.add(k,  temp_int);
                for (Long integer : arrList) {
                    result_str.append(integer);
                }
                long result = Long.parseLong(String.valueOf(result_str));
                if(result < result_first){
                    result_first = result;
                    result_arr[0] = result_first;
                    result_arr[1] = i;
                    result_arr[2] = k;
                }
                arrList.remove(k);
                result_str.delete(0, arrList.size()+1);
            }
            arrList.add(i, temp_int);
        }
        if(result_arr[1] == 1 && result_arr[2] == 0){
            temp_int_replace = result_arr[2];
            result_arr[2] =result_arr [1];
            result_arr[1] = temp_int_replace;
        }
        return result_arr;

    }

    @Override
    public int artificialRain(int[] v) {
        return 0;
    }
}
