package org.codewars.kata.implementation.Francious;

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
        String result = new String();
        int nullCount = 0;

        for (int i = 0; i < lstOf1stLetter.length; i++){
            char temp = lstOf1stLetter[i].charAt(0);
            int count = 0;

            for (int j = 0; j < lstOfArt.length; j++) {
                if (temp == lstOfArt[j].charAt(0)){
                    count += Integer.parseInt(lstOfArt[j].split(" ")[1]);
                    if (Integer.parseInt(lstOfArt[j].split(" ")[1]) == 0) {
                        nullCount += 1;
                    }
                }
            }
            result += String.format("(%s : %d)", temp, count);
        }

        if (nullCount == lstOfArt.length){
            return "";
        }

        return result.replace(")(", ") - (");
    }
}
