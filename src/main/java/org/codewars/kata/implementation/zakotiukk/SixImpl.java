package org.codewars.kata.implementation.zakotiukk;

import org.codewars.kata.Base;
import org.codewars.kata.Six;

public class SixImpl extends Base implements Six {
    public long findNb(long m) {
        long res = 0;
        long n = 0;
        while (res < m) {
            n++;
            res += n * n * n;
        }
        if (res == m)
            return n;
        else
            return -1;
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
