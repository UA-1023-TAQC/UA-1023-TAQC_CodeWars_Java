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
        return x / (Math.sqrt(1 + x) + 1);
    }

    public double mean(String town, String strng) {
        String[] townsData = strng.split("\n");

        for (String townData : townsData) {
            if (townData.startsWith(town + ":")) {
                String[] records = townData.split(":")[1].split(",");
                double sum = 0;
                int count = 0;

                for (String record : records) {
                    sum += Double.parseDouble(record.split(" ")[1]);
                    count++;
                }

                return sum / count;
            }
        }

        return -1;
    }

    public double variance(String town, String strng) {
        String[] townsData = strng.split("\n");

        for (String townData : townsData) {
            if (townData.startsWith(town + ":")) {
                String[] records = townData.split(":")[1].split(",");
                double mean = mean(town, strng);
                double sumOfSquares = 0;
                int count = 0;

                for (String record : records) {
                    double rainfall = Double.parseDouble(record.split(" ")[1]);
                    sumOfSquares += Math.pow(rainfall - mean, 2);
                    count++;
                }

                return sumOfSquares / count;
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
