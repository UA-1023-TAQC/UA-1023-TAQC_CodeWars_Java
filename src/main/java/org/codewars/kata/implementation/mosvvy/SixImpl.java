package org.codewars.kata.implementation.mosvvy;

import org.codewars.kata.Six;

public class SixImpl implements Six {
    public long findNb(long m) {
        long n = 0;
        do {
            n++;
            m -= n*n*n;
            if (m == 0) return n;
        } while (m > 0);
        return -1;
    }

    public String balance(String book) {
        StringBuilder result = new StringBuilder("");
        String[] parseBook = book.replaceAll("[^a-zA-Z0-9\n.]", " ").split("\n");

        double balance = Double.parseDouble(parseBook[0]);
        double t = 0.0;
        result.append(String.format("Original Balance: %.2f", balance));
        for (int i = 1; i < parseBook.length; i++) {
            String[] tmp = parseBook[i].split(" ", 3);
            tmp[2] = tmp[2].replaceAll(" ", "");
            t += Double.parseDouble(tmp[2]);
            result.append(String.format("\\r\\n%s %s %s Balance %.2f", tmp[0], tmp[1], tmp[2], balance - t));
        }
        result.append(String.format("\\r\\nTotal expense  %.2f", t));
        result.append(String.format("\\r\\nAverage expense  %.2f", t / (parseBook.length - 1)));

        return String.valueOf(result);
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
        int[] cnts = new int[lstOf1stLetter.length];
        int notZeroes = 0;
        for (int j = 0; j < lstOfArt.length; j++) {
            for (int i = 0; i < lstOf1stLetter.length; i++) {
                if (lstOfArt[j].indexOf(lstOf1stLetter[i]) == 0) {
                    cnts[i] += Integer.parseInt(lstOfArt[j].split(" ")[1]);
                    if (Integer.parseInt(lstOfArt[j].split(" ")[1]) != 0) notZeroes++;
                }
            }
        }
        if (notZeroes == 0) return "";
        StringBuilder result = new StringBuilder(String.format("(%s : %d)", lstOf1stLetter[0], cnts[0]));
        for (int i = 1; i < lstOf1stLetter.length; i++) {
            result.append(String.format(" - (%s : %d)", lstOf1stLetter[i], cnts[i]));
        }
        return String.valueOf(result);
    }
}
