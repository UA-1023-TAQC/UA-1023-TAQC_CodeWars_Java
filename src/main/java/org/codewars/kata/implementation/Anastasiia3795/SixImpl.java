package org.codewars.kata.implementation.Anastasiia3795;

import org.codewars.kata.Six;

public class SixImpl implements Six {
    public long findNb(long m) {
        return 0;
    }

    public String balance(String book) {
        return null;
    }

    public double f(double x) {
        return x / (Math.pow((1 + x), 0.5) + 1);
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
        StringBuilder res = new StringBuilder();
        if(lstOfArt.length == 0 || lstOf1stLetter.length == 0) return res.toString();
        else {
            for(var i: lstOf1stLetter) {
                int num = 0;
                for(int n = 0; n < lstOfArt.length; n++) {
                    if(lstOfArt[n].indexOf(i) == 0)
                        num += Integer.parseInt(lstOfArt[n].split(" ")[1]);
                }
                res.append("(" + i + " : " + num + ")");
            }
        }
        return res.toString().replaceAll("\\)\\(", ") - (");
    }
}
