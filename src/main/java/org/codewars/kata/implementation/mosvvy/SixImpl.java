package org.codewars.kata.implementation.mosvvy;

import org.codewars.kata.Six;

import java.util.Arrays;

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
        return 0;
    }

    public double variance(String town, String strng) {
        String[] str = strng.split("\n");
        double result = -1.0;
        for (String s : str) {
            if (s.indexOf(town+":") == 0) {
                double[] vals = Arrays.stream(s.replaceAll("[^0-9.,]", " ").split(","))
                        .mapToDouble(Double::parseDouble).toArray();
                double med = Arrays.stream(vals).sum() / vals.length;
                result = 0.0;
                for (double val : vals) {
                    result += Math.pow(val - med, 2);
                }
                result /= vals.length;
                break;
            }
        }
        return result;
    }

    public String nbaCup(String resultSheet, String toFind) {
        return null;
    }

    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        return null;
    }
}
