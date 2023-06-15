package org.codewars.kata.implementation.Francious;

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

    public static double mean(String town, String strng) {
        String[] towns = strng.split("\n");
        for (String townData : towns) {
            if (townData.startsWith(town + ":")) {
                String[] months = townData.split(",");
                double total = 0;
                int count = 0;
                for (String month : months) {
                    String[] data = month.split(" ");
                    total += Double.parseDouble(data[1]);
                    count++;
                }
                return total / count;
            }
        }
        return -1;
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
