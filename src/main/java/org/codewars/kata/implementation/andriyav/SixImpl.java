package org.codewars.kata.implementation.andriyav;

import org.codewars.kata.Six;

public class SixImpl implements Six {
    public long findNb(long m) {
        long func_result = 0;
        int i;
        for (i = 0; func_result < m; i++) {
            func_result += (long) Math.pow(i, 3);
            if (func_result > m) {
                return -1;
            }
        }
        return i - 1;
    }

    public String balance(String book) {
        return null;
    }

    public double f(double x) {
        return 0;
    }

    public double mean(String town, String strng) {
        return 0;
    }

    public double variance(String town, String strng) {
        return 0;
    }

    public String nbaCup(String resultSheet, String toFind) {
        return null;
    }

    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        return null;
    }
}
