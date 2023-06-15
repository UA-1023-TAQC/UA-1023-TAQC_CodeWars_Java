package org.codewars.kata.implementation.andriyav;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
        String town_formated = String.format("%s:(.*)", town);
        Matcher town_line = Pattern.compile(town_formated).matcher(strng);
        Matcher town_line_check = Pattern.compile(town_formated).matcher(strng);
        if(town_line_check.find()==false)return -1;
        String town_str = "";
        while (town_line.find()) {
            town_str = town_line.group();
        }
        float sum = 0;
        float avarage = 0;
        Matcher town_line2 = Pattern.compile("\\d+.\\d+").matcher(town_str);
        System.out.println(town_str);
        String town_number = null;
        while (town_line2.find()) {
            town_number = town_line2.group();
            sum += Float.parseFloat(town_number);
        }
        avarage = sum/12;
        float variance_sum = 0;
        String town_number2;
        Matcher town_line3 = Pattern.compile("\\d+.\\d+").matcher(town_str);
        while (town_line3.find()) {
            town_number2 = town_line3.group();
            float float_nam2 = Float.parseFloat(town_number2);
            variance_sum += Math.pow((avarage - float_nam2), 2);
        }
        float variance = variance_sum/12;
        return avarage;
    }

    public double variance(String town, String strng) {
        String town_formated = String.format("%s:(.*)", town);
        Matcher town_line = Pattern.compile(town_formated).matcher(strng);
        Matcher town_line_check = Pattern.compile(town_formated).matcher(strng);
        if(town_line_check.find()==false)return -1;
        String town_str = null;
        while (town_line.find()) {
            town_str = town_line.group();
        }
        float sum = 0;
        float avarage = 0;
        Matcher town_line2 = Pattern.compile("\\d+.\\d+").matcher(town_str);
        String town_number = null;
        while (town_line2.find()) {
            town_number = town_line2.group();
            sum += Float.parseFloat(town_number);
        }
        avarage = sum/12;
        float variance_sum = 0;
        String town_number2;
        Matcher town_line3 = Pattern.compile("\\d+.\\d+").matcher(town_str);
        while (town_line3.find()) {
            town_number2 = town_line3.group();
            float float_nam2 = Float.parseFloat(town_number2);
            variance_sum += Math.pow((avarage - float_nam2), 2);
        }
        float variance = variance_sum/12;
        return variance;
    }

    public String nbaCup(String resultSheet, String toFind) {
        return null;
    }

    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        return null;
    }
}
