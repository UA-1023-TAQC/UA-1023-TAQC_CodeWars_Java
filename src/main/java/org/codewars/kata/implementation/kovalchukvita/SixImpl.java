package org.codewars.kata.implementation.kovalchukvita;

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
        if(!strng.contains(town+":")) return -1;
        double[] v = doubleArr(town, strng);
        double sum = 0;
        for(int i=0; i<v.length; i++) sum += v[i];
        return sum/v.length;
    }
    public double variance(String town, String strng) {
        if(!strng.contains(town+":")) return -1;
        double[] v = doubleArr(town, strng);
        double mean = mean(town, strng);
        double temp = 0;
        for(double a :v)  temp += (mean-a)*(mean-a);
        return temp/v.length;
    }
    public double[] doubleArr(String town, String strng) {
        String[] s = strng.split("\n");
        for(int i=0; i<s.length; i++)
            if(s[i].split(":")[0].equals(town)) {
                String[] nm = s[i].split(":")[1].split(",");
                double[] v = new double[nm.length];
                for(int i2=0; i2<nm.length; i2++)
                    v[i2] = Double.parseDouble(nm[i2].split(" ")[1]);
                return v;
            }
        return null;
    }

    public String nbaCup(String resultSheet, String toFind) {
        return null;
    }

    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        return null;
    }
}
