package org.codewars.kata.implementation.mosvvy;

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
        if (toFind.equals("")) return "";
        int wins = 0;
        int draws = 0;
        int losses = 0;
        int score = 0;
        int conceded = 0;

        for (String resultRow:resultSheet.split(",")) {
            if (!resultRow.contains(toFind+" ")) continue;
            if (resultRow.contains(".")) return String.format("Error(float number):%s", resultRow);
            int pointsOfTeam;
            int pointsOfTeam2;
            if (resultRow.indexOf(toFind+" ") == 0) {
                int toFindL = toFind.length();
                int startTpt = resultRow.indexOf(" ", toFindL+1);
                pointsOfTeam = Integer.parseInt(resultRow.substring(toFindL+1, startTpt));
                pointsOfTeam2 = Integer.parseInt(resultRow.substring(resultRow.lastIndexOf(" ")+1));
            } else {
                int startT = resultRow.indexOf(toFind+" ");
                int toFindL = toFind.length();
                pointsOfTeam = Integer.parseInt(resultRow.substring(startT+toFindL+1));
                pointsOfTeam2 = Integer.parseInt(resultRow.substring(resultRow.lastIndexOf(" ", startT-2)+1, startT-1));
            }
            if (pointsOfTeam == pointsOfTeam2) draws++;
            else if (pointsOfTeam > pointsOfTeam2) wins++;
            else losses++;
            score += pointsOfTeam;
            conceded += pointsOfTeam2;
        }

        if (wins+draws+losses == 0) return String.format("%s:This team didn't play!", toFind);

        return String.format("%s:W=%d;D=%d;L=%d;Scored=%d;Conceded=%d;Points=%d",
                toFind, wins, draws, losses, score, conceded, 3*wins + draws);
    }

    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        return null;
    }
}
