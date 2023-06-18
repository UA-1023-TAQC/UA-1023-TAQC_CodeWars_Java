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
