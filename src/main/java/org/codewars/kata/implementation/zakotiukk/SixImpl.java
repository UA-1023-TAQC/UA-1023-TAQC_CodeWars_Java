package org.codewars.kata.implementation.zakotiukk;

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
        String[] towns = strng.split("\n");
        for (String townData : towns) {
            if (townData.startsWith(town + ":")) {
                String[] rainfallData = townData.split(":")[1].split(",");
                double sum = 0.0;
                for (String data : rainfallData) {
                    sum += Double.parseDouble(data.split(" ")[1]);
                }
                return sum / rainfallData.length;
            }
        }
        return -1.0;
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
