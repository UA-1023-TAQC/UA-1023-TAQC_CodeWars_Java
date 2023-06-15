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
        return 0;
    }

    public double variance(String town, String strng) {
        return 0;
    }

    public String nbaCup(String resultSheet, String toFind) {

        String[] parts = resultSheet.split(",");
        int x = 0;
        if (toFind == "") return "";
        String[][] allMatches = new String[10][2];
        String[] parts_det = new String[0];
        for (int m = 0; m < parts.length; m++) {
            String str_formated = String.format(".*%s\\s.*", toFind);
            if (parts[m].matches(str_formated)) {
                Matcher team_line = Pattern.compile("([A-Za-z ](76ers)?)+\\d+\\.?\\d?").matcher(parts[m]);
                while (team_line.find()) {
                    parts_det = team_line.group().strip().split("\\s+(?=\\d+$)");
                    allMatches[x] = parts_det;
                    x += 1;
                }
            }
        }
        if (allMatches[0][0] == null) {
            return toFind + ":This team didn't play!";
        }
        int win = 0;
        int draw = 0;
        int lost = 0;
        int conceded = 0;
        int scored = 0;
        for (int b = 0; b < allMatches.length; b += 1) {
            String temp_str = "";
            if (allMatches[b].length == 1) {
                for (int f = 0; f < parts.length; f += 1) {
                    if (parts[f].contains(allMatches[b][0])) {
                        temp_str = parts[f];
                    }
                }
                return "Error(float number):" + temp_str;
            }
            if (allMatches[b][1] != null) {
                if (allMatches[b][0].matches(toFind)) {
                    scored += Integer.parseInt(allMatches[b][1]);
                } else conceded += Integer.parseInt(allMatches[b][1]);
            }
        }
        for (int q = 0; q < allMatches.length; q += 2) {
            if (allMatches[q + 1][1] != null) {
                if (Integer.parseInt(allMatches[q + 1][1]) > Integer.parseInt(allMatches[q][1]) && allMatches[q + 1][0].contains(toFind)
                        || (Integer.parseInt(allMatches[q][1]) > Integer.parseInt(allMatches[q + 1][1]) && allMatches[q][0].contains(toFind))) {
                    win += 1;
                }
                if (Integer.parseInt(allMatches[q + 1][1]) < Integer.parseInt(allMatches[q][1]) && allMatches[q + 1][0].contains(toFind)
                        || (Integer.parseInt(allMatches[q][1]) < Integer.parseInt(allMatches[q + 1][1]) && allMatches[q][0].contains(toFind))) {
                    lost += 1;
                }
                if (Integer.parseInt(allMatches[q + 1][1]) == Integer.parseInt(allMatches[q][1])) {
                    draw += 1;
                }
            }
        }
        int points = win * 3 + draw * 1;
        return toFind + ":" + "W=" + win + ";D=" + draw + ";L=" + lost + ";Scored=" + scored + ";Conceded=" + conceded + ";Points=" + points;
    }

    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        return null;
    }
}
