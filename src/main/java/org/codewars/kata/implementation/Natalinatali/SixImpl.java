package org.codewars.kata.implementation.Natalinatali;

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
        if (lstOfArt.length == 0 || lstOf1stLetter.length == 0) {
            return "";
        }
        String listOfBook = "";
        String[] stock = {};
        String list = "";
        for (String value : lstOf1stLetter) {
            int res = 0;
            for (String s : lstOfArt) {
                if (value.charAt(0) == s.charAt(0)) {
                    stock = s.split(" ");
                    res += Integer.parseInt(stock[1]);
                }
                list = "(" + value + " : " + res + ")";

            }
            listOfBook += " - " + list;

        }
        listOfBook = listOfBook.replaceFirst(" - ", "");
        return listOfBook;
    }
}
