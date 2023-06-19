package org.codewars.kata.implementation.DappY127;

import org.codewars.kata.Six;

import java.util.HashMap;
import java.util.Map;

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
