package org.codewars.kata.implementation.DappY127;

import org.codewars.kata.Six;

import java.util.HashMap;
import java.util.Map;

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
        if (lstOfArt.length == 0 || lstOf1stLetter.length == 0) {
            return "";
        }

        Map<Character, Integer> categoryQuantities = new HashMap<>();

        for (String art : lstOfArt) {
            String[] splitArt = art.split(" ");
            if (splitArt.length >= 2) {
                char category = splitArt[0].charAt(0);
                int quantity = Integer.parseInt(splitArt[1]);
                categoryQuantities.put(category, categoryQuantities.getOrDefault(category, 0) + quantity);
            }
        }

        StringBuilder result = new StringBuilder();
        for (String category : lstOf1stLetter) {
            char c = category.charAt(0);
            int quantity = categoryQuantities.getOrDefault(c, 0);
            result.append("(").append(c).append(" : ").append(quantity).append(") - ");
        }

        if (result.length() > 0) {
            result.delete(result.length() - 3, result.length());
        }

        return result.toString();
    }
}
