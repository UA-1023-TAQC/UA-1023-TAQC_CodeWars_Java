package org.codewars.kata.implementation.Francious;

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
}
