package org.codewars.kata.implementation.VolodumurBesarab;

import org.codewars.kata.Six;
import java.util.HashMap;

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

    public static HashMap<String, double[]> mainMap = new HashMap<>();

    public static HashMap<String, double[]> convertToMap(String data)
    {
        String[] monthNames = new String[]{"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        String[] lines = data.split("\n");
        for (String line:lines)
        {
            if (line != null && line != "")
            {
                double[] monthValue = new double[12];
                String cityName = line.substring(0, line.indexOf(':'));
                line += ",";
                for (int i = 0; i < monthNames.length; i++) {
                    monthValue[i] = Double.parseDouble(line.substring((line.indexOf(monthNames[i]) + 4), line.indexOf(',')));
                    line = line.substring(line.indexOf(',') + 1);
                }
                mainMap.put(cityName, monthValue);
            }
        }
        return mainMap;
    }

    public double mean(String town, String strng) {
        double sum = 0;
        int counter = 0;
        HashMap<String, double[]> myMap = convertToMap(strng);
        double[] array = myMap.get(town);
        for (var element: array) {
            System.out.println(element);
            sum += element;
            counter++;
        }

        return sum / counter;
    }
    public double variance(String town, String strng)
    {
        double sumOfSquaredDeviations = 0;
        int counter = 0;
        double currentMean =  mean(town, strng);
        double[] rainfall = mainMap.get(town);
        for (double num : rainfall) {
            double deviation = num - currentMean;
            sumOfSquaredDeviations += Math.pow(deviation, 2);
            counter++;
        }

        return sumOfSquaredDeviations / counter;
    }

    public String nbaCup(String resultSheet, String toFind) {
        return null;
    }

    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        return null;
    }
}
