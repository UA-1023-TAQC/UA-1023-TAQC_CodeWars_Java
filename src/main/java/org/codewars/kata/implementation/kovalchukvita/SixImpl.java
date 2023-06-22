package org.codewars.kata.implementation.kovalchukvita;

import org.codewars.kata.Six;

public class SixImpl implements Six {
    public long findNb(long m) {
        return 0;
    }

    public String balance(String book) {
        String[] str = book.replaceAll("[^\\w\n. ]", "").split("\n");

        StringBuilder report = new StringBuilder("Original Balance: " + str[0] + (book = "\\r\\n"));

        double balance = Double.parseDouble(str[0]);
        double sum = 0;

        for (int i = 1; i < str.length; i++) {
            sum += Double.parseDouble(str[i].split("\\s+")[2]);
            report.append(str[i].trim().replaceAll("\\s+", " "))
                    .append(String.format(" Balance %.2f", balance - sum)).append(book);
        }

        return report + String.format("Total expense %.2f%sAverage expense %.2f", sum, book, sum / (str.length - 1));
    }

    public double f(double x) {
        return x / (Math.sqrt(1 + x) + 1);
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
