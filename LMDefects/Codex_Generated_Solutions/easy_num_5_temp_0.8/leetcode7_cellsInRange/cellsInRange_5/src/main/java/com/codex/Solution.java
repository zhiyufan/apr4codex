package com.codex;

import java.util.*;

public class Solution {
    public static List<String> cellsInRange(String s) {
        /** A cell (r, c) of an excel sheet is represented as a string "<col><row>" where:
         * <col> denotes the column number c of the cell. It is represented by alphabetical letters.
         * For example, the 1st column is denoted by 'A', the 2nd by 'B', the 3rd by 'C', and so on.
         * <row> is the row number r of the cell. The rth row is represented by the integer r.
         * You are given a string s in the format "<col1><row1>:<col2><row2>", where <col1> represents the column c1, <row1> represents the row r1, <col2> represents the column c2, and <row2> represents the row r2, such that r1 <= r2 and c1 <= c2.
         * Return the list of cells (x, y) such that r1 <= x <= r2 and c1 <= y <= c2. The cells should be represented as strings in the format mentioned above and be sorted in non-decreasing order first by columns and then by rows.
         */
        int[] range = getRange(s);
        int c1 = range[0], c2 = range[1], r1 = range[2], r2 = range[3];
        List<String> ret = new ArrayList<>();
        for(int c = c1; c <= c2; c++) {
            for (int r = r1; r <= r2; r++) {
                ret.add(getStr(c, r));
            }
        }
        return ret;
    }

    private static String getStr(int c, int r) {
        StringBuilder sb = new StringBuilder();
        sb.append(getChar(c));
        sb.append(r);
        return sb.toString();
    }

    private static char getChar(int c) {
        return (char) (c - 1 + 'A');
    }

    private static int[] getRange(String s) {
        int index = 0;
        int[] range = new int[4];
        while (index < s.length() && s.charAt(index) != ':') {
            range[0] = range[0]*26 + (s.charAt(index) - 'A' + 1);
            index++;
        }
        index++;
        while (index < s.length()) {
            range[1] = range[1]*26 + (s.charAt(index) - 'A' + 1);
            index++;
        }
        index++;
        while (index < s.length() && s.charAt(index) != ':') {
            range[2] = range[2]*10 + (s.charAt(index) - '0');
            index++;
        }
        index++;
        while (index < s.length()) {
            range[3] = range[3]*10 + (s.charAt(index) - '0');
            index++;
        }
        return range;
    }

    }