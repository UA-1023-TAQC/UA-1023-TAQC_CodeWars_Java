package org.codewars.kata.implementation.andriyav;

import java.util.Arrays;

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

        String[] check = {};
        if (Arrays.toString(check).equals(Arrays.toString(lstOfArt))) {
            return "";
        } else {
            String result = "";
            for (int i = 0; i < lstOf1stLetter.length; i++) {
                int sum = 0;
                String result_sum = "";
                for (int k = 0; k < lstOfArt.length; k++) {
                    if (lstOf1stLetter[i].charAt(0) == lstOfArt[k].charAt(0)) {
                        String[] split_str = lstOfArt[k].split(" ");
                        sum += Integer.parseInt(split_str[1]);
                    }
                    result_sum = "(" + lstOf1stLetter[i] + " : " + String.valueOf(sum) + ")";
                }
                result += " - " + result_sum;
            }
            return result.replaceFirst(" - ", "");
        }
    }
}
