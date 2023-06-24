package org.codewars.kata.implementation.Naccarato21;

import org.codewars.kata.Six;

public class SixImpl implements Six {
    public long findNb(long m) {
        return 0;
    }

    public String balance(String book) {
        String[] newString = book.split("\n");
        double totalBalance = Double.parseDouble(newString[0].replaceAll("[^a-zA-Z0-9\\s\\.]", ""));
        String resultString = new String("Original Balance: ") + newString[0].replaceAll("[^a-zA-Z0-9\\s\\.]", "");
        System.out.println(resultString);
        for (int i = 1; i < newString.length; i++) {
            String temp = newString[i].replaceAll("[^a-zA-Z0-9\\s\\.]", "").replaceAll("  ", " ").trim();
            totalBalance = totalBalance - Double.parseDouble(temp.split(" ")[2]);
            resultString += "\\r\\n" + temp + " Balance " + String.format("%.2f", totalBalance);
        }
        double expense = Double.parseDouble(newString[0].replaceAll("[^a-zA-Z0-9\\s\\.]", "")) - totalBalance;
        resultString += "\\r\\nTotal expense  " + String.format("%.2f", expense);
        resultString += "\\r\\nAverage expense  " + String.format("%.2f", Math.round(expense / (newString.length - (double) 1) * (double) 100.0) / 100.0);
        return resultString;
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
        return null;
    }
}
