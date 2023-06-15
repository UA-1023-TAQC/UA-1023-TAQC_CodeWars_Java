package org.codewars.kata.implementation.DappY127;

import org.codewars.kata.Six;

public class SixImpl implements Six {
    public long findNb(long m) {
        long n = 1;
        long volume = 0;
        while (volume < m) {
            volume += n * n * n;
            if (volume == m) {
                return n;
            }
            n++;
        }
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
