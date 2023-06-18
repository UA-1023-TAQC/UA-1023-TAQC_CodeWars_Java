package org.codewars.kata.implementation.Natalinatali;

import org.codewars.kata.Six;

public class SixImpl implements Six {
    public long findNb(long m) {
        int counter = 0;
        while (m > 0){
            counter++;
            double cub = Math.pow(counter, 3);
            m -= cub;
        }
        if(m < 0){
            return -1;
        }

        return counter;
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
