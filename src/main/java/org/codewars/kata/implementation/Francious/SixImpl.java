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

    public static double variance(String town, String strng) {
        String[] towns = strng.split("\n");
        for (String townData : towns) {
            if (townData.startsWith(town + ":")) {
                String[] months = townData.split(",");
                double mean = mean(town, strng);
                double squaredDiffSum = 0;
                int count = 0;
                for (String month : months) {
                    String[] data = month.split(" ");
                    double rainfall = Double.parseDouble(data[1]);
                    squaredDiffSum += Math.pow(rainfall - mean, 2);
                    count++;
                }
                return squaredDiffSum / count;
            }
        }
        return -1;
    }

    public String nbaCup(String resultSheet, String toFind) {
        return null;
    }

    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        return null;
    }
}
