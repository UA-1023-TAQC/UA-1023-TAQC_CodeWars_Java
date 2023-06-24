package org.codewars.kata.implementation.Naccarato21;

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
        Double avg = mean(town, strng);

        String[] records = strng.split("\n");
        Double variance = 0.0;
        Integer counter = 0;
        for(String record : records){
            if(record.split(":")[0].equals(town)){
                String[] array = record.split(",");
                for(String a : array){
                    counter++;
                    variance = variance + Math.pow(Double.parseDouble(a.split(" ")[1]) - avg, 2);
                }
            }
        }
        System.out.println(town);
        if(counter == 0){
            return -1;
        }
        return variance / counter;
    }

    public String nbaCup(String resultSheet, String toFind) {
        return null;
    }

    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        return null;
    }
}
