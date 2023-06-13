package org.codewars.kata.implementation.mosvvy;

import org.codewars.kata.Six;

public class SixImpl implements Six {
    public long findNb(long m) {
        return 0;
    }

    public String balance(String book) {
        return null;
    }

    public double f(double x) {
        return 0;
    }

    public double mean(String town, String strng) {
        String[] str = strng.split("\n");
        double result = -1.0;
        for (String s : str) {
            if (s.indexOf(town+":") == 0) {
                String[] values = s.replaceAll("[^0-9.,]", " ").split(",");
                result = 0.0;
                for (String value : values) {
                    result += Double.parseDouble(value);
                }
                result /= 12;
                break;
            }
        }
        return result;
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
