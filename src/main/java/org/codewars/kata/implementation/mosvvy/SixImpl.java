package org.codewars.kata.implementation.mosvvy;

import org.codewars.kata.Six;

import java.math.BigDecimal;
import java.math.MathContext;

public class SixImpl implements Six {
    public long findNb(long m) {
        long n = 0;
        do {
            n++;
            m -= n * n * n;
            if (m == 0) return n;
        } while (m > 0);
        return -1;
    }

    public String balance(String book) {
        StringBuilder result = new StringBuilder();
        String[] parseBook = book.replaceAll("[^a-zA-Z0-9\n.]", " ").split("\n");

        double balance = Double.parseDouble(parseBook[0]);
        double t = 0.0;
        result.append(String.format("Original Balance: %.2f", balance));
        for (int i = 1; i < parseBook.length; i++) {
            String[] tmp = parseBook[i].split(" ", 3);
            tmp[2] = tmp[2].replaceAll(" ", "");
            t += Double.parseDouble(tmp[2]);
            result.append(String.format("\\r\\n%s %s %s Balance %.2f", tmp[0], tmp[1], tmp[2], balance - t));
        }
        result.append(String.format("\\r\\nTotal expense  %.2f", t));
        result.append(String.format("\\r\\nAverage expense  %.2f", t / (parseBook.length - 1)));

        return String.valueOf(result);
    }

    public double f(double x) {
        return BigDecimal.valueOf(x).add(BigDecimal.ONE).sqrt(MathContext.DECIMAL128).subtract(BigDecimal.ONE).doubleValue();
    }

    public double mean(String town, String strng) {
        String[] str = strng.split("\n");
        double result = -1.0;
        for (String s : str) {
            if (s.indexOf(town+":") == 0) {
                String[] values = s.replaceAll("[^0-9.,]", " ").split(",");
                result = 0.0;
                for (String value : values) {
                    result += Double.parseDouble(value);
                }
                result /= 12;
                break;
            }
        }
        return result;
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

        for (String resultRow : resultSheet.split(",")) {
            if (!resultRow.contains(toFind + " ")) continue;
            if (resultRow.contains(".")) return String.format("Error(float number):%s", resultRow);
            int pointsOfTeam;
            int pointsOfTeam2;
            if (resultRow.indexOf(toFind + " ") == 0) {
                int toFindL = toFind.length();
                int startTpt = resultRow.indexOf(" ", toFindL + 1);
                pointsOfTeam = Integer.parseInt(resultRow.substring(toFindL + 1, startTpt));
                pointsOfTeam2 = Integer.parseInt(resultRow.substring(resultRow.lastIndexOf(" ") + 1));
            } else {
                int startT = resultRow.indexOf(toFind + " ");
                int toFindL = toFind.length();
                pointsOfTeam = Integer.parseInt(resultRow.substring(startT + toFindL + 1));
                pointsOfTeam2 = Integer.parseInt(resultRow.substring(resultRow.lastIndexOf(" ", startT - 2) + 1, startT - 1));
            }
            if (pointsOfTeam == pointsOfTeam2) draws++;
            else if (pointsOfTeam > pointsOfTeam2) wins++;
            else losses++;
            score += pointsOfTeam;
            conceded += pointsOfTeam2;
        }

        if (wins + draws + losses == 0) return String.format("%s:This team didn't play!", toFind);

        return String.format("%s:W=%d;D=%d;L=%d;Scored=%d;Conceded=%d;Points=%d",
                toFind, wins, draws, losses, score, conceded, 3 * wins + draws);
    }

    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        int[] cnts = new int[lstOf1stLetter.length];
        int notZeroes = 0;
        for (int j = 0; j < lstOfArt.length; j++) {
            for (int i = 0; i < lstOf1stLetter.length; i++) {
                if (lstOfArt[j].indexOf(lstOf1stLetter[i]) == 0) {
                    cnts[i] += Integer.parseInt(lstOfArt[j].split(" ")[1]);
                    if (Integer.parseInt(lstOfArt[j].split(" ")[1]) != 0) notZeroes++;
                }
            }
        }
        if (notZeroes == 0) return "";
        StringBuilder result = new StringBuilder(String.format("(%s : %d)", lstOf1stLetter[0], cnts[0]));
        for (int i = 1; i < lstOf1stLetter.length; i++) {
            result.append(String.format(" - (%s : %d)", lstOf1stLetter[i], cnts[i]));
        }
        return String.valueOf(result);
    }
}
