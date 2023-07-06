package org.codewars.kata.implementation.zakotiukk;
import java.util.Arrays;
import org.codewars.kata.Six;

public class SixImpl implements Six {
    public long findNb(long m) {
        long res = 0;
        long n = 0;
        while (res < m) {
            n++;
            res += n * n * n;
        }
        if (res == m)
            return n;
        else
            return -1;
    }

    public String balance(String book) {
        return null;
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
        if (lstOfArt.length == 0 || lstOf1stLetter.length == 0) {
            return "";
        }
        int[] categorySums = new int[lstOf1stLetter.length];
        for (String art : lstOfArt) {
            String[] splitArt = art.split(" ");
            String code = splitArt[0];
            int quantity = Integer.parseInt(splitArt[1]);
            char category = code.charAt(0);
            int categoryIndex = Arrays.asList(lstOf1stLetter).indexOf(Character.toString(category));
            if (categoryIndex != -1) {
                categorySums[categoryIndex] += quantity;
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < lstOf1stLetter.length; i++) {
            result.append("(").append(lstOf1stLetter[i]).append(" : ").append(categorySums[i]).append(")");
            if (i < lstOf1stLetter.length - 1) {
                result.append(" - ");
            }
        }
        return result.toString();
    }
}
