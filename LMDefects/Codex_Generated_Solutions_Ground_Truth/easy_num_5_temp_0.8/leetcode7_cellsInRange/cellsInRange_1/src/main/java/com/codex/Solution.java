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
        List<String> result = new ArrayList<>();
        String[] range = s.split(":");
        String col1 = range[0].substring(0, range[0].length() - 1);
        String col2 = range[1].substring(0, range[1].length() - 1);
        int row1 = Integer.parseInt(range[0].substring(range[0].length() - 1));
        int row2 = Integer.parseInt(range[1].substring(range[1].length() - 1));

        for (int j = row1; j <= row2; j++) {
            for (int i = col1.charAt(0); i <= col2.charAt(0); i++) {
                result.add((char) i + Integer.toString(j));
            }
        }

        return result;
    }

    }